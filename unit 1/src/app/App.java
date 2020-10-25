package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number");
        int name = input.nextInt();
        System.out.println("Please enter another number");
        int norm = input.nextInt();

    for (int i = name; i <= norm; i = i +1) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
              
            } 
    }

 
}
}