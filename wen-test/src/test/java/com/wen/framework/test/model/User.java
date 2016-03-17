package com.wen.framework.test.model;

import com.wen.framework.commons.model.IJo;
import com.wen.framework.commons.model.IPo;


public class User implements IPo {

	private String id;
	private String name;
	private String deptid;
	private String roleid;
	private String loginname;
	private String password;

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

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public IJo toJo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", deptid=" + deptid
				+ ", roleid=" + roleid + ", loginname=" + loginname
				+ ", password=" + password + "]";
	}

	
	
}
