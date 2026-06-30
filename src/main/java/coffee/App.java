package coffee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);

        //3.1. Проверка InputMismatchException
        try {
            System.out.println("Enter the amount of water (ml):");
            int waterMl = sc.nextInt();
            System.out.println("Total amount of water, ml: " + waterMl );
        }
        catch (InputMismatchException e) {
            System.out.println("Error: a number must be entered");
        }

        //3.2. Проверка NotEnoughWaterException
        try {
            coffeeMachine.makeCoffee(100);
        }
        catch (NotEnoughWaterException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Coffee machine check complete.");
        }

        //3.3. Проверка ArithmeticException
        try {
            coffeeMachine.calculateCups(1000, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: cup size cannot be 0");
        }

        //3.4. Проверка NullPointerException
        try {
            String coffeeName = null;
            coffeeMachine.printCoffeeName(coffeeName);
        }
        catch (NullPointerException e) {
            System.out.println("Error: coffee name missing");
        }

    }
}
