package rikkei.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Given a equation ax + b = c");

        System.out.println("Please enter a");
        float a = scanner.nextFloat();
        System.out.println("Please enter b");
        float b = scanner.nextFloat();
        System.out.println("Please enter c");
        float c = scanner.nextFloat();

        if (a != 0){
            float x = (c-b)/a;
            System.out.println("x = " +x);
        } else {
            if(b == c) {
                System.out.println("x is all ");
            } else{
                System.out.println("No solution");
            }
        }
    }
}