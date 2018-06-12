package com.santosh.pem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.santosh.pem.domain.User;
import com.santosh.pem.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService UserService;
	HttpSession session;

	@RequestMapping(value="/home.htm", method=RequestMethod.GET)
	 public ModelAndView showHomePage(){
		 ModelAndView model=new ModelAndView("home");
		 return model;
	  }
	
	@RequestMapping(value="/logincheck.htm", method=RequestMethod.POST)
    public ModelAndView showUser(HttpServletRequest request,HttpServletResponse response,@RequestParam("username")String username,@RequestParam("password")String password){
		
		User user;
		 try{
		  user=UserService.loginUser(username);
		 }
		 catch(Exception e){
			 ModelAndView model=new ModelAndView("home");
			 model.addObject("msg","Wrong username or Password...!!");
			 return model;
		 }
		 if(user.getPassword().equals(password)){
			 
			  session=request.getSession();
			 session.setAttribute("userid", user.getId());
			 session.setAttribute("name", user.getFirstName());
		 ModelAndView model=new ModelAndView("userHome");
		 model.addObject("msg",session.getAttribute("name"));
		 return model;
		 }
		 else {
			 
			 ModelAndView model=new ModelAndView("home");
			 model.addObject("msg","Wrong username or Password...!!");
			 return model;
		 }
	}
	

	@RequestMapping(value="/userHome.htm", method=RequestMethod.GET)
	 public ModelAndView showUserHomePage(HttpServletRequest request,HttpServletResponse response){
		session=request.getSession();
	 ModelAndView model=new ModelAndView("userHome");
	 model.addObject("msg",session.getAttribute("name"));
	 return model;
	  }
	
	@RequestMapping(value="/logout.htm", method=RequestMethod.GET)
	 public ModelAndView logout(HttpServletRequest request,HttpServletResponse response){
		session.removeAttribute("userid");
		session.removeAttribute("name");
	 ModelAndView model=new ModelAndView("home");
	 return model;
	  }
	
	@RequestMapping(value="/addUser.htm", method=RequestMethod.GET)
	 public ModelAndView addUserPage(){
	 ModelAndView model=new ModelAndView("userRegistration");
	 return model;
	  }
	
	@RequestMapping(value="/registerUser.htm", method=RequestMethod.POST)
	 public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("User")User user){
	 
		int result=UserService.addUser(user);
		
		if(result==1){
			ModelAndView model=new ModelAndView("home");
			model.addObject("msg","Registeration Succesfull...");
			 return model;
		}
		else
		{
			ModelAndView model=new ModelAndView("userRegistration");
			model.addObject("msg","Registeration failed..Try Again..");
			return model;
		}
	
	  }
	
}
