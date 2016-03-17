package com.wen.framework.test.model;

import com.wen.framework.jdbctemplate.model.IJo;
import com.wen.framework.jdbctemplate.model.IPo;

public class Dept implements IPo{

	private String id;
	private String name;
	private String code;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", code=" + code + "]";
	}

	@Override
	public IJo toJo() {
		// TODO Auto-generated method stub
		return null;
	}

}
