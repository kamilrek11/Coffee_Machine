package machine;

import java.util.Scanner;
class Coffee {
    int[] coffeeMachine;
    Coffee() {
        coffeeMachine = new int[5];
        coffeeMachine[0] = 400;
        coffeeMachine[1] = 540;
        coffeeMachine[2] = 120;
        coffeeMachine[3] = 9;
        coffeeMachine[4] = 550;
    }
    public void buy () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffee = scanner.nextLine();
        if (coffee.equals("1")) {
            if (coffeeMachine[0] < 250) {
                System.out.println("Sorry, not enough water!");
            } else if (coffeeMachine[2] < 16) {
                System.out.println("Sorry, not coffee beans!");
            } else if (coffeeMachine[3] < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine[0] -= 250;
                coffeeMachine[2] -= 16;
                coffeeMachine[3] -= 1;
                coffeeMachine[4] += 4;
            }
        }
        if (coffee.equals("2")) {
            if (coffeeMachine[0] < 350) {
                System.out.println("Sorry, not enough water!");
            } else if (coffeeMachine[1] < 75){
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeMachine[2] < 20) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (coffeeMachine[3] < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine[0] -= 350;
                coffeeMachine[1] -= 75;
                coffeeMachine[2] -= 20;
                coffeeMachine[3] -= 1;
                coffeeMachine[4] += 7;
            }
        }
        if (coffee.equals("3")) {
            if (coffeeMachine[0] < 200) {
                System.out.println("Sorry, not enough water!");
            } else if (coffeeMachine[1] < 100){
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeMachine[2] < 12) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (coffeeMachine[3] < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else {
                coffeeMachine[0] -= 200;
                coffeeMachine[1] -= 100;
                coffeeMachine[2] -= 12;
                coffeeMachine[3] -= 1;
                coffeeMachine[4] += 6;
            }
        }
    }
    public void fill () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        coffeeMachine[0] += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        coffeeMachine[1] += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeMachine[2] += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        coffeeMachine[3] += scanner.nextInt();
    }
    public void take () {
        System.out.println("I gave you " + coffeeMachine[4]);
        coffeeMachine[4] = 0;
    }
    public void remaining () {
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachine[0] + " of water");
        System.out.println(coffeeMachine[1] + " of milk");
        System.out.println(coffeeMachine[2] + " of coffee beans");
        System.out.println(coffeeMachine[3] + " of disposable cups");
        System.out.println(coffeeMachine[4] + " of money");
    }
}
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new Coffee();
        String option;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            option = scanner.nextLine();
            if (option.equals("buy")) {
                coffee.buy();
            }
            if (option.equals("fill")) {
                coffee.fill();
            }
            if (option.equals("take")) {
                coffee.take();
            }
            if (option.equals("remaining")) {
                coffee.remaining();
            }
        } while (!option.equals("exit"));



    }

}
