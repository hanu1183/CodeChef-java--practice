import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int emergencyKeycode = 4321;
        int overrideCode = 9999;

        // Take user input

int enteredCode = sc.nextInt();
        // Checking if the entered code matches either emergencyKeycode or overrideCode
        if ( emergencyKeycode==enteredCode||overrideCode==enteredCode) {  // Fill in the blanks
            System.out.println("Access Granted: Emergency Entry Allowed."); // Fill in the blank
        } else {
            System.out.println("Access Denied: Invalid Code."); // Fill in the blank
        }


    }
}
