package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("----- SPRING Container to create Object-----");
		
		
		//기존방식
//		MessageBean bean = new MessageBeanEnImpl();
//		bean.sayHello("hehehe");
//		
//		bean = new MessageBeanKoImpl();
//		bean.sayHello("박");
		
		/*
		 * SpringContainer인 applicationContext는 객체를 미리 사전초기화
		 * scope = "singleton" 으로 관리
		 */
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample01/applicationContext.xml");
		
		MessageBean bean = context.getBean("en", MessageBean.class);
		bean.sayHello("hihihi");
		
		bean = context.getBean("ko", MessageBean.class);
		bean.sayHello("ㅔ메메");
		
		System.out.println("bean = " + bean);
		
		MessageBean bean2 = context.getBean("ko", MessageBean.class);
		System.out.println("bean2 = " + bean2);

	}

}
