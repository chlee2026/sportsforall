import java.sql.SQLException;
import java.util.List;

import com.sportsforall.webprj.dao.JdbcGroupDao;
import com.sportsforall.webprj.vo.Group;

public class Program {

	public static void main(String[] args) throws SQLException {

		//JdbcGroupDao����
		JdbcGroupDao dao = new JdbcGroupDao();
		List<Group> list = dao.getGroup();

		System.out.println("���:" + list.size());

		for (Group g : list) {
			System.out.printf("�����̸�: %s �������ο�:%d", g.getName(), g.getFixed_Num());
		}

	}
}
