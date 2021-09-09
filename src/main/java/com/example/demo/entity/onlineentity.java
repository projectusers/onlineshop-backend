package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class onlineentity {
	@Id
	private int aid;
	private String fname;
	private String lname;
	private String email;
	private long phonenum;
	private String pass;
	private String cpass;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	@Override
	public String toString() {
		return "onlineentity [aid=" + aid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phonenum="
				+ phonenum + ", pass=" + pass + ", cpass=" + cpass + "]";
	}

	
}
