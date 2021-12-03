package com.mico.logitcs;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mico.logitcs.dao.UserDao;
import com.mico.logitcs.entity.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Inject
	private UserDao dao;
	
	@GetMapping("/")
	public ModelAndView write() {
		return new ModelAndView("home");
	}
	
	public String write(int uno,String userName) {
		dao.insert(user)
	}
	
	
}
