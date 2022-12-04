package com.loginUser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name = "uemail")
	private String uEmail;

	@Column(name = "uname")
	private String uName;

	@Column(name = "upwd")
	private String uPwd;

	@Column(name = "uphone")
	private String uPhone;
	
	public User () {
		
	}

	public User(String uName, String uEmail, String uPwd, String uPhone) {
		super();
		this.uName = uName;
		this.uPwd = uPwd;
		this.uEmail = uEmail;
		this.uPhone = uPhone;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPwd() {
		return uPwd;
	}

	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

}
