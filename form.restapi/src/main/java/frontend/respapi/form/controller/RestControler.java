package frontend.respapi.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import frontend.respapi.form.entities.Book;
import frontend.respapi.form.services.BookService;


@Controller
public class RestControler {
	
	@Autowired       
	private BookService bs;
	
	@RequestMapping("/add")
	public String addform() {
		
		return "addbook";
	}
	
	
	@PostMapping("/addbook")
	public Book addbook(@ModelAttribute("bookob") Book book) {
		
		
		return bs.addbook(book);
		
	}

}
