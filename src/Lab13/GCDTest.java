package Lab13;

import java.util.Scanner;

public class GCDTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** GCD Calculator ***");
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println();
        input.close();

        System.out.println("1. for loop GCD:   " + GCD.forLoopGCD(num1, num2));
        System.out.println("2. while loop GCD: " + GCD.whileLoopGCD(num1, num2));
        System.out.println("3. recursive GCD:  " + GCD.recursionGCD(num1, num2));
    }
}
