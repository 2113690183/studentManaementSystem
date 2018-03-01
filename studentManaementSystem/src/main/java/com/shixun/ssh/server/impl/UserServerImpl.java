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

	public void register(UserModel userModel){
		userDaoImpl.register(userModel);
	}
}
