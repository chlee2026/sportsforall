package com.sportsforall.webprj.dao;


import java.sql.SQLException;
import java.util.List;

import java.sql.SQLException;
import java.util.List;
import com.sportsforall.webprj.vo.Group;
import com.sportsforall.webprj.vo.Group;

public interface GroupDao {
	

	public List<Group> getGroup() throws SQLException;
	public List<Group> getGroup(int page) throws SQLException;
	public List<Group> getGroup(String column, int page, String name) throws SQLException;
	public int insert(Group group) throws SQLException;
	public int update(Group group) throws SQLException;
	public int delete(String name) throws SQLException;
	

}
