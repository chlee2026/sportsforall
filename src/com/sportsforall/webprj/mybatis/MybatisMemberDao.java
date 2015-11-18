package com.sportsforall.webprj.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sportsforall.webprj.dao.MemberDao;
import com.sportsforall.webprj.vo.Member;

public class MybatisMemberDao implements MemberDao{
	SqlSessionFactory ssf = NewlecSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Member> getMembers() throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(1,"MID","");
	}

	@Override
	public List<Member> getMembers(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(page,"MID","");
	}

	@Override
	public List<Member> getMembers(int page, String filed, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession(); //jdbc ¿¬°á
		
		MemberDao dao = session.getMapper(MemberDao.class);
	
		List<Member>list = dao.getMembers(page,filed,query);
		session.commit();
		session.close();
		return list;
	}

	@Override
	public int update(Member member) throws SQLException {

		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		int aft = dao.update(member);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int delete(String mid) throws SQLException {
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		int aft = dao.delete(mid);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(Member member) throws SQLException {
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		int aft = dao.insert(member);
		session.commit();
		session.close();
		return aft;
		
	}

}
