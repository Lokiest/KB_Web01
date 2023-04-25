package sample06;

import org.springframework.beans.factory.annotation.Value;

public class EmpDTO {
	@Value("10")
	private int empno;
	@Value("park")
	private String name;
	@Value("manager")
	private String job;
	
	public EmpDTO() {
		System.out.println("EmpDTO constructor call");
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	
}
