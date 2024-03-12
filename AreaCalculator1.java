package org.example;

import java.util.Scanner;

public class AreaCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Area Calculator\n");

        char choice;
        do {
            System.out.print("Calculate area of a circle, square, or rectangle? (c/s/r): ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 'c':
                    calculateCircleArea(scanner);
                    break;
                case 's':
                    calculateSquareArea(scanner);
                    break;
                case 'r':
                    calculateRectangleArea(scanner);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nContinue? (y/n): ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline character
        } while (choice == 'y');

        System.out.println("Goodbye!");
    }

    private static void calculateCircleArea(Scanner scanner) {
        System.out.println("\nCIRCLE:");
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    private static void calculateSquareArea(Scanner scanner) {
        System.out.println("\nSQUARE:");
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        double area = width * width;
        System.out.println("Area: " + area);
    }

    private static void calculateRectangleArea(Scanner scanner) {
        System.out.println("\nRECTANGLE:");
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double area = width * height;
        System.out.println("Area: " + area);
    }
}
