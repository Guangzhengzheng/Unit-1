package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        String age = input.nextLine();
        System.out.println("Where do you live?");
        String home = input.nextLine();
        System.out.println("How many tasks do you do each day?");
        String taskNumber = input.nextLine();
        System.out.println("What is your favorite season?");
        String favoriteSeason = input.nextLine();
        
        System.out.println("Hello, " + name + ". You are " + age + " years old, you currently live in " + home + ", and you perform " + taskNumber + " tasks each day. Your favorite season is " + favoriteSeason + ".");
    }
}