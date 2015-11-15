package ua.my.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.my.model.Bar;
import ua.my.model.Staff;
import ua.my.serviceImpl.BarService;
import ua.my.serviceInterface.BarServiceInterface;

@Controller
public class BarController {
	
	@Autowired
	private BarServiceInterface barServ;
	
	@RequestMapping(value = "/AlcoholMenu", method=RequestMethod.GET)
	public String getAlcoholMenu (Model model, @RequestParam (value = "id") String id){
		Integer intId = Integer.parseInt(id);
		if(intId != 0 && id !="" && id !=" ")
		model.addAttribute("AlcoholMenu", barServ.getAlcoholMenu(intId));
		return "bar";
	}
	
	@RequestMapping(value = "/NonAlcoholMenu", method=RequestMethod.GET)
	public String getNonAlcoholMenu (Model model, @RequestParam (value = "id") String id){
		Integer intId = Integer.parseInt(id);
		if(intId != 0 && id !="" && id !=" ")
		model.addAttribute("NonAlcoholMenu", barServ.getAlcoholMenu(intId));
		return "bar";
	}
	
	/* Shows random alcohol menu at startup*/
	@RequestMapping(value = "/RandomBoose", method=RequestMethod.GET)
	public String getRandomBoose (Model model){
		model.addAttribute("RandomBoose", barServ.randomAlcoholMenu());
		return "hello";
	}
	
	/*Creates an instance*/
	@RequestMapping(value = "/createBar", method=RequestMethod.GET)
	public void createBar (){
		barServ.pasteIntoDB(new Bar("Vodka", "Soda"));
	}
}
