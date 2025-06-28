package Largest_Number;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number a: ");
        int a = in.nextInt();
        System.out.print("Enter Number b: ");
        int b = in.nextInt();
        System.out.print("Enter Number c: ");
        int c= in.nextInt();
        if (a>b){
            if(a>c){
                System.out.println("The Greatest Number is :"+ a);
            } else{
                System.out.println("The Greatest NUmber is :"+ c);
            }
        } else {
            System.out.println("The Greatest Number is "+ b);
        }
    }
}
