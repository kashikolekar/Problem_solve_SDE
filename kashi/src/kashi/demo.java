package kashi;

import java.util.*;


public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter two number");
	n1=sc.nextInt();
	n2 = sc.nextInt();
	
	int result = 0;
	result = n1+n2;
	int max = Math.max(n2, n1);
	System.out.println("maximum =" + max);
	System.out.println("result =" + result);
	
	
	
	
	}

}
