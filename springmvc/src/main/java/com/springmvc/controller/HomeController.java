package com.springmvc.controller;



import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.springmvc.bean.Organization;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/Details", method = RequestMethod.GET)
	public ModelAndView OrgGet() {
		return new ModelAndView("Details", "Details", new Organization());
	}
	@RequestMapping(value ="/DetailsForm", method = RequestMethod.POST)
	public ModelAndView OrgPost(@ModelAttribute(value = "details") Organization details) {
		return new ModelAndView("Sucessfully Registered");
	}
	

}
