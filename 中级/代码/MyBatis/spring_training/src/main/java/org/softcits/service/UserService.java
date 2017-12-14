package org.softcits.service;

import java.util.List;

import org.softcits.dao.UserMapper;
import org.softcits.model.Pager;
import org.softcits.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public Pager<User> getAllUsers(Integer offset) {

		PageHelper.startPage(offset.intValue(), 3);

		List<User> uList = userMapper.getAllUsers();
		
		PageInfo<User> info = new PageInfo<>(uList);
		
		Pager<User> pu = new Pager<User>();
		
		pu.setRows(uList);
		pu.setTotal(info.getTotal());

		return pu;

	}
}
