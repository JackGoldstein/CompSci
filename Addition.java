import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter two operands to add");

        System.out.println("Enter operand 1:");
        operand1 = scnr.nextInt();

        System.out.println("Enter operand 2:");
        operand2 = scnr.nextInt();

        System.out.println("The sum is " + (operand1 + operand2));


    }
}
