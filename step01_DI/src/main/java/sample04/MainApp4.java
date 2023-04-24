package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp4 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample04/applicationContext.xml");
		
		StudentController control = context.getBean("control", StudentController.class);
		control.insert();
	}

}
