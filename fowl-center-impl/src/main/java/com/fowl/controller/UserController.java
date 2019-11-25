package com.fowl.controller;

import com.fowl.manager.usermanager.UserManager;
import com.fowl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserManager userService;
	
	@RequestMapping("/queryUser")
	@ResponseBody
	public void queryList(){
		List<User> list=userService.queryUserList();
		for (User user : list) {
			System.out.println("username:"+user.getUsername()+"\n");
			System.out.println("password:"+user.getPassword()+"\n");
		}
	}

}
