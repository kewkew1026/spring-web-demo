package com.princeli.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplatesController {
	 @RequestMapping("/templates/{name}")
	 public String hello(@PathVariable("name") String name, Model model) {
	        model.addAttribute("name", name);
	        return "hello";
	 }
}
