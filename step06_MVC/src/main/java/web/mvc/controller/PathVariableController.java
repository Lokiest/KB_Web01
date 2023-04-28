package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

	@RequestMapping("/{type}/{id}.do")
	public void aa(@PathVariable String type, @PathVariable String id) {
		System.out.println("Path");
	}
	
	@RequestMapping("/{id}")
	public String bb(@PathVariable String id) {
		System.out.println("Path 2");
		return "result";
	}
	
	@RequestMapping("/{kind}/{id}/{num}")
	public String cc(@PathVariable String id, @PathVariable int num) {
		System.out.println("Path 3");
		return "result";
	}
	
}
