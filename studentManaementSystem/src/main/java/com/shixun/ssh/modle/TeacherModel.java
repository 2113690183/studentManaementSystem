package com.shixun.ssh.modle;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_teacher")
public class TeacherModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TEA_ID")
	private long tea_id;
	
	// 教职工号
	@Column(name="TEA_NO")
	private String tea_no;
	
	// 教师名字
	@Column(name="TEA_NAME")
	private String tea_name;
	
	// 教师性别,0代表女,1代表男
	@Column(name="TEA_SEX")
	private int tea_sex;
	
	// 出生日期
	@Column(name="TEA_BIRTHDAY")
	private Date tea_birthday;
	
	// 所在系部
	@Column(name="TEA_DEPART")
	private String tea_depart;
	
	// 教师表和用户表关联
	@OneToOne
	@JoinColumn(name="U_ID")
	private UserModel userModel;
	
	public long getTea_id() {
		return tea_id;
	}

	public void setTea_id(long tea_id) {
		this.tea_id = tea_id;
	}

	public String getTea_no() {
		return tea_no;
	}

	public void setTea_no(String tea_no) {
		this.tea_no = tea_no;
	}

	public String getTea_name() {
		return tea_name;
	}

	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}

	public int getTea_sex() {
		return tea_sex;
	}

	public void setTea_sex(int tea_sex) {
		this.tea_sex = tea_sex;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	public Date getTea_birthday() {
		return tea_birthday;
	}

	public void setTea_birthday(Date tea_birthday) {
		this.tea_birthday = tea_birthday;
	}

	public String getTea_depart() {
		return tea_depart;
	}

	public void setTea_depart(String tea_depart) {
		this.tea_depart = tea_depart;
	}

	
}
