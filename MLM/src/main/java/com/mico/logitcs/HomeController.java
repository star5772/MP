package com.mico.logitcs;

import javax.inject.Inject;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mico.logitcs.dao.UserDao;
import com.mico.logitcs.entity.User;
import com.mico.logitcs.entity.UserDto;


@Controller
public class HomeController {
	
	@Inject
	private UserDao dao;
	@Inject
	private ModelMapper modelMapper;
	
	@GetMapping({"/user/join","/"})
	public ModelAndView write() {
		return new ModelAndView("home");
	}
	
	@PostMapping("/user/join")
	public String write(User user) {
		System.out.println(user.getUno());
		System.out.println(user.getUserName());
		//dao.insert(user);
		
		return "redirect:system/msg";
	}
	
	
}
