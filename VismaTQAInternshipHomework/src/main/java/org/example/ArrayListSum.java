package org.example;

import java.util.ArrayList;

public class ArrayListSum {

    public static int calculateArrayListNumbers(ArrayList<Integer> listSum) {
        int sum = 0;
        for (int i = 0; i < listSum.size(); i++) {
            sum = sum + listSum.get(i);
        }
        return sum;
    }
}
