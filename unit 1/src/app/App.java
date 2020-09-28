package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "blue";
        boolean bikes = false;

        while (count <= 50) {
            System.out.println("The count is " + count);
            count = count + 1;
        }

        while (color == "blue") {
            System.out.println("The color is " + color);
            color = "black";
        }

        while (bikes == false) {
            System.out.println("Riding a bicycle is not an exercise (" + bikes + ")");
            bikes = true;
        }


        System.out.println("count finished");
        System.out.println("color finished");
        System.out.println("bikes finished");
    }
}