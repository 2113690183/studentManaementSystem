package com.shixun.ssh.modle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class RoleModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "R_ID")
	private long r_id;

	@Column(name = "NAME", unique=true)
	private String name;

	public long getR_id() {
		return r_id;
	}

	public void setR_id(long r_id) {
		this.r_id = r_id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public RoleModel(long r_id, String name) {
		super();
		this.r_id = r_id;
		this.name = name;
	}

	public RoleModel() {
		super();
	}

	public RoleModel(long r_id) {
		super();
		this.r_id = r_id;
	}

	public RoleModel(String name) {
		super();
		this.name = name;
	}
	
}
