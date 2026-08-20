package module;
import java.util.Scanner;
public class Register {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sid1;
	int sid2;
	byte sems1;
	byte sems2;
	double cgpa1;
	double cgpa2;
	System.out.println("enter student1ID");
	 sid1 = sc.nextInt();
	System.out.println("enter semisterofstudent1");
	sems1 = sc.nextByte();
	System.out.println("enter cgpaofstudent1");
	 cgpa1 = sc.nextDouble();
	System.out.println("enter student2ID");
	 sid2 = sc.nextInt();
  System.out.println("enter semisterofstudent2");
	 sems2 = sc.nextByte();
	System.out.println("enter cgpaofstudent2");
	 cgpa2 = sc.nextDouble();
	 System.out.println("=======STUDENT REGISTRATION DETAILS======");
	 System.out.println("student Id    semester    CGPA");
	 System.out.println("-------------------------------------------");
	 System.out.println(sid1+"     "+"     "+sems1+"    "+"     "+cgpa1+"\n"+sid2+"     "+"     "+sems2+"     "+"     "+cgpa2); 
	
}
}
