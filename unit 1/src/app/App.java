package app;

public class App {
    public static void main(String[] args) throws Exception {
        String person1 = "Casey";
        String person2 = "Mack";
        String verb1 = "carry";
        String verb2 = "fix";
        String verb3 = "search";
        String dayOfWeek = "Monday";
        String food = "cookies";
        String place2 = "shed";
        String place1 = "home";
        String adjective1 = "crazy";
        String adjective2 = "robotic";

        System.out.println(person1 + " and " + person2 + " are 2 kids with big dreams in their " + place1 + "town of Ffarqhar on Sodor. The two of them rarely do things independently.");
        System.out.println("Every " + dayOfWeek + ", the 2 go to a " + place2 + " to work on their various projects, which are deemed " + adjective1 + " " + adjective2 + "s by the rest of the townsfolk.");  
        System.out.println("Whenever one of them finds a flaw, the two "+ verb1 + " out the repair processes, " + verb3 + "ing for anything on their project that might need to be "+ verb2 + "ed.");  
        System.out.println("After a long day, however, they enjoy snacking on "+ food + " after successful operations on their projects.");
    }
}