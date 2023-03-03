package com.greedy.branch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuTwoController {

	@GetMapping("/menu2")
	public void menu2(Model model) {
		model.addAttribute("message", "menu2 개발 완료");
		
	}
}
