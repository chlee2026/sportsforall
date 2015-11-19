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
	public int insert(Group group) throws SQLException {
		
		String sql = "insert into Groupp(Code, Member_Email, Game_Code, Name, Fixed_Num) values(?, ?, ?, ?, ?);";
		String url ="jdbc:sqlserver://211.238.142.251:1433;databaseName=sportsforall";
		
		Connection con = DriverManager.getConnection(url, "dalin", "20151030");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, group.getCode());
		st.setString(2, group.getMember_Email());
		st.setString(3, group.getGame_Code());
		st.setString(4, group.getName());
		st.setInt(5, group.getFixed_Num());
		
		int aft = st.executeUpdate();
		
		st.close();
		con.close();
		
		return aft;
	}

	@Override
	public int update(Group group) throws SQLException {
		
		String sql = "update Groupp set Game_Code=?, Fixed_Num=?  where Name=?;";
		String url ="jdbc:sqlserver://211.238.142.251:1433;databaseName=sportsforall";
		
		Connection con = DriverManager.getConnection(url, "dalin", "20151030");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, group.getGame_Code());
		st.setInt(2 , group.getFixed_Num());
		st.setString(3, group.getName());
		
		int aft = st.executeUpdate();
		
		st.close();
		con.close();
		
		return aft;
	}

	@Override
	public int delete(Group name) {
		
		return 0;
	}

	
}
