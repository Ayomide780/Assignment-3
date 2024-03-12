package org.example;

import java.util.Scanner;

class Die {
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }
}

public class Diceroller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dice Roller!");

        char choice;
        do {
            System.out.print("\nRoll the dice? (y/n): ");
            choice = scanner.next().charAt(0);

            if (choice == 'y') {
                Die die1 = new Die(6);
                Die die2 = new Die(6);

                int roll1 = die1.roll();
                int roll2 = die2.roll();
                int total = roll1 + roll2;

                System.out.println("\nDie 1: " + roll1);
                System.out.println("Die 2: " + roll2);
                System.out.println("Total: " + total);

                if (total == 7) {
                    System.out.println("Craps!");
                } else if (total == 3) {
                    System.out.println("Snake eyes!");
                } else if (total == 12) {
                    System.out.println("Box cars!");
                }

                System.out.print("\nRoll again? (y/n): ");
                choice = scanner.next().charAt(0);
            }
        } while (choice == 'y');

        System.out.println("Goodbye!");
    }
}
