package com.shixun.ssh.dao.impl;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shixun.ssh.common.BaseDao;
import com.shixun.ssh.modle.UserModel;



@Repository
public class UserDaoImpl {
	
	@Autowired
	private BaseDao baseDao;
	
//	@SuppressWarnings("unchecked")
//	public List<UserModel> getUsers() {
//		return (List<UserModel> )baseDao.getHibernateTemplate().find("from UserModel");
//	}
//
//	public void deleteUserModel(UserModel userModel) {
//		baseDao.getHibernateTemplate().delete(userModel);
//	}
//
//	public UserModel getUser(UserModel userModel) {
//		 return baseDao.getHibernateTemplate().get(UserModel.class, userModel.getId());
//	}
//
//	public void edit(UserModel userModel) {
//		baseDao.getHibernateTemplate().saveOrUpdate(userModel);
//	}
//	public void add(UserModel userModel) {
//		baseDao.getHibernateTemplate().save(userModel);
//	}
	
	// 添加注册功能的
	public void register(UserModel userModel ){
		baseDao.getHibernateTemplate().saveOrUpdate(userModel);
	}
}
