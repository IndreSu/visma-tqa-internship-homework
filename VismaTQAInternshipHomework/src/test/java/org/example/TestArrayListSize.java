package org.example;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class TestArrayListSize {

    @Test
    public void testArrayListSize(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        int size = ArrayListSize.showArrayListSize(numbers);
        assertEquals(3, size);
    }
}
