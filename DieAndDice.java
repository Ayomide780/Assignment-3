import java.util.Scanner;

// Die class
class Die {
    private int value;

    public Die() {
        this.value = 0;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6) + 1;
    }

    public int getValue() {
        return this.value;
    }
}

// Dice class
class Dice {
    private Die die1;
    private Die die2;

    public Dice() {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    public int getDie1Value() {
        return this.die1.getValue();
    }

    public int getDie2Value() {
        return this.die2.getValue();
    }

    public int getSum() {
        return this.die1.getValue() + this.die2.getValue();
    }

    public void roll() {
        this.die1.roll();
        this.die2.roll();
    }

    public void printRoll() {
        System.out.println("Die 1: " + getDie1Value());
        System.out.println("Die 2: " + getDie2Value());
        System.out.println("Total: " + getSum());

        int total = getSum();
        if (total == 7) {
            System.out.println("Craps!");
        } else if (total == 2) {
            System.out.println("Snake eyes!");
        } else if (total == 12) {
            System.out.println("Box cars!");
        }
    }
}

public class DieAndDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dice Roller!");

        char choice;
        do {
            System.out.print("\nRoll the dice? (y/n): ");
            choice = scanner.next().charAt(0);

            if (choice == 'y' || choice == 'Y') {
                Dice dice = new Dice();
                dice.roll();
                dice.printRoll();
            }
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Goodbye!");
    }
}
