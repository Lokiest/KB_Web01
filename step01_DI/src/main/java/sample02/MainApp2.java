package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {

	public static void main(String[] args) {
		
		//used
		/*
		 * Member member = new Member("ar", "re", 123, "a123"); MemberDAO dao = new
		 * MemberDAO();
		 * 
		 * MemberService service = new MemberService(dao, member);
		 * service.serviceInsert();
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample02/applicationContext.xml");
		System.out.println("----------------------");
		MemberService service = context.getBean("service", MemberService.class);
		service.serviceInsert();
	}

}
