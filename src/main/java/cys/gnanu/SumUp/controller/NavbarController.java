package cys.gnanu.SumUp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import cys.gnanu.SumUp.TO.UserForm;
import cys.gnanu.SumUp.repo.UserDAO;
import cys.gnanu.SumUp.service.GroupService;
import cys.gnanu.SumUp.service.UserService;

@Controller
public class NavbarController {

	@Autowired
	UserDAO userdao;
	@Autowired
	UserService service;
	@Autowired
	GroupService groupService;
	
	Logger logs = LoggerFactory.getLogger(NavbarController.class);

	@GetMapping("/home")
	public String home() {
		return "NavBar"; 
	}
	@GetMapping("/login")
	public String login(Model userForm) {
		userForm.addAttribute("userForm", new UserForm());
		return "homepage"; 
	}
	
	
	@GetMapping("/register")
	public String register(Model userForm) {
		userForm.addAttribute("userForm", new UserForm());
		return "register"; 
	}
	//user
	@GetMapping("/user")
	public String user(Model userForm) {
		userForm.addAttribute("userForm", new UserForm());
		return "user"; 
	}
	
	//group	
	@GetMapping("/group")
	public String group(Model userForm) {
		userForm.addAttribute("userForm", new UserForm());
		return "group"; 
	}
	//About
	@GetMapping("/about")
	public String about(Model userForm) {
		userForm.addAttribute("userForm", new UserForm());
		return "about"; 
	}
	
//	@PostMapping("/addUser")
//	public String createUser(@RequestBody User user, Model model) {
//		
//		model.addAttribute("submittedUser", user);
//		return "result";
//	}

	
	
	
	

}
