package com.grech.mapper;

import com.grech.config.MapperConfig;
import com.grech.dto.BookDto;
import com.grech.dto.CreateBookRequestDto;
import com.grech.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
