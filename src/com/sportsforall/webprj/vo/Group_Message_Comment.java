package com.sportsforall.webprj.vo;

import java.util.Date;

public class Group_Message_Comment {
	
	private String Code;
	private String Member_Email;
	private String Group_Code;
	private String Group_Message_Code;
	private String Contents;
	private Date Post_Time;
	
	
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
	public String getGroup_Message_Code() {
		return Group_Message_Code;
	}
	public void setGroup_Message_Code(String group_Message_Code) {
		Group_Message_Code = group_Message_Code;
	}
	public String getContents() {
		return Contents;
	}
	public void setContents(String contents) {
		Contents = contents;
	}
	public Date getPost_Time() {
		return Post_Time;
	}
	public void setPost_Time(Date post_Time) {
		Post_Time = post_Time;
	}
	
	
	

}
