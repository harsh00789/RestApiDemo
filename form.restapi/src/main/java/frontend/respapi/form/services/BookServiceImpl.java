package frontend.respapi.form.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frontend.respapi.form.dao.BookDao;
import frontend.respapi.form.entities.Book;

@Service
public class BookServiceImpl implements BookService{
   
	@Autowired
	private BookDao bd;
	
	@Override
	public Book addbook(Book book) {
	
		
		return bd.save(book);
		
	}

	
}
