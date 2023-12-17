package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home/{id}")
	public String home(@PathVariable("id") int id)
	{
		System.out.println("The id is :"+id);
		System.out.println("This is url home");
		String name=null;
		System.out.println(name.length());
		
		return "home";
		
		
	}

}
