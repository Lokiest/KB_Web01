package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample03/applicationContext.xml");
		BookController control = context.getBean("control", BookController.class);
		control.bookInsert();
		
	}

}
