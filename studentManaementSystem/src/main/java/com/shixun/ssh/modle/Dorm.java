package com.shixun.ssh.modle;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_dorm")
public class Dorm {
	// 寝室ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DORM_ID")
	private long dorm_id;
	
	// 寝室号
	@Column(name="DORM_SROOM")
	private int dorm_Sroom;
	
	// 可住人数
	@Column(name="DORM_ROOMTYPE")
	private int dorm_roomType;
	
	// 寝室卫生评分,分数区间是[0,100]
	@Column(name="DORM_SCORE")
	private double dorm_score;
	
	@Column(name="DORP_ADDRESS")
	private String  dorp_address;
	
	// 宿舍表关联到寝室管理员表
	@OneToOne
	@JoinColumn(name="HOU_ID")
	private HouseparentModel hou_id;
	
	// 宿舍表关联到学生表
	@OneToMany
	@JoinColumn(name="STU_ID")
	private Set<StudentModel> stu_id;

	public long getDorm_id() {
		return dorm_id;
	}

	public void setDorm_id(long dorm_id) {
		this.dorm_id = dorm_id;
	}

	public int getDorm_Sroom() {
		return dorm_Sroom;
	}

	public void setDorm_Sroom(int dorm_Sroom) {
		this.dorm_Sroom = dorm_Sroom;
	}

	public int getDorm_roomType() {
		return dorm_roomType;
	}

	public void setDorm_roomType(int dorm_roomType) {
		this.dorm_roomType = dorm_roomType;
	}

	public double getDorm_score() {
		return dorm_score;
	}

	public void setDorm_score(double dorm_score) {
		this.dorm_score = dorm_score;
	}

	public HouseparentModel getHou_id() {
		return hou_id;
	}

	public void setHou_id(HouseparentModel hou_id) {
		this.hou_id = hou_id;
	}

	public Set<StudentModel> getStu_id() {
		return stu_id;
	}

	public void setStu_id(Set<StudentModel> stu_id) {
		this.stu_id = stu_id;
	}

	public String getDorp_address() {
		return dorp_address;
	}

	public void setDorp_address(String dorp_address) {
		this.dorp_address = dorp_address;
	}

	
}
