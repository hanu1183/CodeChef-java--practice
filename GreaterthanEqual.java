import java.util.*;

class Codechef {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
        //Take user input
int studentScore = sc.nextInt();
int PassingScore = sc.nextInt();
        // Checking if the student meets the scholarship criteria
        if (studentScore>=PassingScore) {  // Fill in the blank
            System.out.println("Scholarship Granted!"); // Fill in the blank
        } else {
  System.out.println("Scholarship Denied!");
}
        // Indicating that the evaluation process is complete
        System.out.println("Evaluation completed.");
    }
}
