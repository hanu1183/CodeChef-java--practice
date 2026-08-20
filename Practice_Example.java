package module;
import java.util.Scanner;
public class Practice {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	System.out.println("enter pap");
	int pap = sc.nextInt();
	System.out.println("enter cap");
	int cap = sc.nextInt();
	int ad = cap-pap;
	System.out.println("Attendance difference:"+ad);
	System.out.println("Cap>Pap:"+(cap>pap));
	System.out.println("Cap>=75:"+(cap>=75));
	System.out.println(cap>pap&&cap>=75);
	if (cap>pap&&cap>=75);
	{
		cap+=2;
		}
	System.out.println("CAP: "+cap);
	System.out.println((cap>=75&&cap>pap)?"Attendance Improved":"Needs Improvement");
}
}
