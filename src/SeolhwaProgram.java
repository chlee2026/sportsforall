import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.sportsforall.webprj.dao.GroupDao;
import com.sportsforall.webprj.dao.JdbcGroupDao;
import com.sportsforall.webprj.dao.mybatis.MyBatisGroupDao;
import com.sportsforall.webprj.vo.Group;

public class SeolhwaProgram {

	public static void main(String[] args) throws SQLException {

		/*//JdbcGroupDao실행 - select
		GroupDao dao = new JdbcGroupDao();
		Group gruop = new Group();
		
		List<Group> list = dao.getGroup("Fixed_Num", 1,"");
		
		System.out.println("결과:" + list.size());
		

		for (Group g : list) {
			System.out.printf("모임이름: %s 모임총인원:%d date:%s \n", g.getName(), g.getFixed_Num(), g.getOpenDate());
		}
*/		
		/*//MyBatisGroupDao실행 - select
		GroupDao dao = new MyBatisGroupDao();
		Group group = new Group();
		
		List<Group> list = dao.getGroup("Fixed_Num",1,"설");
		
		System.out.println("결과:" + list.size());
		
		for (Group g : list) {
			System.out.printf("모임이름: %s 모임총인원:%d date:%s \n", g.getName(), g.getFixed_Num(), g.getOpenDate());
		}*/

		/*//JdbcGroupDao실행 - insert
		GroupDao dao = new JdbcGroupDao();
		Group group = new Group();
		
		group.setCode("dd");
		group.setMember_Email("설화");
		group.setGame_Code("01");
		group.setName("ss");
		group.setFixed_Num(1);
		
		System.out.println("실행: "+dao.insert(group));*/
		
		/*//MyBatisGroupDao실행 - insert
		GroupDao dao = new MyBatisGroupDao();
		Group group = new Group();
		
		group.setCode("dd");
		group.setMember_Email("설화");
		group.setGame_Code("01");
		group.setName("ss");
		group.setFixed_Num(1);
		//member.setRegdate(new Date(System.currentTimeMillis()));
		group.setOpenDate(new Date(System.currentTimeMillis()));
		group.setCloseDate(new Date(System.currentTimeMillis()));
		
		System.out.println("실행: "+dao.insert(group));*/
		
	/*	//JdbcGroupDao실행 - update
		GroupDao dao = new JdbcGroupDao();
		Group group = new Group();
		
		group.setGame_Code("1004");
		group.setFixed_Num(1004);
		group.setName("ss");
		
		System.out.println("실행: "+dao.update(group));*/
		
		/*//MyBatisGroupDao실행 - update
		GroupDao dao = new MyBatisGroupDao();
		Group group = new Group();
		
		group.setGame_Code("123456789");
		group.setFixed_Num(1098);
		group.setName("설화모임");
		
		System.out.println("실행: "+dao.update(group));*/
		
		/*//JdbcGroupDao실행 - delete
		GroupDao dao = new JdbcGroupDao();
		Group group = new Group();
		
		group.setName("서롸모임");
		
		System.out.println("실행: " + dao.delete(group.getName()));*/
		
		/*//MyBatisGroupDao실행 - delete
		GroupDao dao = new MyBatisGroupDao();
		Group group = new Group();
		
		group.setName("서라모임");
		
		System.out.println("실행: " + dao.delete(group.getName()));
		*/
		
		
		
		
	}
}
