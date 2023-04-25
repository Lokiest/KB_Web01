package sample06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp6 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample06/applicationContext.xml");
		EmpController con = context.getBean("control", EmpController.class);
		con.test();
	}

}
