package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Test;

import java.lang.reflect.Field;

import static junit.framework.Assert.assertEquals;

public class BookRecordReflectionTest {

    @Test
    public void mutateBookRecordState() throws NoSuchFieldException,
                                               IllegalAccessException {
        final BookRecord record = new BookRecord("Suzanne Collins", "The Hunger Games");

        final Field author = record.getClass().getDeclaredField("author");
        author.setAccessible(true);
        author.set(record, "Catching Fire");

        assertEquals("Catching Fire", record.getAuthor());
    }
}
