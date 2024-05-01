package com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Mycontroller {
//@RequestMapping("/aaa")
//	public String openhello()
//	{
//		return "index";
//	}
////	
//	@RequestMapping("/bbb")
//	public String openhello()
//	{
//		return "redirect:/index";
//	}
//	
	@RequestMapping("/ccc")
	public RedirectView redirect ()
	{
		RedirectView redir=new RedirectView();
		redir.setUrl("/ppp");
		return redir;
	}
	
}
