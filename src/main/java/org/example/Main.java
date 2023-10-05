package org.example;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true) {
            System.out.println("Please enter a whole integer (enter 0 to stop):");
            try {
            int number = Integer.parseInt(scanner.nextLine());
                if (number == 0) {
                    break;
                }
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid whole number.");
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        while (true) {
            System.out.println("Please enter a number corresponding to today's day: if Monday, enter 1, Tuesday - 2, Wednesday - 3, Thursday - 4, Friday - 5, Saturday - 6, Sunday - 7");
            int dayToday = Integer.parseInt(scanner.nextLine());

            if (dayToday >= 1 && dayToday <= 7) {
                int sumDividedDayToday = sum / dayToday;
                System.out.println("Sum of all numbers divided by a number of today's day is: " + sumDividedDayToday);
                break;
            } else {
                System.out.println("Enter a valid number from 1 to 7");
            }
        }

        ArrayListSize.showArrayListSize(numbers);

        ArrayListNumbers.showArrayListNumbers(numbers);
    }
}