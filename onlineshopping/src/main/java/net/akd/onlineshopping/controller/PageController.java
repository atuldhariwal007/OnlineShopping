package net.akd.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
@RequestMapping(value={"/","/home","/index"})
public ModelAndView index(){
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("a","welcome to this page");
	return mv;
}
@RequestMapping(value="/test")
public ModelAndView test(){
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("test","welcome to this page");
	return mv;
}
}
