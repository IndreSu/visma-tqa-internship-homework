package org.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        LocalDate today = LocalDate.now();
        System.out.println("Today is day "+ today.getDayOfWeek().getValue());
        System.out.println("Please enter a whole integer (0 to stop):");

        while (true) {
            try {
            int number = Integer.parseInt(scanner.nextLine());
                if (number == 0) {
                    break;
                }
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid whole number!");
            }
        }


        int sum = ArrayListSum.calculateArrayListNumbers(numbers);

        int sumDividedDayToday = sum / today.getDayOfWeek().getValue();
        System.out.println("Sum of all numbers divided by today's day is: " + sumDividedDayToday);

        System.out.println("Choose menu item:");
        System.out.println("1. The size of the array");
        System.out.println("2. The numbers of the array");
        System.out.println("0. Exit the program");

        while (true) {
            int menuItem = Integer.parseInt(scanner.nextLine());
                if (menuItem == 0) {
                    break;
                } else if (menuItem == 1) {
                    System.out.println("The size of the array is: " + ArrayListSize.showArrayListSize(numbers));
                } else if (menuItem == 2) {
                    System.out.println("The numbers of the array are: ");
                    ArrayListNumbers.showArrayListNumbers(numbers);
                } else {
                    System.out.println("Invalid input. Please enter a valid number (0-2)!");
                }
            }
        scanner.close();
        }
    }
