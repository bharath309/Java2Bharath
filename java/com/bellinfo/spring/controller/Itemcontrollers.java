package com.bellinfo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.spring.model.Products;
import com.bellinfo.spring.model.Register;
import com.bellinfo.spring.repository.StudentRepository;

@Controller
public class Itemcontrollers {
	
	@Autowired
	StudentRepository repository;

	
	
	@RequestMapping(value = "/laptop1", method = RequestMethod.GET)
	public String loginPage(Model model) {
		Products prod =repository.fetchItemRecord("'laptop1'");
		System.out.println("in laptop1"+prod);
		model.addAttribute("message1", String.valueOf(prod.getPrice()));
		model.addAttribute("message2", prod.getDescription());
		model.addAttribute("message3", "https://upload.wikimedia.org/wikipedia/commons/7/7b/HP_Envy_X2_%28edit%29.jpg");
	//	Products lc = new Products();
		model.addAttribute("prod", prod);
		
		return "showitemdetails";

	}

	@RequestMapping(value = "/laptop1", method = RequestMethod.POST)
	public String postloginPage(Model model, @ModelAttribute Register s1) {
		
		System.out.println("*************" + s1);
//		service.processStudentData(s1);

		String text = " Hello: " + s1.getFirstname() + " welcome";

		model.addAttribute("message", text);
		return "sucess";

	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.POST)
	public String cartPage(Model model,  @ModelAttribute("prod")Products s1) {
		System.out.println(s1);
		model.addAttribute("message", String.valueOf(s1.getPrice()));
		return "cart";

	}

}
