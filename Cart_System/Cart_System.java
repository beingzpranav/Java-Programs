package Cart_System;

import java.util.Scanner;

public class Cart_System {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Daily Mart");
        System.out.println("Steps to Use: \n1. Enter the Product ID\n2. Enter the Quantity \n3.Head to the total to checkout");
        System.out.println();
        System.out.println("Products: \n001 Flour 35 Rs/Kg \n002 Sugar 40 Rs/Kg\n003 Milk 52 Rs/Ltr\n004 Salt 22 Rs/Kg\n005 Oil 128 Rs/Ltr");
       int flourqty=0, sugarqty=0, milyqty=0, saltqty=0, oilqty =0;
       int total = 0;
       int total_qty=0;
        System.out.print("Enter * to Start Shopping or Enter ! to Exit: ");
        String input = in.next();
        while(!input.equals("!")){
            System.out.print("Enter Product ID to purchase: ");
            int ID= in.nextInt();
            System.out.print("Enter the Qunatity of Product: ");
            int qty= in.nextInt();

            switch (ID){
                case 001:
                    flourqty +=qty;
                    total += qty*35;
                    break;
                case 002:
                    sugarqty +=qty;
                    total += qty*40;
                    break;
                case 003:
                    milyqty +=qty;
                    total += qty*52;
                    break;
                case 004:
                    saltqty +=qty;
                    total += qty*22;
                    break;
                case 005:
                    oilqty +=qty;
                    total += qty*128;
                    break;
                default:
                    System.out.println("Invalid Product ID");
            }
            total_qty +=qty;

            System.out.println("Enter ! to Exit or * to continue: ");
            input = in.next();
        }
        System.out.println("Final Bill: \n");
        if(flourqty>0)
            System.out.println("Flour * "+flourqty+" = "+(flourqty*35));
        if(sugarqty>0)
            System.out.println("Sugar * "+sugarqty+" = "+(sugarqty*40));
        if (milyqty>0)
            System.out.println("Milk * "+milyqty+" = "+(milyqty*52));
        if(saltqty>0)
            System.out.println("Salt * "+saltqty+" = "+(saltqty*22));
        if (oilqty>0)
            System.out.println("Oil * "+oilqty+" = "+(oilqty*128));
        System.out.println("--------------------------------------------");
        System.out.println("Total Items: "+total_qty);
        System.out.println("Total Amount: Rs "+total);
        System.out.println("Thank You for Shopping");
    }
}
