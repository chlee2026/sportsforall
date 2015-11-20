package com.sportsforall.webprj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sportsforall.webprj.vo.Group;

public class JdbcGroupDao implements GroupDao {

	@Override
	public List<Group> getGroup() throws SQLException {		
		
		String sql ="select Name, Fixed_Num from Groupp;";
		String url ="jdbc:sqlserver://211.238.142.251:1433;databaseName=sportsforall";
		
		Connection con = DriverManager.getConnection(url, "dalin", "20151030");
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<Group>list = new ArrayList<Group>();
		Group group =null;
		
		while(rs.next()){
			group = new Group();
			
			group.setName(rs.getString("Name"));
			group.setFixed_Num(rs.getInt("Fixed_Num"));
			
			list.add(group);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}

	
	/*public List<Group> getGroup(String name) throws SQLException {
		
		String sql ="select Name 모임이름, Fixed_Num 모임총인원 from Groupp;";
		String url ="jdbc:sqlserver://211.238.142.251:1433;databaseName=sportsforall";
		
		Connection con = DriverManager.getConnection(url, "dalin", "20151030");
		PreparedStatement st = con.prepareStatement(sql);
		
		
		
		ResultSet rs = st.executeQuery();
		
		return null;
	}*/
	
	@Override
	public int insert(Group group) {
		
		return 0;
	}

	@Override
	public int update(Group group) {
		
		return 0;
	}

	@Override
	public int delete(Group name) {
		
		return 0;
	}

	
}
