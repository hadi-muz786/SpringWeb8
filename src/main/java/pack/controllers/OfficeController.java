package pack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import paccck8.OfficeInf;
import pacck8.OfficeService;

@Controller
public class OfficeController {
	private OfficeService offserv;

	@RequestMapping(value = "office", method = RequestMethod.GET)
	public ModelAndView showAll() {
		System.out.println("this is the officeRoom");

		OfficeInf oi = offserv.AllService();
		System.out.println(oi.toString());

		ModelAndView ma = new ModelAndView("office");
		ma.addObject("hd", oi);
		ma.addObject("name", "Hadi Muzaffar");
    
		return ma;

	}

	public OfficeService getOffserv() {
		return offserv;
	}

	public void setOffserv(OfficeService offserv) {
		this.offserv = offserv;
	}

}
