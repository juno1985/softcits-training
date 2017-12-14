package org.softcits.controller;

import java.util.HashMap;
import java.util.Map;
import org.softcits.model.Pager;
import org.softcits.model.User;
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

@Controller
@RequestMapping("/users")
public class UserController {

	Map<String, User> userMap = new HashMap<String, User>();
	
	@Autowired
	private UserService userService;

/*	public UserController() {
		User u1 = new User(1, "Mark", "123456", "0411123321");
		User u2 = new User(1, "Jimmy", "123456", "0411875433");
		User u3 = new User(1, "Sagen", "123456", "0411457864");
		User u4 = new User(1, "Serene", "123456", "0411346789");
		User u5 = new User(1, "Sara", "123456", "0411445678");

		userMap.put(u1.getUsername(), u1);
		userMap.put(u2.getUsername(), u2);
		userMap.put(u3.getUsername(), u3);
		userMap.put(u4.getUsername(), u4);
		userMap.put(u5.getUsername(), u5);
	}*/

	// 相应GET请求
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listUsers(@RequestParam(value="pager.offset", required=false)Integer offset, Model model) {
		
		if(offset == null) offset = 0;
		
		offset = offset / 3 + 1;
		
		System.out.println("#################: " + offset);
		
		Pager<User> pu = userService.getAllUsers(offset);
		
		model.addAttribute("pagerUser", pu);
		
		return "list";
	}

	@RequestMapping(value = "/{username}")
	public String queryUser(@PathVariable String username, Model model) {
		// 从userMap中找到该user
		User u = userMap.get(username);
		// 封装进model传到jsp中
		model.addAttribute("usr", u);
		return "user";
	}

	@RequestMapping(value = "/delete/{username}")
	public String deleteUser(@PathVariable String username, Model model) {
		// 删除用户
		userMap.remove(username);
		return "redirect:/users/list";
	}

	// http://localhost:8888/spring/users/add
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser(Model model) {

		model.addAttribute("user", new User());

		return "add";
	}

	// 相应POST请求
	// BindingResult参数的位置一定要紧跟被验证对象后
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String listUsers(@Validated User user, BindingResult br, Model model) {
		if (br.hasErrors()) {
			// 如果有错误直接跳转到add视图
			return "add";
		}
		userMap.put(user.getUsername(), user);
		return "redirect:/users/list";
	}

}
