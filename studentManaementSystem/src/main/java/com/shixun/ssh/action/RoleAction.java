package com.shixun.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shixun.ssh.server.impl.RoleServerImpl;

@Component("roleAction")
public class RoleAction {
	@Autowired
	private RoleServerImpl roleServerImpl;

	public String init() {
		// 通过Service 来初始化数据
		roleServerImpl.init();
		return "init";
	}

	public RoleServerImpl getRoleServerImpl() {
		return roleServerImpl;
	}

	public void setRoleServerImpl(RoleServerImpl roleServerImpl) {
		this.roleServerImpl = roleServerImpl;
	}
}
