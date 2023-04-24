package sample04;

public class StudentController {
	private StudentService studentservice;
	private Student student;
	
	public void setService(StudentService service) {
		this.studentservice = service;
		System.out.println("StudentController의 setService(StudentService service) 호출");
	    System.out.println("service = " + service);
	}
	
	public void setStudent(Student student) {
		this.student = student;
		System.out.println("StudentController의 setStudent(Student student) 호출");
		System.out.println("student = " + student);
	}
	
	public void insert() {
		//service의 insert를 호출한다.
		studentservice.insert(student);
		
	}

}
