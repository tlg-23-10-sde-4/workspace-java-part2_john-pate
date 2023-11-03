package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void numberInGenre_shouldReturnCorrectResult() {
        int result = catalog.numberInGenre(MusicCategory.POP);
        assertEquals(4, result);
    }

    @Test
    public void findSelfTitled_shouldReturnCollection_artistSameAsTitle() {
        Collection<MusicItem> items = catalog.findSelfTitled();
        assertEquals(2, items.size());
        for (MusicItem item : items) {
            assertTrue(item.getArtist().equals(item.getTitle()));
        }
    }

    @Test
    public void findByCategory_shouldReturnCollection_categoryFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);

        for (MusicItem item : items) {
            assertTrue(MusicCategory.POP == item.getMusicCategory());   // ok to use == for enu
            assertSame(MusicCategory.POP, item.getMusicCategory());
            assertEquals(MusicCategory.POP, item.getMusicCategory());   // uses equals() method
        }
    }

    @Test
    public void findByCategory_shouldReturnEmptyCollection_categoryNotFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.JAZZ);
        assertEquals(0, items.size());
    }

    @Test
    public void findById_shouldReturnMusicItem_idFound() {
        MusicItem item = catalog.findById(1L);
        assertNotNull(item);
        assertEquals(1L,item.getId().longValue());
    }

    @Test
    public void findById_shouldReturnNull_idNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
        assertTrue(item == null);
    }
}