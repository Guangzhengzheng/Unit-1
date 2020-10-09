package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


Scanner input = new Scanner(System.in);

System.out.println("Hello, and welcome to all about otters. Select which fact you would like to view first (1-5)");
     String otter1 = input.nextLine();
        if (otter1.equals("1")) {
            System.out.println("there are 13 extant species of otter"); 
        
        }
     String otter2 = input.nextLine();
        if (otter2.equals("2")) {
            System.out.println("all otters are aquatic, though the sea otter is the only one that lives it's entire life in the water"); 
        }
     String otter3 = input.nextLine();
        if (otter3.equals("3")) {
            System.out.println("an otter's fur is slick and smooth, which coimbined with natural oils from it's skin makes it able to glide when sliding on it's stomach"); 
        }
     String otter4 = input.nextLine();
        if (otter4.equals("4")) {
            System.out.println("sea otters hold paws in large groups known as rafts. to prevent their young from floating away, they wrap them in kelp growing from the seafloor"); 
        }
     String otter5 = input.nextLine();
        if (otter5.equals("5")) {
            System.out.println("an otter is a keystone species, as they keep fish and urchin populations under control"); 
        }

    System.out.println("you have looked through all about otters" );
    }
    
}