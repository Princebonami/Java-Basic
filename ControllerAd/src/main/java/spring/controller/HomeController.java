package spring.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
public class HomeController {
	Scanner scanner=new Scanner(System.in);
	@GetMapping()
	public String home(Model model)
	{
		System.out.println("home 1 run");
		System.out.println("Enter the name :");
		String name=scanner.nextLine();
		model.addAttribute("name",name);
		return "index";
	}
   
	@RequestMapping("/walk")
	public String walk()
	{
		System.out.println("walk 1 run");
		return "index1";
	}
}
