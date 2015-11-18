package com.sportsforall.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.sportsforall.webprj.vo.Member;

public interface MemberDao {
	
	public List<Member> getMembers();
	public List<Member> getMembers(int page);
	public List<Member> getMembers(int page, String filed, String query);
	
	public int update(Member member);
	public int delete(String email);
	public int insert(Member member);
	

}
