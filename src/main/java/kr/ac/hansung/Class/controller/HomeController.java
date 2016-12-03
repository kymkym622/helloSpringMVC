package kr.ac.hansung.Class.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //@Componnet + 컨트롤러 역할
public class HomeController {	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showhome() {
		return "home";   //view's logical name
	}
	
}
