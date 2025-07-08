package Grras_Solutions;

import javax.swing.*;
import java.util.Scanner;


public class Phoni_Book {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] contacts = new String[100][];
        System.out.println("\t\t\tWelcome to the PhoniBook\t\t\t");
        System.out.println("This allows you to Store Contacts and Modify them");

        System.out.println(
                "------------------------------------------------------------------------------------------");

        int a = 1;
        while (a != 0) {
            System.out.println("Please Select from the following Opreations: \n1.Adding New Contacts \n2. Searching " +
                    "Number" +
                    " Number " +
                    "\n3. Deleting the Contacts \n4. Updating the Contacts\n5. Showing all the Contacts \n");
            System.out.print("Enter the Opreation you want to Use: ");
            int opreation = in .nextInt();
            switch (opreation) {
                case 1:
                    contacts = add();
                    System.out.println("All the Details have been Saved Successfully!");
                    System.out.println("------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    check(contacts);
                    System.out.println("------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    contacts = Delete(contacts);
                    System.out.println("------------------------------------------------------------------------------------------");
                    break;
                case 4:
                    contacts = update(contacts);
                    System.out.println("------------------------------------------------------------------------------------------");
                    break;
                case 5:
                    show(contacts);
                    System.out.println("------------------------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Wrong Opreation Selected!! \nKindly Select Correct Option");

            }
            System.out.println();
            System.out.print("Press 1 to Continue or Press 0 to Exit: ");
            a = in .nextInt();
            System.out.println(
                    "------------------------------------------------------------------------------------------\n");

        }
        System.out.println("------------------------------------------------------------------------------------------\n");
        System.out.println("Thank you for Using PhoniBook. Hope to See you Soon");
    }

    public static void check(String[][] s) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Name to Search for the Contact: ");
        String input = in .next();
        boolean res = false;
        for (int i = 0; i < s.length; i++) {
            if (input.equals(s[i][0])) {
                res = true;
                System.out.println("Number of " + input + " is " + s[i][1]);
                System.out.println();
                System.out.println("Contact Searched Successfully!");
                break;
            }
        }
        if (res == false) {
            System.out.println("Number not Found in the PhoniBook with the Name " + input);
        }
    }
    public static String[][] add() {
        Scanner in = new Scanner(System.in);
        String contact[][] = new String[100][];
        int a = 0;
        System.out.print("Enter the Total Number of Contact you want to input: ");
        int input = in .nextInt();
        for (int i = 0; i < input; i++) {

            System.out.print("Enter the Name of the Contact " + (i + 1) + " : ");
            String var1 = in .next();
            System.out.print("Enter the Contact Number of the " + var1 + " : ");
            String var2 = in .next();
            contact[i] = new String[] {
                    var1,
                    var2
            };
        }
        return contact;
    }
    public static String[][] Delete(String[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Name or contact you want to delete: ");
        String input = in .next();
        for (int i = 0; i < arr.length; i++) {
            if (input.equals(arr[i][0])) {
                arr[i] = new String[] {
                        "deleted",
                        "deleted"
                };
                System.out.println("Contact Deleted Succesfully from the PhoniBook!!");
                return arr;
            } else
                continue;
        }
        System.out.println("Contact Not Found in the PhoniBook!!");
        return arr;
    }
    public static String[][] update(String arr[][]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of Person whose contact has to be updated: ");
        String input = in .next();
        for (int i = 0; i < arr.length; i++) {
            if (input.equals(arr[i][0])) {
                System.out.print("Enter the Updated Contact Number: ");
                String result = in .next();
                arr[i] = new String[] {
                        input,
                        result
                };
                System.out.println("Contact Details Updated Succesfully");
                return arr;
            } else
                continue;
        }
        System.out.println("Name not found in the PhoniBook");
        return arr;
    }
    public static void show(String[][] arr) {
        System.out.println("Name ||Number");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                if (!arr[i][0].equals("deleted")) {
                    System.out.println(arr[i][0] + "||" + arr[i][1]);


                }
        }

    }

}