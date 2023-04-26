package web.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ResponseBodyController {

	@RequestMapping("/responseBody.do")
	//@ResponseBody //�����ϴ� ���� �״�� ���� ��ü�� �������� ����
	public String aa() {
		System.out.println("responseBody.do call");
		return "Viewname!";
	}
	
	@RequestMapping(value = "responseBody2.do", produces = "text/html;charset=UTF-8")
	//@ResponseBody
	public String bb() {
		System.out.println("responseBody.do call");
		return "Go Home.. ����";
	}

}
