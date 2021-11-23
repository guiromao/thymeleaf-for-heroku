package co.trucom.thymeleafproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/v1/thymeleaf")
public class HomeController {

	@GetMapping({"/", ""})
	public String indexPage() {
		return "index";
	}

	@GetMapping("/contacts")
	public String contactPage() {
		return "contacts";
	}

	@GetMapping("/code")
	public String codePage() {
		return "code";
	}

}
