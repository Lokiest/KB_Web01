package web.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rem")
public class RequestMappingController {
	
	@RequestMapping("/a.do")
	public ModelAndView aa() {
		System.out.println("a.do call");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Spring no Jam"); //뷰에 전달된 정보 ${requestScope.msgm}
		mv.setViewName("result");
		
		return mv;
	}
	
	
	/*
	 * 여러개의 요청이 하나의 메소드 호출
	 * @return : String인 경우 리턴값이 뷰 이름
	 * 
	 */
	@RequestMapping(value = {"/b.do", "/c.do"})
	public String bb() {
		System.out.println("bdo ddo call");
		return "result";
	}
	
	//return = void case : 요청된 주소가 뷰의 이름으로
	/*
	 * @RequestMapping("/test.do") public void cc() {
	 * System.out.println("test out call"); }
	 */
	
	@GetMapping("/test.do")
	public void cc(HttpServletRequest req) {
		String name = req.getParameter("name");
		System.out.println("get test out call, name = " + name); 
	}
	
	@PostMapping("/test.do")
	public void dd(String name) {
		 System.out.println("post test out call, name = " + name); 
	}
}
