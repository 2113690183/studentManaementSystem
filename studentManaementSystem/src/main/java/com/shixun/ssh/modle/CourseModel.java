package com.shixun.ssh.modle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "tb_course")
public class CourseModel {
	// 课程编号
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COU_ID")
	private long cou_id;

	// 课程名称
	@Column(name = "COU_NAME")
	private String cou_name;

	// 课程学时
	@Column(name = "COU_HOUR")
	private int cou_hour;

	// 课程学分
	@Column(name = "COU_CREDIT")
	private double cou_credit;

	// 课程介绍
	@Column(name = "COU_PRESENTATION")
	private String cou_presentation;

	@ManyToOne
	@JoinColumn(name = "TEA_ID")
	private TeacherModel tea_id;

	public long getCou_id() {
		return cou_id;
	}

	public void setCou_id(long cou_id) {
		this.cou_id = cou_id;
	}

	public String getCou_name() {
		return cou_name;
	}

	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}

	public int getCou_hour() {
		return cou_hour;
	}

	public void setCou_hour(int cou_hour) {
		this.cou_hour = cou_hour;
	}

	public double getCou_credit() {
		return cou_credit;
	}

	public void setCou_credit(double cou_credit) {
		this.cou_credit = cou_credit;
	}

	public String getCou_presentation() {
		return cou_presentation;
	}

	public void setCou_presentation(String cou_presentation) {
		this.cou_presentation = cou_presentation;
	}

	public TeacherModel getTea_id() {
		return tea_id;
	}

	public void setTea_id(TeacherModel tea_id) {
		this.tea_id = tea_id;
	}

}
