package com.sportsforall.webprj.vo;

import java.util.Date;

public class Group {
	
	private String Code;
	private String Member_Email;
	private String Game_Code;
	private String Name;
	private Date OpenDate;
	private Date CloseDate;
	private int Fixed_Num;
	
	
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
	public String getGame_Code() {
		return Game_Code;
	}
	public void setGame_Code(String game_Code) {
		Game_Code = game_Code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getOpenDate() {
		return OpenDate;
	}
	public void setOpenDate(Date openDate) {
		OpenDate = openDate;
	}
	public Date getCloseDate() {
		return CloseDate;
	}
	public void setCloseDate(Date closeDate) {
		CloseDate = closeDate;
	}
	public int getFixed_Num() {
		return Fixed_Num;
	}
	public void setFixed_Num(int fixed_Num) {
		Fixed_Num = fixed_Num;
	}
	
	
	
	

}
