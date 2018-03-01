package com.shixun.ssh.modle;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

/**
 * @author kevinChen 用户表，使用登录时使用的，通过实体类生成对应表
 */
@Entity
@Table(name = "tb_user")
@DynamicInsert(value=true)
public class UserModel {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "U_ID")
	private long u_id;
	// 登录用户名
	@Column(name = "USERNAME")
	private String userName;
	// 登录密码字段
	@Column(name = "PASSWORD")
	private String password;
	
	// 用户的状态,1是可以登录,0不可登录,起始的默认值是1,且不受insert语句影响
	@Column(name="STATUS",nullable=false, insertable=false, columnDefinition="Integer default 1")
	public int status;
	
	// 声明字段用户用于登录身份验证,给不同身份登录者，不同的权限
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "R_ID")
	private RoleModel roleModel;
	// 最后一次登录日期
	@Column(name = "LOGIN_DATE")
	private Date loginDate;

	public long getU_id() {
		return u_id;
	}

	public void setU_id(long u_id) {
		this.u_id = u_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public RoleModel getRoleModel() {
		return roleModel;
	}

	public void setRoleModel(RoleModel roleModel) {
		this.roleModel = roleModel;
	}

	public Date getloginDate() {
		return loginDate;
	}

	public void setloginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public UserModel() {
		super();
	}

	public UserModel(long u_id, String u_name, String password, RoleModel roleModel, Date loginDate) {
		super();
		this.u_id = u_id;
		this.userName = u_name;
		this.password = password;
		this.roleModel = roleModel;
		this.loginDate = loginDate;
	}
	
	public UserModel(String userName, String password, RoleModel roleModel, Date loginDate) {
		super();
		this.userName = userName;
		this.password = password;
		this.roleModel = roleModel;
		this.loginDate = loginDate;
	}
	
	public UserModel(long u_id) {
		super();
		this.u_id = u_id;
	}

	public UserModel(Date loginDate) {
		super();
		this.loginDate = loginDate;
	}
	
}
