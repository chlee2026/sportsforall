package com.sportsforall.webprj.vo;

import java.util.Date;

public class Group_Notify {

	private String Code;
	private String Member_Email;
	private String Group_Code;
	private Date Regdate;
	private String Contents;
	
	
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getMember_Email() {
		return Member_Email;
	}
	public void setMember_Email(String member_Email) {
		Member_Email = member_Email;
	}
	public String getGroup_Code() {
		return Group_Code;
	}
	public void setGroup_Code(String group_Code) {
		Group_Code = group_Code;
	}
	public Date getRegdate() {
		return Regdate;
	}
	public void setRegdate(Date regdate) {
		Regdate = regdate;
	}
	public String getContents() {
		return Contents;
	}
	public void setContents(String contents) {
		Contents = contents;
	}
	
	
	
}
