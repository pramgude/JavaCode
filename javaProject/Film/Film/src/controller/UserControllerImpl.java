package controller;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Entity.TicketBook;
import Entity.User;
import Service.BookService;

@Controller
public class UserControllerImpl {
	@Autowired
	private BookService bookService;
	@RequestMapping("/doBook")
	public ModelAndView doBookMethod(@RequestParam("Email") String email, 
			@RequestParam("Name") String Name,
	@RequestParam("Theatre") String Theatre,
@RequestParam("userId") int userId)
	{
		ModelAndView mav;
		User cred = new User(userId,email, Theatre,Name);
		//User cust = BookService.validate(cred);
		/*
		 * if(cust != null) mav = new ModelAndView("First", "cust", cust); else mav =
		 * new ModelAndView("UserDetails", "user", cred);
		 */
		if(cred != null) 
			mav = new ModelAndView("First", "cred", cred);
		else 
			mav = new ModelAndView("UserDetails", "user", cred);
		return mav;
	}
}
