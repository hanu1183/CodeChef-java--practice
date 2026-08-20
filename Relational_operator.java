package module;
import java.util.Scanner;
public class Relational_operator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Internal Marks");
	int im =sc.nextInt();
	System.out.println("enter External Marks");
	int em = sc.nextInt();
	int total = im+em;
	System.out.println("Total:"+total);
	System.out.println("Total>=50:"+(total>=50));
	System.out.println("Internal marks>=20:"+(im>=20));
	System.out.println("External marks>=30:"+(em>=30));
	System.out.println(total>=50&&em>=30);
 if (total>=50&&em>=30)
	{	
	      total+=5;
}
	System.out.println("Grace total:"+total);
	
}
}
