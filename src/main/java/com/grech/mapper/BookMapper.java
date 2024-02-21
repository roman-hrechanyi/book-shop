package com.grech.mapper;

import com.grech.config.MapperConfig;
import com.grech.dto.book.BookDto;
import com.grech.dto.book.CreateBookRequestDto;
import com.grech.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
