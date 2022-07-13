package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        //Type obj = new Type(argument);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Number1 : ");
        int num1 = scanner.nextInt();
        System.out.println("The number you enter is : " + num1);

        System.out.print("\nEnter Number2 : ");
        int num2 = scanner.nextInt();
        System.out.println("The number you enter is : " + num2);

        System.out.println("\n Choices Avatilable are ");
        System.out.println("1 : Add");
        System.out.println("2 : Subtract");
        System.out.println("3 : Multiply");
        System.out.println("4 : Divide");

        System.out.print("\nEnter Operation Mode : ");
        int opNum = scanner.nextInt();
        performOperationUsingSwitch(num1, num2, opNum);
//        performOperationUsingNestedIfElse(num1, num2, opNum);

    }

    private static void performOperationUsingSwitch(int num1, int num2, int opNum) {
        switch (opNum) {
            case 1 : System.out.println("The mode you enter is add : " + (num1 + num2)); break;
            case 2 : System.out.println("The mode you enter is subtract : " + (num1 - num2)); break;
            case 3 : System.out.println("The mode you enter is multiply : " + (num1 * num2)); break;
            case 4 : System.out.println("The mode you enter is divide : " + (num1 / num2)); break;
            default : System.out.println("Invalid Operation");
        }
    }

//    private static void performOperationUsingNestedIfElse(int num1, int num2, int opNum) {
//        if (opNum == 1) {
//            System.out.println("The mode you enter is add : " + (num1 + num2));
//        } else if (opNum == 2) {
//            System.out.println("The mode you enter is subtract : " + (num1 - num2));
//        } else if (opNum == 3) {
//            System.out.println("The mode you enter is multiply : " + (num1 * num2));
//        } else if (opNum == 4) {
//            System.out.println("The mode you enter is divide : " + (num1 / num2));
//        } else {
//            System.out.println("Invalid Operation");
//        }
//    }
}
