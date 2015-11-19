import java.sql.SQLException;
import java.util.List;

import com.sportsforall.webprj.dao.JdbcGroupDao;
import com.sportsforall.webprj.vo.Group;

public class Program {

	public static void main(String[] args) throws SQLException {

		//JdbcGroupDao실행
		JdbcGroupDao dao = new JdbcGroupDao();
		List<Group> list = dao.getGroup();

		System.out.println("결과:" + list.size());

		for (Group g : list) {
			System.out.printf("모임이름: %s 모임총인원:%d", g.getName(), g.getFixed_Num());
		}

	}
}
