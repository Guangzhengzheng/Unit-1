package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " is able to be divided evenly by 4");
            } else {
                System.out.println(i + " is unable to be divided evenly by 4");
            }
        }

        System.out.println("All finished");
    }
}