import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        int ae = sc.nextInt();
        int total = am+ae;
        if (total<2000) {
            System.out.println("You need to drink more water to stay hydrated!");
        } else { 
            System.out.println("Great job! You have met your daily water intake goal!");
        }
        
        // write your code here
    }
}
