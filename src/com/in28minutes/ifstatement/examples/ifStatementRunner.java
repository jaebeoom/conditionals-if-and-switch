package com.in28minutes.ifstatement.examples;

public class ifStatementRunner {
    public static void main(String[] args) {
//        puzzle1();
//        puzzle2();
//        puzzle3();
        puzzle5();
    }

    private static void puzzle1() {
        int k = 15;
        if (k > 20) {
            System.out.println(1);
        } else if (k > 10) {
            System.out.println(2);
        } else if (k < 20) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }

    private static void puzzle2() {
        int l = 15;

        if (l < 20) {
            System.out.println("l < 20");
        }
        if (l > 20) {
            System.out.println("l > 20");
        } else {
            System.out.println("Who am I?");
        }
    }

    private static void puzzle3() {
        int m = 15;

        if (m > 20) {
            if (m < 20) {
                System.out.println("m > 20");
            } else {
                System.out.println("Who am I?");
            }
        }
    }

    private static void puzzle5() {
        int num = 5;
        if (num < 0) {
            num = num + 10;
        }
            num++;
        System.out.println(num);
    }
}
