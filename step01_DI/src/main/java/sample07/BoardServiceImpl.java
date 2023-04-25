package sample07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	@Qualifier("oracleDAO")
	private BoardDAO boardOracleDao;
	@Autowired
	private BoardDAO boardMyBatisDAOImpl;
	
	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void select() {
		boardOracleDao.select();
		
		boardMyBatisDAOImpl.select();

	}

}
