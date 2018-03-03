package com.shixun.ssh.server.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shixun.ssh.dao.impl.RoleDaoImpl;
import com.shixun.ssh.modle.RoleModel;

@Service
public class RoleServerImpl {
	@Autowired
	private RoleDaoImpl roleDaoImpl;
	// 初始化数据
	List<RoleModel> initRoles = new ArrayList<>();

	public void init() {
		// 给role变添加初始化数据
		initRoles.add(new RoleModel(1l, "Student"));
		initRoles.add(new RoleModel(2l, "Teacher"));
		initRoles.add(new RoleModel(3l, "Manager"));

		// for循环给role一次添加数据
		for (int i = 0; i < initRoles.size(); i++) {
			roleDaoImpl.init(initRoles.get(i));
		}
	}
}
