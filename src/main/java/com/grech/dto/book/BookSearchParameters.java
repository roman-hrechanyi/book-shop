package com.grech.dto.book;

import java.math.BigDecimal;

public record BookSearchParameters(String[] titles, String[] authors, BigDecimal[] prices) {
}
