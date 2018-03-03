package com.shixun.ssh.modle;

import java.util.List;

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

@Entity
@Table(name = "tb_score")
public class ScoreModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SCORE_ID")
	private long score_id;

	// 成绩关联到学生表
	@ManyToOne
	@JoinColumn(name = "STU_ID")
	private StudentModel studentModel;

	// 成绩表关联到课程表
	@OneToOne
	@JoinColumn(name = "COU_ID")
	private CourseModel courseModel;

	@Column(name = "SCORE_DEGREE")
	private double degree;

	public long getScore_id() {
		return score_id;
	}

	public void setScore_id(long score_id) {
		this.score_id = score_id;
	}

	public StudentModel getStudentModel() {
		return studentModel;
	}

	public void setStudentModel(StudentModel studentModel) {
		this.studentModel = studentModel;
	}

	public CourseModel getCourseModel() {
		return courseModel;
	}

	public void setCourseModel(CourseModel courseModel) {
		this.courseModel = courseModel;
	}

	public double getDegree() {
		return degree;
	}

	public void setDegree(double degree) {
		this.degree = degree;
	}

}
