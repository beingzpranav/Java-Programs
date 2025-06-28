package Largest_Number;

import java.util.Scanner;

public class Nested_Ternary {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number a: ");
        int a = input.nextInt();
        System.out.print("Enter Number b: ");
        int b = input.nextInt();
        System.out.print("Enter Number c: ");
        int c = input.nextInt();
        int Greatest = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("The Greatest Number is "+ Greatest);
    }
}
