package Largest_Number;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number a: ");
        int a = input.nextInt();
        System.out.print("Enter Number b: ");
        int b = input.nextInt();
        System.out.print("Enter Number c: ");
        int c = input.nextInt();
        int large1 = (a>b)?a:b;
        int large2= (large1 > c)?large1:c;
        System.out.println("The Greatest Number is "+ large2);

    }
}
