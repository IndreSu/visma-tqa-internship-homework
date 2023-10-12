package org.example;

import java.util.ArrayList;

public class ArrayListNumbers {

    public static void showArrayListNumbers(ArrayList<Integer> listNumbers) {
        for (int i = 0; i < listNumbers.size(); i++) {
            System.out.print(listNumbers.get(i) + " ");
        }
        System.out.println();
    }
}
