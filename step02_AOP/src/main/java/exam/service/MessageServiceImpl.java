package exam.service;

public class MessageServiceImpl implements MessageService {

	@Override
	public void korHello() {
		System.out.println("MessageServiceImpl korHello() Method");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void engHello(String name) {
		System.out.println("MessageServiceImpl engHello() Method");
		
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public int hello() {
		System.out.println("MessageServiceImpl hello() Method");
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 100;
	}

	@Override
	public String hello(String name, int age) {
		System.out.println("MessageServiceImpl helloParam() Method");
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Some";
	}

}
