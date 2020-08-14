package com.leslie.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	private static final String key = "yee";
	private static final String key_msg = "key_msg";

	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute(key) == null) {
			session.setAttribute(key, 1);
			System.out.println("first time hitting page");
			session.setAttribute(key_msg, "");
		} else {
			int count = (int) session.getAttribute(key);
			session.setAttribute(key, ++count);
			System.out.println("second time hitting page");
			if (count >= 5) {
				session.setAttribute(key_msg, "You might wanna get a life, buddy");
			}
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
	
	@RequestMapping("/reset-counter")
	public String resetcounter(HttpSession session) {
		if(session.getAttribute(key) != null) {
			session.removeAttribute(key);
		}
		return "redirect:/";
	}

}
