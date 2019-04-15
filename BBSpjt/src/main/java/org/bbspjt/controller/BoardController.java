package org.bbspjt.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.bbspjt.domain.BoardVO;
import org.bbspjt.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model)throws Exception{
		
		model.addAttribute("list",service.listAll());
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.GET) 
	  public void registerGET(BoardVO board, Model model) throws Exception {		
		logger.info("register get..............");		
	}

	@RequestMapping(value = "/regist", method = RequestMethod.POST) 
	public String registPOST(BoardVO board, HttpSession session) throws Exception { 
	    
	    String writer = (String)session.getAttribute("memID");
	   
		board.setBdWriter(writer);
		service.regist(board);  	    
	    
		return "redirect:/listAll";
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET) 
	public void read(@RequestParam("bdID")int bdID, Model model) throws Exception{
		
		model.addAttribute(service.read(bdID));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int bdID, Model model) throws Exception {

		model.addAttribute(service.read(bdID));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, HttpSession session) throws Exception {
		
		service.modify(board);
		return "redirect:/listAll";
    }
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String removePOST(@RequestParam("bdID") int bdID, RedirectAttributes rttr) throws Exception{
		
		service.remove(bdID);
		return "redirect:/listAll";
	}	
	
}
