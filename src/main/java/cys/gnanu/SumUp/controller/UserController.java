package cys.gnanu.SumUp.controller;

import java.security.SecureRandom;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import cys.gnanu.SumUp.TO.GroupForm;
import cys.gnanu.SumUp.TO.UserForm;
import cys.gnanu.SumUp.data.User;
import cys.gnanu.SumUp.repo.UserDAO;
import cys.gnanu.SumUp.service.UserService;

@Controller
public class UserController {

	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final SecureRandom random = new SecureRandom();
	
	Logger logs = LoggerFactory.getLogger(NavbarController.class);

	@Autowired
	UserDAO userDAO;
	
	
	@Autowired
	UserService userService;

//	@GetMapping("/getUserByAlias")
//	public User gerUser(String alias) {
//		User userName = userDAO.findByAlias("VAELJI");
//
//		return userName;
//	}
	
	@PostMapping("/submit")
	public String submitForm(UserForm form, Model model) {
		logs.info("form values");
		model.addAttribute("form", new GroupForm());
		User user = new User();
		user.setFname(form.getFname());
		user.setLname(form.getLname());
		user.setPassword(form.getPassword());
		user.setMobile(form.getMobile());
		user.setEmail(form.getEmail());
		
		List<User> userName = userService.findDuplicateAlias(form.getAlias());
		if(userName.size() > 0) {
			logs.info("Alias already exists: {}", form.getAlias());
			model.addAttribute("error", "Alias already exists. Please choose a different alias.");
			return "homepage"; // Handle duplicate alias case
		}
		user.setAlias("vaelji");
		logs.info("User details: {}", user);
		userService.addUser(user);
		
//		List<User> allUsers=userDAO.findAll();
		
		return "result";	
	}

	
	public String createAlias() {
		StringBuilder alias = new StringBuilder(5);
		for (int i = 0; i < 5; i++) {
			int index = random.nextInt(CHARACTERS.length());
			alias.append(CHARACTERS.charAt(index));
		}
		return alias.toString();
	}

	

}
