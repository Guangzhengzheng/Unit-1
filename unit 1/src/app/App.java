package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

String question1 = "what is the color of a banana?";
String cAnswer1 = "yellow";
String question2 = "what is the color of an apple?";
String cAnswer2 = "red";
String question3 = "what is the color of the sky?";
String cAnswer3 = "blue";
String question4 = "what is the color of snow?";
String cAnswer4 = "white";
String question5 = "what is the color of grass?";
String cAnswer5 = "green";
int correctAnswer = 0;
int percentage = 0;
Scanner input = new Scanner(System.in);


    System.out.println(question1);
     String answer1 = input.nextLine();
        if (answer1.equals(cAnswer1)) {
            System.out.println("Correct"); 
            correctAnswer++;
        } else {
            System.out.println("Incorrect");
        }

     System.out.println(question2);
     String answer2 = input.nextLine();
        if (answer2.equals(cAnswer2)) {
            System.out.println("Correct"); 
            correctAnswer++;
        } else {
            System.out.println("Incorrect");
        }

     System.out.println(question3);
     String answer3 = input.nextLine();
        if (answer3.equals(cAnswer3)) {
            System.out.println("Correct"); 
            correctAnswer++;
        } else {
            System.out.println("Incorrect");
        }

     System.out.println(question4);
     String answer4 = input.nextLine();
        if (answer4.equals(cAnswer4)) {
            System.out.println("Correct"); 
            correctAnswer++;
        } else {
            System.out.println("Incorrect");
        }

     System.out.println(question5);
     String answer5 = input.nextLine();
        if (answer5.equals(cAnswer5)) {
            System.out.println("Correct"); 
            correctAnswer++;
        } else {
            System.out.println("Incorrect");
        }

    percentage = correctAnswer * 20;
    System.out.println("you have "+ correctAnswer +" out of 5 correct " + percentage + "%" );
    }
    
}