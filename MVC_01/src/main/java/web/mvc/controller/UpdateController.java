package web.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//
		
		System.out.println("UpdateController ");
		
		request.setAttribute("message", "update 결과");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateResult.jsp");
		
		return mv;
	}

}
