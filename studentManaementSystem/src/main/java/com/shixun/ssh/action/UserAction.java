package com.shixun.ssh.action;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shixun.ssh.modle.RoleModel;
import com.shixun.ssh.modle.UserModel;
import com.shixun.ssh.server.impl.UserServerImpl;

@Component("userAction")
public class UserAction {

	@Autowired
	private UserServerImpl userServerImpl;

//	private List<UserModel> list;
	private UserModel userModel;
	private RoleModel roleModel = new RoleModel(2l);

	public String register() {
		userServerImpl.register(new UserModel("gogogo", "123456", roleModel, new Date()));
		return "register";
	}
	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
