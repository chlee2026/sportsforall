import java.sql.SQLException;
import java.util.List;

import com.sportsforall.webprj.dao.MemberDao;
import com.sportsforall.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		MemberDao dao=new MemberDao();
		List<Member> list=dao.getMembers();
		
		for(Member m : list)
		{
			System.out.printf("email: %s, regdate: %s\n", m.getEmail(),m.getRegDate());
		}
	}
}