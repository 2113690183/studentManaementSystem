package com.shixun.ssh.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shixun.ssh.common.BaseDao;
import com.shixun.ssh.modle.RoleModel;

@Repository
public class RoleDaoImpl {
	@Autowired
	private BaseDao baseDao;

	public void init(RoleModel roleModel) {
		baseDao.getHibernateTemplate().saveOrUpdate(roleModel);
	}
}
