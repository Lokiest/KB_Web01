package sample06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {
	
	@Autowired //byType에 의해서 주입
	// @Qualifier("emp") //Autowired 쓸 때, 동일한 타입 객체가 여러개이고 id와 property명이 일치하는게 없을때 설정이 필요
	private EmpDTO empDTO;
	
	@Autowired //byType에 의해서 주입
	private EmpService service;
	
	public EmpController() {
		System.out.println("EmpController constructor call");
	}
	
	public void test() {
		System.out.println("empDTO = " + empDTO + ", empno = " + empDTO.getEmpno());
		System.out.println("service = " + service);
		
		service.test();
	}
}
