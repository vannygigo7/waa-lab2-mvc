package com.sangvaleap.lab2mvc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String title;
    private String isbn;
    private String author;
}
