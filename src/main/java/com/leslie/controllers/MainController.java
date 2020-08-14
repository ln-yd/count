package com.leslie.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		String key = "yee";
		if (session.getAttribute(key) == null) {
			session.setAttribute(key, 1);
			System.out.println("first time hitting page");
		} else {
			int count = (int) session.getAttribute(key);
			session.setAttribute(key, ++count);
			System.out.println("second time hitting page");
		}

		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(Model model) {

		return "counter.jsp";
	}

	@RequestMapping("/return")
	public String goback(RedirectAttributes ra) {
		return "redirect:/";
	}

}
