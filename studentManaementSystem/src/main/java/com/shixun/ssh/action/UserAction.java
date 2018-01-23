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
	private RoleModel roleModel = new RoleModel(1L,"teacher");

	//
	// public String findUsers() {
	// list = userServerImpl.getUsers();
	// return "list";
	// }
	//
	// public String delete() {
	// userServerImpl.deleteUserModel(userModel);
	// list = userServerImpl.getUsers();
	// return "index";
	// }
	//
	// public String info() {
	// userModel=userServerImpl.getUser(userModel);
	// return "info";
	// }
	//
	// public String to_edit() {
	// userModel=userServerImpl.getUser(userModel);
	// return "update";
	// }
	//
	// public String do_edit() {
	// userServerImpl.edit(userModel);
	// return "index";
	// }
	// public String addUser() {
	// userServerImpl.add(userModel);
	// return "index";
	// }
	// public String add() {
	// return "add";
	// }
	// public List<UserModel> getList() {
	// return list;
	// }
	//
	public String register() {
		userServerImpl.register(new UserModel("gogogo", "123456", roleModel, new Date()));
		return "register";
	}
	
	public String add(){
		return "add";
	}
	
	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
