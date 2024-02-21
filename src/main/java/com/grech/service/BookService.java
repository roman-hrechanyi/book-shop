package com.grech.service;

import com.grech.dto.book.BookDto;
import com.grech.dto.book.BookSearchParameters;
import com.grech.dto.book.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findById(Long id);

    void deleteById(Long id);

    BookDto update(Long id, CreateBookRequestDto requestDto);

    List<BookDto> search(BookSearchParameters searchParameters);
}
