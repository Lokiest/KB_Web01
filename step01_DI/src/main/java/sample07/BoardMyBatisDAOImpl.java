package sample07;

import org.springframework.stereotype.Repository;

@Repository //기본 id : 클래스이름의  첫글자만 소문자로 나머지는 동일하게
public class BoardMyBatisDAOImpl implements BoardDAO {

	public BoardMyBatisDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void select() {
		System.out.println("MyBatis select()");

	}

}
