package com.grech.repository.book;

import com.grech.exception.EntityNotFoundException;
import com.grech.model.Book;
import com.grech.repository.SpecificationProvider;
import com.grech.repository.SpecificationProviderManager;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BookSpecificationProviderManager implements SpecificationProviderManager<Book> {
    private final List<SpecificationProvider<Book>> bookSpecificationProviders;

    @Override
    public SpecificationProvider<Book> getSpecificationProvider(String key) {
        return bookSpecificationProviders.stream()
                .filter(provider -> provider.getKey().equals(key))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Can`t find correct specification "
                        + "provider for key " + key));
    }
}
