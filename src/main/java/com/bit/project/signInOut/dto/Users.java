package com.bit.project.signInOut.dto;


public class Users {
	
	
	private String userid;
	
	private String userpw;
	
	private String comment;
	
	
	
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", userpw=" + userpw + ", comment=" + comment + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	
}
