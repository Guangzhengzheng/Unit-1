package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int targetNum = 70;
        boolean isFinished = false;

        Scanner input = new Scanner(System.in);
    
        while(isFinished == false){System.out.println("Guess a number between 0 and 100.");
        int guess = input.nextInt();
        input.nextLine();

    
        if (guess == targetNum){
            System.out.println("Correct!");
            isFinished = true;
        }

        else{

            if (guess > targetNum){
                System.out.println("High");
            }

            else{
                System.out.println("Low");
            }
        }
    }
        

 
}
}