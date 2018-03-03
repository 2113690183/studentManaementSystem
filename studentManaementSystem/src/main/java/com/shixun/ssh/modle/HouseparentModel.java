package com.shixun.ssh.modle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_houseparent")
public class HouseparentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HOU_ID")
	private long hou_id;

	// 舍管职工号
	@Column(name = "HOU_NO")
	private String hou_no;

	// 舍管名字
	@Column(name = "HOU_NAME")
	private String hou_name;

	// 舍管性别,0代表女,1代表男
	@Column(name = "HOU_SEX")
	private int hou_sex;

	// 手机号
	@Column(name = "HOU_HONE")
	private int hou_hone;

	// 邮箱
	@Column(name = "HOU_EMAIL")
	private String hou_email;

	// 舍管表和用户表关联
	@OneToOne
	@JoinColumn(name = "U_ID")
	private UserModel userModel;

	public long getHou_id() {
		return hou_id;
	}

	public void setHou_id(long hou_id) {
		this.hou_id = hou_id;
	}

	public String getHou_no() {
		return hou_no;
	}

	public void setHou_no(String hou_no) {
		this.hou_no = hou_no;
	}

	public String getHou_name() {
		return hou_name;
	}

	public void setHou_name(String hou_name) {
		this.hou_name = hou_name;
	}

	public int getHou_sex() {
		return hou_sex;
	}

	public void setHou_sex(int hou_sex) {
		this.hou_sex = hou_sex;
	}

	public int getHou_hone() {
		return hou_hone;
	}

	public void setHou_hone(int hou_hone) {
		this.hou_hone = hou_hone;
	}

	public String getHou_email() {
		return hou_email;
	}

	public void setHou_email(String hou_email) {
		this.hou_email = hou_email;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
