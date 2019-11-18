package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Entity.User;
import Service.BookService;
import Service.MovieService;

@Controller
public class MovieControllerImpl {
	@Autowired
	private MovieService movieService;
	@RequestMapping("/FirstPage")
	public ModelAndView doBookMethod(@RequestParam("Title") String title, 
			@RequestParam("DirectorName") String DirectorName,
			@RequestParam("Rating") String rating,
			@RequestParam("movieId") int movieId)

	{
		ModelAndView mav;
		User cred = new User(movieId,DirectorName, title,rating);
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
