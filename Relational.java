import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take employeeSales and performanceThreshold as input
        int employeeSales = sc.nextInt();
        int performanceThreshold = sc.nextInt();
        // Checking if employee sales exceed the performance threshold
        if (employeeSales > performanceThreshold) {  // Fill in the blank
            System.out.println("performance Status: Exceeds Expectations."); // Fill in the blank
        } else {
            System.out.println("Performance Status: Below Expectations."); // Fill in the Pblank
        }

        // Indicating that the evaluation process is complete
        System.out.println("Evaluation completed.");
    }
}
