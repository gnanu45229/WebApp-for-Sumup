package cys.gnanu.SumUp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

  @GetMapping("/dashboard")
  public String dashboard(Model model) {
    model.addAttribute("pageTitle", "Dashboard");
    model.addAttribute("statsSummary", "All green ✅");
    return "dashboard/index";
  }

  @GetMapping("/users")
  public String users(Model model) {
    model.addAttribute("pageTitle", "Users");
    model.addAttribute("users", List.of(/* ... */));
    return "users/list";
  }
}
