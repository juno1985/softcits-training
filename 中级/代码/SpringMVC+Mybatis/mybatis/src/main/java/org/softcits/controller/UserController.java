package org.softcits.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.softcits.common.JsonUtils;
import org.softcits.dto.AjaxObj;
import org.softcits.dto.UserDto;
import org.softcits.model.Group;
import org.softcits.model.User;
import org.softcits.model.UserException;
import org.softcits.service.GroupService;
import org.softcits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin/users")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private GroupService groupService;
	
	@RequestMapping("/list")
	public String getAllUsers(Model model){
		
		List<User> uList = userService.getAllUsers();
		model.addAttribute("ulist", uList);
		
		return "user/list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUserByGet(Model model)
	{
		UserDto user = new UserDto();
		model.addAttribute("userDto", user);
		
		List<Group> gList = groupService.getAllGroups();
		model.addAttribute("glist", gList);
		
		return "user/add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	//BindResult一定要紧跟被验证绑定的model后面
	public String addUserByPost(@Validated UserDto userDto, BindingResult br, Model model, HttpServletRequest req,
			@RequestParam(value="attSrc", required=false)String attSrc)
	{
		if(br.hasErrors()){
			return "user/add";
		}
		
		int gid = userDto.getGid();
		Group g = groupService.getGroupById(gid);
		
		//添加用户
		User u = new User();
		u.setUsername(userDto.getUsername());
		u.setPassword(userDto.getPassword());
		u.setPhone(userDto.getPhone());
		u.setPiclink(attSrc);
		u.setGroup(g);
		
		userService.addUser(u);
		
//		System.out.println("得到的值是: " + attSrc);
		
		return "redirect:/admin/users/list";
	}
	
	@RequestMapping(value="/picUpload", method = RequestMethod.POST)
	//在controller中直接加入HttpServletRequest参数就可以得到request对象
	@ResponseBody 
	public String uploadPic(@RequestParam(value="attach", required=false)MultipartFile attach, HttpServletRequest req) throws IOException{
		String realPath = req.getSession().getServletContext().getRealPath("/resources/upload");
//		System.out.println(realPath);
		/*if(attach.isEmpty()) return "user/add";*/
		
	
		
//		System.out.println("SessionID： " + req.getSession().getId());
		
		/*String[] toGetExt = attach.getOriginalFilename().split("\\.");*/
/*		for(String s : toGetExt)
			System.out.println(s);
		
		*/
		//得到文件擴展名
		String fileExt = FilenameUtils.getExtension(attach.getOriginalFilename());
		//给附件起新名，防止上传同样的文件名产生覆盖
		/*String attName = req.getSession().getId() + "." + fileExt;*/
		String attName = UUID.randomUUID().toString().replaceAll("-", "") + "." + fileExt;
		File pic_f = new File(realPath + "/" + attName);
		
		FileUtils.copyInputStreamToFile(attach.getInputStream(), pic_f);
		
		AjaxObj abj = new AjaxObj();
		abj.setMsg(attName);
		
		return JsonUtils.objectToJson(abj);
	}
	
	@RequestMapping("/delete/{name}")
	public String deleteUser(@PathVariable String name){
		
/*		try {
			//解决中文乱码问题,tomcat默认的字符集是iso-8859，传到controller需要讲其转为utf-8
			String name_C = new String(name.getBytes("ISO-8859-1"),"UTF-8");
			userService.deleteUser(name_C);*/
			userService.deleteUser(name);
	/*	} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		return "redirect:/admin/users/list";
	}
	
	@RequestMapping("/user/{name}")
	public String getUser(@PathVariable String name, Model model){
		//解决中文乱码问题,tomcat默认的字符集是iso-8859，传到controller需要讲其转为utf-8
	
			/*String name_C = new String(name.getBytes("ISO-8859-1"),"UTF-8");
			User user = userService.getUserByName(name_C);*/
			User user = userService.getUserByName(name);
			model.addAttribute("user", user);
			return "user/user";
	}
}
