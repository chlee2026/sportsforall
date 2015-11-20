package com.sportsforall.webprj.vo;

import java.sql.Date;

public class Message {
	String code;
	String member_email;
	String title;
	String message_content;
	String receiver;
	Date receiver_regdate;
	String sender;
	Date send_regdate;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getReceiver_regdate() {
		return receiver_regdate;
	}
	public void setReceiver_regdate(Date receiver_regdate) {
		this.receiver_regdate = receiver_regdate;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public Date getSend_regdate() {
		return send_regdate;
	}
	public void setSend_regdate(Date send_regdate) {
		this.send_regdate = send_regdate;
	}
}
