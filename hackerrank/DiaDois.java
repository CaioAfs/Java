package hackerrank;

import java.util.Scanner;

public class DiaDois {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int i=4;
	i+=scan.nextInt();
	double d=4;
	d+=scan.nextDouble();
	String s="HackerRank ";
	scan.nextLine();
	s+=scan.nextLine();
	
	System.out.println(i);
	System.out.println(d);
	System.out.println(s);
	
	scan.close();
	
	
 	}
}
