package demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.domains.Book;
import demo.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;

	public List<Book> findAllBooks() {		
		return this.repository.findAll();
	}

	public Book findBookById(Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteBook(Long bookId) {
		// TODO Auto-generated method stub

	}

	public Book updateBook(Book book, Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book updateBook(Map<String, String> updates, Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
