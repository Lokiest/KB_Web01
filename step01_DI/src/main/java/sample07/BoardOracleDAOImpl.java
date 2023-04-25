package sample07;

import org.springframework.stereotype.Repository;

@Repository("oracleDAO")
public class BoardOracleDAOImpl implements BoardDAO {
	
	public BoardOracleDAOImpl() {}
	
	@Override
	public void select() {
		System.out.println("BoardOracle select()");

	}

}
