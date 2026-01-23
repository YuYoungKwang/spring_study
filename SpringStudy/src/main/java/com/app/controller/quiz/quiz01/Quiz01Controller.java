package com.app.controller.quiz.quiz01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz01")
public class Quiz01Controller {
	
	@RequestMapping("/main")
	public String main() {
		return "quiz01/main";
	}
	
	@RequestMapping("/product/mouse")
	public String mouse() {
		return "quiz01/product/mouse";
	}
	
	@RequestMapping("/product/keyboard")
	public String keyboard() {
		return "quiz01/product/keyboard";
	}
}
