package com.sportsforall.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.sportsforall.webprj.vo.Group;

public interface GroupDao {
	
	public List<Group> getGroup() throws SQLException;
	//public List<Group> getGroup(String name) throws SQLException;
	public int insert(Group group) throws SQLException;
	public int update(Group group) throws SQLException;
	public int delete(Group name);
	

}
