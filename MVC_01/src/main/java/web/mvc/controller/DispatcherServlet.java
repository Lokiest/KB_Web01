package web.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  모든 요청을 중앙집중적으로 받아서 처리할 FrontController의 역할
 */
@WebServlet(urlPatterns = "/front" , loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = request.getParameter("key");
		System.out.println("key = " + key);
		
		Controller controller = null;
		
		if(key.equals("insert")) {//
			controller = new InsertController();
		}else if(key.equals("select")) {
			controller= new SelectController();
		}else if(key.equals("delete")) {
			controller = new DeleteController();
		}else if(key.equals("update")) {
			controller = new UpdateController();
		}
		///////////////////////////////////////
		ModelAndView mv = controller.handleRequest(request, response);
		if(mv.isRedirect()) {
			response.sendRedirect(mv.getViewName());
		}else {
			request.getRequestDispatcher(mv.getViewName()).forward(request, response);
		}
		
		
	}//service

}









