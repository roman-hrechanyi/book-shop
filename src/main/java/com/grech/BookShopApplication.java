package com.grech;

import com.grech.model.Book;
import com.grech.service.BookService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookShopApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookShopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setTitle("Title");
            book.setAuthor("Author");
            book.setIsbn("Isbn");
            book.setPrice(BigDecimal.valueOf(111));
            bookService.save(book);
            System.out.println(bookService.findAll());
        };
    }

}
