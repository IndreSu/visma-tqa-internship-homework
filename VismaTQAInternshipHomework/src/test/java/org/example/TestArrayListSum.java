package org.example;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class TestArrayListSum {

    @Test
    public void testArrayListSum() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        int sum = ArrayListSum.calculateArrayListNumbers(numbers);
        assertEquals(30, sum);
    }
}
