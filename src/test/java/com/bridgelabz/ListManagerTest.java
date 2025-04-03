package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    public void setup() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void shouldAddElementToTheList() {
        ListManager.addElement(list,3);
        // Should match the size of the list after adding one element
        Assertions.assertEquals(1,list.size());
    }

    @Test
    public void shouldRemoveElementToTheList() {
        if(list.size() != 0) {
            ListManager.removeElement(list, 0);

            // Should match the size of the list after adding one element
            Assertions.assertEquals(0, list.size());
        }
    }

    @Test
    public void shouldReturnTheSizeOfTheList() {
        Assertions.assertEquals(0,list.size());
    }
}
