import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        int userInput = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Would you like to add or subtract?");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        userInput = scnr.nextInt();


        System.out.println("Enter two operands to add/subtract");

        System.out.println("Enter operand 1:");
        operand1 = scnr.nextInt();

        System.out.println("Enter operand 2:");
        operand2 = scnr.nextInt();

        if (userInput == 1) {
            System.out.println("The sum is " + (operand1 + operand2));
        } else if (userInput == 2) {
            System.out.println("The difference is " + (operand1 - operand2));
        }



    }
}
