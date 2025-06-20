package cys.gnanu.SumUp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cys.gnanu.SumUp.data.FixedInvestGroups;
import cys.gnanu.SumUp.data.User;
import cys.gnanu.SumUp.service.UserService;

@Controller
public class NavbarController {

	@Autowired
	UserService service;
	Logger logs = LoggerFactory.getLogger(NavbarController.class);

	@GetMapping("/home")
	public String home(Model user) {
		user.addAttribute("user", new User());
		return "homepage"; 
	}
	
//	@PostMapping("/addUser")
//	public String createUser(@RequestBody User user, Model model) {
//		
//		model.addAttribute("submittedUser", user);
//		return "result";
//	}

	@PostMapping("/submit")
	public String submitForm(@ModelAttribute("submittedUser") User user, Model model) {
		logs.info("form values");
		service.addUser(user);
		model.addAttribute("submittedUser", user);
		return "result";	
	}
	
	@PostMapping("/createGroups")
	public String createGroup(@RequestBody FixedInvestGroups groups,Model model) {
		model.addAttribute(groups);
		service.createGroup(groups);
		return "land";
	}
	

}
