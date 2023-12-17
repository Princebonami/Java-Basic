package springmvc.controller;

import java.util.InputMismatchException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userId") int userId)
	{
		System.out.println("run user id "+userId);
		String str=null;
		System.out.println(str.length());
		return "home";
	}

     
	@RequestMapping("/fileform")
	 public String showUploadForm()
	 {
		String str=null;
		System.out.println(str.length());
		 return "fileform";
	 }
	

}