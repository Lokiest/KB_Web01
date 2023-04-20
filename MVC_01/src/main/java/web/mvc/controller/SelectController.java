package web.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  //���۵� �����͸� request �ޱ�
		
		//service call > dao start
		
		System.out.println("SelectController ");
        request.setAttribute("message", "검색된 결과"); //${message}
		
		ModelAndView mv = new ModelAndView("selectResult.jsp");
        
		return mv;
	}

}
