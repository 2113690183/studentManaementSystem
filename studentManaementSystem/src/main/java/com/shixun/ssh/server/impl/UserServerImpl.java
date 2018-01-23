package com.shixun.ssh.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shixun.ssh.dao.impl.UserDaoImpl;
import com.shixun.ssh.modle.UserModel;



@Service
public class UserServerImpl {

	@Autowired
	private UserDaoImpl userDaoImpl;

//	public List<UserModel> getUsers() {
//		return userDaoImpl.getUsers();
//	}
//
//	public void deleteUserModel(UserModel userModel) {
//		userDaoImpl.deleteUserModel(userModel);
//	}
//
//	public UserModel getUser(UserModel userModel) {
//		return userDaoImpl.getUser(userModel);
//	}
//
//	public void edit(UserModel userModel) {
//		userDaoImpl.edit(userModel);
//	}
//	public void add(UserModel userModel) {
//		userDaoImpl.add(userModel);
//	}
	
	public void register(UserModel userModel){
		userDaoImpl.register(userModel);
	}
}
