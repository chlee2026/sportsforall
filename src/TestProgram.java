import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.newlecture.webprj.dao.JdbcMemberDao;
import com.newlecture.webprj.dao.mybatis.MybatisMemberDao;
import com.sportsforall.webprj.dao.MemberDao;
import com.sportsforall.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		//JdbcMemberDao dao = new JdbcMemberDao();
				/**SqlSessionFactory ssf = NewlecSqlSessionFactoryBuilder.getSqlSessionFactory();
				
				SqlSession session = ssf.openSession(); //jdbc 연결
				//멤버다오클래스와 맵핑 
				MemberDao dao = session.getMapper(MemberDao.class);
				*/
				MemberDao dao = new MybatisMemberDao();
				Member member = new Member();
				
				//데이터베이스에서담아옴
				List<Member>list = dao.getMembers();
				
				
				//mybatis 업데이트
				/*member.setName("비");
				member.setPwd("4");
				member.setMid("mimi");
				dao.update(member);
				*/
				//mybatis 인설트
			/*	member.setName("김설구");
				member.setPwd("213213");
				member.setMid("이지");
				member.setRegdate(new Date(System.currentTimeMillis()));
				System.out.println("검색결과:" +	dao.insert(member));*/
				
				//출력
		/*		System.out.println("검색결과:" + list.size());
				
				for(Member m : list)
				{
					System.out.printf("mid : %s, name : %s , pwd : %s, regdate : %s \n",
							m.getMid(), m.getName(), m.getPwd(), m.getRegdate());
				}
				*/
				//session.close();
}