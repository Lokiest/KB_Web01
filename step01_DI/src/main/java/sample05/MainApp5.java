package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp5 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample05/applicationContext.xml");
		
//		StudentController control = context.getBean("control", StudentController.class);
//		control.insert();
	}

}
