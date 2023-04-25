package sample07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp7 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample07/applicationContext.xml");

		 BoardController con = context.getBean("boardController", BoardController.class);
		 con.test();

	}

}
