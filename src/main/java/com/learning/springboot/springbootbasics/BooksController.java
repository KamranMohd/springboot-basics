package com.learning.springboot.springbootbasics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Books> getBooks(){
		Books book1 = new Books("Master Jenkins", "Mohd Kamran", 101);
		List<Books> result = new ArrayList<>();
		result.add(book1);
		result.add(new Books("MBA Guru", "Mohd Saquib", 201));
		return result;
	}
}
