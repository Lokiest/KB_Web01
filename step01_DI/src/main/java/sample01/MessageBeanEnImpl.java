package sample01;

public class MessageBeanEnImpl implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println(name + " HI ?");

	}
	
	public MessageBeanEnImpl() {
		System.out.println("en call");
	}

}
