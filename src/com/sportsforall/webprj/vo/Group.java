package com.sportsforall.webprj.vo;

import java.util.Date;

public class Group {
	
	private String Group_Code;
	private String Member_Email;
	private String Game_Code;
	private Date OpenDate;
	private Date CloseDate;
	private int Fixed_Num;
	
	
	public String getGroup_Code() {
		return Group_Code;
	}
	public void setGroup_Code(String group_Code) {
		Group_Code = group_Code;
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