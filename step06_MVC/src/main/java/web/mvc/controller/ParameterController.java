package web.mvc.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/param")
public class ParameterController {
	
	@RequestMapping("/a.do")
	public String aa(String name, Integer age) {
		System.out.println(name + " = name");
		System.out.println(age + " = age");
		
		return "result";
	}
	
	@RequestMapping("/b.do")
	public void bb(@RequestParam(defaultValue = "guest") String id, @RequestParam(defaultValue = "0") int age) {
		System.out.println(id + " = id");
		System.out.println(age + " = age");
		
	}
	
	@RequestMapping("/c.do")
	public String cc(@RequestParam(value = "userId") String id) {
		System.out.println(id + " = id");
		return "result";
	}
	
	@RequestMapping("/user.do")
	public ModelAndView dd(@ModelAttribute("dto") MemberDTO dto) {
		System.out.println(dto);
		
		return new ModelAndView("ok");
	}
	
	@ModelAttribute("hobbys")
	public List<String> hobbys() {
		return Arrays.asList("ewr", "123", "qweasd");
	}
	
	@ModelAttribute("info")
	public String info() {
		return "MVCCCCCCCCCC";
	}
	
}
