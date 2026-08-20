package module;
import java.util.Scanner;
public class Creditreport {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tc,cc,rc;
	System.out.println("enter totalcreditsreq");
	tc = sc.nextInt();
	System.out.println("enter credits completed");
	cc = sc.nextInt();
	rc = tc-cc;
	System.out.println("=======CAMS CREDIT REPORT=======");
	System.out.println("                                 ");
	System.out.println("Total Credits Required : "+tc+"\n"+"Credits Completed : "+cc+"\n"+"Remaining Credits : "+rc+"\n"+"Credit Evaluation Completed Successfully!");                              
	

}
}
