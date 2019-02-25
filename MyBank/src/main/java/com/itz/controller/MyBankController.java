package com.itz.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itz.model.MyBank;
import com.itz.service.MyBankServiceImpl;

@Controller
public class MyBankController {
	
	@Autowired
	private MyBankServiceImpl myBankService;
	
	
	@RequestMapping(value = "/display.htm")
	 public String display(Model model) {
		 List<MyBank> listCust=myBankService.getAllCustomers();
		 model.addAttribute("listCust",listCust);
		 
		System.out.println(listCust);
		 return "display";
	 }
	 
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/showForm.htm")
	public String showForm(Model model) {
			model.addAttribute("e",new MyBank());
		return "showForm";	
	}
	
	@RequestMapping(value="/showData",method=RequestMethod.POST)
	public String showData(@ModelAttribute("e") MyBank myBank,Model model) {
			model.addAttribute("e",myBank);
			String sMsg="Registration success";
			model.addAttribute("sMsg",sMsg);
		
			//saving in db
			
			myBankService.addMyBank(myBank);
					
		return "showForm";
	}
	
		

}
