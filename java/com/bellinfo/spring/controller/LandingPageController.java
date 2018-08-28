package com.bellinfo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.spring.model.Links;
import com.bellinfo.spring.model.LoginCredentials;
import com.bellinfo.spring.model.Register;
import com.bellinfo.spring.service.StudentService;

@Controller
public class LandingPageController {

	@Autowired
	StudentService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String landingpage(Model model) {
		System.out.println("hello there");
	
		return "welcome";

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String loginPage(Model model) {
		Register lc = new Register();
		model.addAttribute("lc", lc);
		System.out.println("in register"+lc);
		return "register";

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postloginPage(Model model, @ModelAttribute Register s1) {
		
		System.out.println("*************" + s1);
		service.processStudentData(s1);

		String text = " Hello: " + s1.getFirstname() + " welcome";

		model.addAttribute("message", text);
		return "sucess";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String registerPage(Model model) {
		LoginCredentials lc1 = new LoginCredentials();
		System.out.println(lc1);
		model.addAttribute("lc1", lc1);
		System.out.println("in login get");
		return "login1";

	}
	
	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginpost(Model model, @ModelAttribute LoginCredentials lc1) {

		System.out.println("in login post page");
		System.out.println(lc1.toString());
		Register s2 = new Register(lc1.getName(), lc1.getPassword());
		boolean password = service.processStudentvalidation(s2);
		System.out.println(password);

		if (!password) {
			registerPage(model);
			return "login1";
		} else {
			System.out.println(lc1);
			String text = "  " + lc1.toString() + " You are Logged in.";
			model.addAttribute("message", text);

			return "moreinfo";
		}
		
	}
	
	@RequestMapping(value = "/television", method = RequestMethod.GET)
	public String television(Model model) {
		
		/*Links links = service.fetchlinks("'tv'");
		model.addAttribute("links", links);
		System.out.println(links.toString());*/
		return "showtelevision";

	}
	
	@RequestMapping(value = "/laptop", method = RequestMethod.GET)
	public String laptop(Model model) {
		
		//Links links = service.fetchlinks("'laptop'");
		//model.addAttribute("links", links);
		//System.out.println(links.toString());
		return "showlaptops";

	}
	
	@RequestMapping(value = "/mobiles", method = RequestMethod.GET)
	public String mobiles(Model model) {
		
		/*Links links = service.fetchlinks("'mobile'");
		model.addAttribute("links", links);
		System.out.println(links.toString());*/
		return "showmobile";

	}
}
