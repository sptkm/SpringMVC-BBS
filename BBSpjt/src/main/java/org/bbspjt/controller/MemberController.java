package org.bbspjt.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.bbspjt.domain.MemberVO;
import org.bbspjt.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/" )
public class MemberController{
	
	@Inject
	private MemberService service;
	

	@RequestMapping("/join")
	public String memberWrite(){	        
		return "join";
	 }

	@RequestMapping(value= "/insert" , method = RequestMethod.POST)
	public String memberInsert(@ModelAttribute MemberVO member)throws Exception{
		
	    service.insertMember(member);
	    return "redirect:/";
	}
	 
	 
	@RequestMapping(value = "/login")
	public String login()throws Exception{
		return "login";
	}

	@RequestMapping(value = "/loginCheck", method= RequestMethod.POST)
	public ModelAndView loginCheck(@ModelAttribute MemberVO member, HttpSession session) throws Exception{
		
		boolean result = service.loginCheck(member, session);
		ModelAndView mav= new ModelAndView();
		
		if (result == true) { 
            mav.setViewName("home");
            mav.addObject("msg", "success");
        } else {   
            mav.setViewName("login");
            mav.addObject("msg", "failure");
        }
        return mav;
	}
	
	@RequestMapping("/logout")
    public ModelAndView logout(HttpSession session) throws Exception{
        service.logout(session);
        ModelAndView mav = new ModelAndView();
        
        mav.setViewName("home");
        mav.addObject("msg", "logout");
        return mav;
    }
}
