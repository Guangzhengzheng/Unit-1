package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);

System.out.println("Top secret message available to view. You have 3 attempts at the access code and then that is it.");
     String otter1 = input.nextLine();
        if (otter1.equals("Swordfish")) {
            System.out.println("Piece together the acronym of the Fully Automated Rapid Transit System and try not to laugh."); 
        } else{
            System.out.println("Wrong access code; please retry");
        }
     String otter2 = input.nextLine();
        if (otter2.equals("Swordfish")) {
            System.out.println("Piece together the acronym of the Fully Automated Rapid Transit System and try not to laugh."); 
        } else{
            System.out.println("Wrong access code; please retry");
        }
     String otter3 = input.nextLine();
        if (otter3.equals("Swordfish")) {
            System.out.println("Piece together the acronym of the Fully Automated Rapid Transit System and try not to laugh."); 
        } else{
            System.out.println("Wrong access code; please retry");
        }

    System.out.println("Message recieved" );
    }
}