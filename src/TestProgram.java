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
				
				SqlSession session = ssf.openSession(); //jdbc ����
				//����ٿ�Ŭ������ ���� 
				MemberDao dao = session.getMapper(MemberDao.class);
				*/
				MemberDao dao = new MybatisMemberDao();
				Member member = new Member();
				
				//�����ͺ��̽�������ƿ�
				List<Member>list = dao.getMembers();
				
				
				//mybatis ������Ʈ
				/*member.setName("��");
				member.setPwd("4");
				member.setMid("mimi");
				dao.update(member);
				*/
				//mybatis �μ�Ʈ
			/*	member.setName("�輳��");
				member.setPwd("213213");
				member.setMid("����");
				member.setRegdate(new Date(System.currentTimeMillis()));
				System.out.println("�˻����:" +	dao.insert(member));*/
				
				//���
		/*		System.out.println("�˻����:" + list.size());
				
				for(Member m : list)
				{
					System.out.printf("mid : %s, name : %s , pwd : %s, regdate : %s \n",
							m.getMid(), m.getName(), m.getPwd(), m.getRegdate());
				}
				*/
				//session.close();
}