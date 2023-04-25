package exam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exam.service.MessageService;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");
		MessageService service = context.getBean("target", MessageService.class);
		service.engHello("ewrewr2");
		System.out.println("-------------------------------------------------------");
		
		service.korHello();
		System.out.println("-------------------------------------------------------");
		
		int re = service.hello();
		System.out.println("re = " + re);
		System.out.println("-------------------------------------------------------");
		
		String re2 = service.hello("ewr2", 23);
		System.out.println("re2 = " + re2);
		System.out.println("-------------------------------------------------------");

		
	}

}
