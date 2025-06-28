package Largest_Number;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number a: ");
        int a = input.nextInt();
        System.out.print("Enter Number b: ");
        int b = input.nextInt();
        System.out.print("Enter Number c: ");
        int c = input.nextInt();
        if(a>b && a>c){
            System.out.println("The Greatest Number is "+ a);
        } else if (b>a && b>c) {
            System.out.println("The Greatest Number is "+ b);
        }else {
            System.out.println("The Greatest Numbr is "+ c);
        }
    }
}
