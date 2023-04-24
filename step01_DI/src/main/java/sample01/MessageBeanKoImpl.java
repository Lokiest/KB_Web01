package sample01;

public class MessageBeanKoImpl implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println(name + "님 안녕 ?");

	}
	
	public MessageBeanKoImpl() {
		System.out.println("ko call");
	}
}
