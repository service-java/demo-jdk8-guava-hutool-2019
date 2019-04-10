package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class ListWithGenerics {

    private List<Author> authors;

    private class Author {
        private final String name;
        private Author(final String name) { this.name = name; }
        public String getName() { return name; }
    }

    @Before
    public void createAuthors() {
        authors = new ArrayList<>();

        authors.add(new Author("Stephen Hawking"));
        authors.add(new Author("Edgar Allan Poe"));
        authors.add(new Author("William Shakespeare"));
    }

    @Test
    public void authorListAccess() {
        final Author author = authors.get(2);
        assertEquals("William Shakespeare", author.getName());
    }
}

