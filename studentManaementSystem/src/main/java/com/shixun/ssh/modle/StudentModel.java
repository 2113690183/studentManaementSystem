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
@Table(name = "tb_student")
public class StudentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STU_ID")
	private long stu_id;

	// 学号
	@Column(name = "STU_ON")
	private long stu_on;

	// 学生名字
	@Column(name = "STU_NAME")
	private String stu_name;

	// 性别，0代表女，1代表男
	@Column(name = "STU_SEX")
	private int stu_sex;

	// 出生日期
	@Column(name = "STU_BIRTHDAY")
	private Date stu_birthday;

	// 所在班级
	@Column(name = "STU_CLASS")
	private int stu_class;

	// 学生表和用户表关联
	@OneToOne
	@JoinColumn(name = "U_ID")
	private UserModel userModel;

	public long getStu_id() {
		return stu_id;
	}

	public void setStu_id(long stu_id) {
		this.stu_id = stu_id;
	}

	public long getStu_on() {
		return stu_on;
	}

	public void setStu_on(long stu_on) {
		this.stu_on = stu_on;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public int getStu_sex() {
		return stu_sex;
	}

	public void setStu_sex(int stu_sex) {
		this.stu_sex = stu_sex;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	public Date getStu_birthday() {
		return stu_birthday;
	}

	public void setStu_birthday(Date stu_birthday) {
		this.stu_birthday = stu_birthday;
	}

	public int getStu_class() {
		return stu_class;
	}

	public void setStu_class(int stu_class) {
		this.stu_class = stu_class;
	}

}
