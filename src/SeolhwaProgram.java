import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.sportsforall.webprj.dao.GroupDao;
import com.sportsforall.webprj.dao.JdbcGroupDao;
import com.sportsforall.webprj.dao.mybatis.MyBatisGroupDao;
import com.sportsforall.webprj.vo.Group;

public class SeolhwaProgram {

	public static void main(String[] args) throws SQLException {

		/*//JdbcGroupDao���� - select
		GroupDao dao = new JdbcGroupDao();
		Group gruop = new Group();
		
		List<Group> list = dao.getGroup("Fixed_Num", 1,"");
		
		System.out.println("���:" + list.size());
		

		for (Group g : list) {
			System.out.printf("�����̸�: %s �������ο�:%d date:%s \n", g.getName(), g.getFixed_Num(), g.getOpenDate());
		}
*/		
		/*//MyBatisGroupDao���� - select
		GroupDao dao = new MyBatisGroupDao();
		Group group = new Group();
		
		List<Group> list = dao.getGroup("Fixed_Num",1,"��");
		
		System.out.println("���:" + list.size());
		
		for (Group g : list) {
			System.out.printf("�����̸�: %s �������ο�:%d date:%s \n", g.getName(), g.getFixed_Num(), g.getOpenDate());
		}*/

		/*//JdbcGroupDao���� - insert
		GroupDao dao = new JdbcGroupDao();
		Group group = new Group();
		
		group.setCode("dd");
		group.setMember_Email("��ȭ");
		group.setGame_Code("01");
		group.setName("ss");
		group.setFixed_Num(1);
		
		System.out.println("����: "+dao.insert(group));*/
		
		/*//MyBatisGroupDao���� - insert
		GroupDao dao = new MyBatisGroupDao();
		Group group = new Group();
		
		group.setCode("dd");
		group.setMember_Email("��ȭ");
		group.setGame_Code("01");
		group.setName("ss");
		group.setFixed_Num(1);
		//member.setRegdate(new Date(System.currentTimeMillis()));
		group.setOpenDate(new Date(System.currentTimeMillis()));
		group.setCloseDate(new Date(System.currentTimeMillis()));
		
		System.out.println("����: "+dao.insert(group));*/
		
	/*	//JdbcGroupDao���� - update
		GroupDao dao = new JdbcGroupDao();
		Group group = new Group();
		
		group.setGame_Code("1004");
		group.setFixed_Num(1004);
		group.setName("ss");
		
		System.out.println("����: "+dao.update(group));*/
		
		/*//MyBatisGroupDao���� - update
		GroupDao dao = new MyBatisGroupDao();
		Group group = new Group();
		
		group.setGame_Code("123456789");
		group.setFixed_Num(1098);
		group.setName("��ȭ����");
		
		System.out.println("����: "+dao.update(group));*/
		
		/*//JdbcGroupDao���� - delete
		GroupDao dao = new JdbcGroupDao();
		Group group = new Group();
		
		group.setName("���ָ���");
		
		System.out.println("����: " + dao.delete(group.getName()));*/
		
		/*//MyBatisGroupDao���� - delete
		GroupDao dao = new MyBatisGroupDao();
		Group group = new Group();
		
		group.setName("�������");
		
		System.out.println("����: " + dao.delete(group.getName()));
		*/
		
		
		
		
	}
}
