package Tic_Tac_Toe;

import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String b1 = "1", b2 = "2", b3 = "3", b4 = "4", b5 = "5", b6 = "6", b7 = "7", b8 = "8", b9 = "9";

        System.out.println(b1 + " | " + b2 + " | " + b3 + " ");
        System.out.println("---------");
        System.out.println(b4 + " | " + b5 + " | " + b6 + " ");
        System.out.println("---------");
        System.out.println(b7 + " | " + b8 + " | " + b9 + " ");
        int val = 0;

        while (val != 1) {
            System.out.print("Player 1 (X) Enter Number where X has to be Placed: ");
            String p1 = in.next();
            if (b1.equals(p1))
                b1 = "X";
            else if (b2.equals(p1))
                b2 = "X";
            else if (b3.equals(p1))
                b3 = "X";
            else if (b4.equals(p1))
                b4 = "X";
            else if (b5.equals(p1))
                b5 = "X";
            else if (b6.equals(p1))
                b6 = "X";
            else if (b7.equals(p1))
                b7 = "X";
            else if (b8.equals(p1))
                b8 = "X";
            else if (b9.equals(p1))
                b9 = "X";
            else {
                System.out.println("Invalid Input");

                continue;
            }
            if (b1.equals(b2) && b2.equals(b3)) {
                val = 1;
                System.out.println("Player 1 Wins the Match");
            } else if (b4.equals(b5) && b5.equals(b6)) {
                val = 1;
                System.out.println("Player 1 Wins the Match");
                break;
            } else if (b7.equals(b8) && b8.equals(b9)) {
                val = 1;
                System.out.println("Player 1 Wins the Match");
                break;
            } else if (b1.equals(b3) && b3.equals(b7)) {
                val = 1;
                System.out.println("Player 1 Wins the Match");
                break;
            } else if (b2.equals(b5) && b5.equals(b8)) {
                val = 1;
                System.out.println("Player 1 Wins the Match");
                break;
            } else if (b3.equals(b6) && b6.equals(b9)) {
                val = 1;
                System.out.println("Player 1 Wins the Match");
                break;
            } else if (b1.equals(b5) && b5.equals(b9)) {
                val = 1;
                System.out.println("Player 1 Wins the Match");
                break;
            } else if (b3.equals(b5) && b5.equals(b7)) {
                val = 1;
                System.out.println("Player 1 Wins the Match");
                break;
            } else
                val = 0;
            System.out.println(b1 + " | " + b2 + " | " + b3 + " ");
            System.out.println("---------");
            System.out.println(b4 + " | " + b5 + " | " + b6 + " ");
            System.out.println("---------");
            System.out.println(b7 + " | " + b8 + " | " + b9 + " ");


            System.out.print("Player 2 (O) Enter Number where X has to be Placed: ");
            String p2 = in.next();
             if (b1.equals(p2))
                b1 = "O";
            else if (b2.equals(p2))
                b2 = "O";
            else if (b3.equals(p2))
                b3 = "O";
            else if (b4.equals(p2))
                b4 = "O";
            else if (b5.equals(p2))
                b5 = "O";
            else if (b6.equals(p2))
                b6 = "O";
            else if (b7.equals(p2))
                b7 = "0";
            else if (b8.equals(p2))
                b8 = "O";
            else if (b9.equals(p2))
                b9 = "0";
            else {
                System.out.println("Invalid Input");

                continue;
            }
            System.out.println(b1 + " | " + b2 + " | " + b3 + " ");
            System.out.println("---------");
            System.out.println(b4 + " | " + b5 + " | " + b6 + " ");
            System.out.println("---------");
            System.out.println(b7 + " | " + b8 + " | " + b9 + " ");

            if (b1.equals(b2) && b2.equals(b3)) {
                val = 1;
                System.out.println("Player 2 Wins the Match");
                break;
            } else if (b4.equals(b5) && b5.equals(b6)) {
                val = 1;
                System.out.println("Player 2 Wins the Match");
                break;
            } else if (b7.equals(b8) && b8.equals(b9)) {
                val = 1;
                System.out.println("Player 2 Wins the Match");
                break;
            } else if (b1.equals(b3) && b3.equals(b7)) {
                val = 1;
                System.out.println("Player 2 Wins the Match");
                break;
            } else if (b2.equals(b5) && b5.equals(b8)) {
                val = 1;
                System.out.println("Player 2 Wins the Match");
                break;
            } else if (b3.equals(b6) && b6.equals(b9)) {
                val = 1;
                System.out.println("Player 2 Wins the Match");
                break;
            } else if (b1.equals(b5) && b5.equals(b9)) {
                val = 1;
                System.out.println("Player 2 Wins the Match");
                break;
            } else if (b3.equals(b5) && b5.equals(b7)) {
                val = 1;
                System.out.println("Player 2 Wins the Match");
                break;
            } else
                val = 0;

        }

    }

}