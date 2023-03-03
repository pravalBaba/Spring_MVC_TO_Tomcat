package com.BikkadIT.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMvcFirstApp.model.Book;


@Controller
public class BookController {

	@GetMapping("/books")
	public ModelAndView getBookData() {
		
		Book book = new Book();
		
		book.setBookId(111);
		book.setBookName("Java");
		book.setBookPrice(675.00);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("BOOKS", book);
		mav.setViewName("book");
		
		
		
		return mav;
		
		
		
	}
	
}
