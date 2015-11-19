package com.sportsforall.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sportsforall.webprj.dao.GroupDao;
import com.sportsforall.webprj.vo.Group;

public class MyBatisGroupDao implements GroupDao{

	SqlSessionFactory ssf = DalinSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Group> getGroup() throws SQLException {
		
		SqlSession session = ssf.openSession();
		GroupDao dao = session.getMapper(GroupDao.class);
		List<Group>list = dao.getGroup();
		
		session.close();
		
		return list;
	}

	@Override
	public int insert(Group group) throws SQLException {
	
		SqlSession session = ssf.openSession();
		GroupDao dao = session.getMapper(GroupDao.class);
		
		int count = dao.insert(group);
		
		session.commit();
		session.close();
		
		return count;
	}

	@Override
	public int update(Group group) throws SQLException {

		SqlSession session = ssf.openSession();
		GroupDao dao = session.getMapper(GroupDao.class);
		
		int count = dao.update(group);
		
		session.commit();
		session.close();
		
		return count;
	}

	@Override
	public int delete(String name) throws SQLException {

		SqlSession session = ssf.openSession();
		GroupDao dao = session.getMapper(GroupDao.class);
		
		int count = dao.delete(name);
		
		session.commit();
		session.close();
		
		return count;
	}
	

}
