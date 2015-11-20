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

public List<Group> getGroup() throws SQLException {		
		
		return getGroup("OpenDate",1,"");
	}

	@Override
	public List<Group> getGroup(int page) throws SQLException {
		
		return getGroup("OpenDate",page,"");
	}
	

	public List<Group> getGroup(String column, int page, String name) throws SQLException {
		
		int start = 1+(page-1)*10;
		int end = page*10;
		
		String sql = "SELECT * FROM(SELECT ROW_NUMBER() OVER (ORDER BY "+column+" DESC)NUM, GROUPP.*FROM GROUPP WHERE NAME LIKE ?) A "
				+ "WHERE NUM BETWEEN ? AND ?;";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=sportsforall";
		
		Connection con = DriverManager.getConnection(url, "dalin", "20151030");
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, "%"+name+"%");
		st.setInt(2, start);
		st.setInt(3, end);
		
		ResultSet rs = st.executeQuery();
		
		List<Group>list = new ArrayList<Group>();
		Group group =null;
		
		while(rs.next()){
			group = new Group();
			
			group.setName(rs.getString("Name"));
			group.setFixed_Num(rs.getInt("Fixed_Num"));
			group.setOpenDate(rs.getDate("OpenDate"));
			
			list.add(group);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}
	
	
	
	@Override
	public int insert(Group group) throws SQLException {
		
		String sql = "insert into Groupp(Code, Member_Email, Game_Code, Name, Fixed_Num) values(?, ?, ?, ?, ?);";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=sportsforall";
		
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
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=sportsforall";
		
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
	public int delete(String name) throws SQLException {
		
		String sql = "delete Groupp where Name=?;";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=sportsforall";
		
		Connection con = DriverManager.getConnection(url, "dalin", "20151030");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, name);
		
		int aft = st.executeUpdate();
		
		st.close();
		con.close();
		
		return aft;
	}
	
}
