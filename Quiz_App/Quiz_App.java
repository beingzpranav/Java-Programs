package Quiz_App;

import java.util.Scanner;


public class Quiz_App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Quizzer");
        System.out.println();
        System.out.println("Rules: For Every Correct Answer +1 and for every Incorrect answer -1");
        System.out.println();
        System.out.print("Enter your Name: ");
        String name = in.next();
        System.out.println();
        System.out.print("Enter * to Start the Quiz: ");
        String start = in.next();
        System.out.println();
        int score= 0;

        if(start.equals("*")){
            System.out.println("Question 1: Capital of India?");
            System.out.print("Enter Answer Here: ");
            String ans = in.next();
            System.out.println();
            if (ans.equals("Delhi")){
                System.out.println("Correct Answer "+name+ " Onto the Next One ");
                score++;
                System.out.println();
            }
            else{
                System.out.println("Oh No! Incorrect Answer. ");
                score--;
                System.out.println();
            }
            System.out.println("Question 2: Largest State of India? ");
            System.out.print("Enter Answer: ");
            String  ans2 = in.next();
            System.out.println();
            if(ans2.equals("Rajasthan")){
                System.out.println("Wohoo Correct Answer. Great Keep it up!"+ name);
                score++;
                System.out.println();
            }
            else {
                System.out.println("OOPs Incorrect Answer.");
                score--;
                System.out.println();
            }
            System.out.println("Question 3: First Month of the Year ? ");
            System.out.print("Enter Answer: ");
            String ans3 =in.next();
            if (ans3.equals("January")){
                System.out.println("You are Doing Great Keep it UP."+name);
                score++;
                System.out.println();
            }
            else {
                System.out.println("Incorrect. Kindly Read Question Correctly");
                score--;
                System.out.println();
            }
            String dummy = in.nextLine();
            System.out.println("Question 4: President of America ?");
            System.out.print("Enter Answer: ");

            String ans4 = in.nextLine();
            System.out.println();
            if (ans4.equals("Donald Trump")){
                System.out.println("You are Doing Great Keep it UP "+name);
                score++;
                System.out.println();
            }
            else {
                System.out.println("Incorrect. Kindly Read Question Correctly");
                score--;
                System.out.println();
            }
            System.out.println("Question 5: What is 9*5 ?");
            System.out.print("Enter Answer: ");
            int ans5 = in.nextInt();
            System.out.println();
            if (ans5 == 45){
                System.out.println("You are Doing Great Keep it UP "+name);
                score++;
                System.out.println();
            }
            else {
                System.out.println("Incorrect. Kindly Read Question Correctly");
                score--;
                System.out.println();
            }
            System.out.println("1. Scores \n2. Correct Answers\n 3. Exit ");
            int choice = in.nextInt();
            while (choice !=3){
                if (score > 0){
                    System.out.println("You Did Great "+ name+ " your total score out of 5 is "+score);
                }
                else {
                    System.out.println(name + " you Need to Practice your total score out of 5 is " + score);
                }
                if (choice == 2) {
                    System.out.println("1. Delhi \n 2. Rajasthan \n 3.January \n 4. Donald Trump \n 5. 45");
                }
                choice = in.nextInt();
            }
            System.out.println("Thank you for Using the Quizzer, "+name);
        }

    }
}
