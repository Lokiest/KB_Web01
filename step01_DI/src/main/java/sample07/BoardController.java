package sample07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private BoardDTO boardDTO;
	
	@Autowired
	private BoardDTO boardDTO2;
	
	public BoardController() {
		System.out.println("BoardController......");
	}
	public void test() {
		System.out.println("boardDTO = " + boardDTO + ", subject = " +boardDTO.getSubject() );
		System.out.println("boardDTO2 = " + boardDTO2 + ", subject = " + boardDTO2.getSubject());
	
	}
}
