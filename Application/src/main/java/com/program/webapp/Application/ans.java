package com.program.webapp.Application;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ans{

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the size of array");
		int n=sc.nextInt();
		//System.out.println("Enter the size of array");
		int m= sc.nextInt();
		//System.out.println("Enter the size of k");
		int k=sc.nextInt();
		int[] arr1 = new int[n];
		int[] p = new int[n];
	//	System.out.println("Enter the size of ele");
		 for(int i=0;i<n;i++)
		 {
			arr1[i]= sc.nextInt();
			
		 }
		// System.out.println("Enter the size of elemet price");
		 for(int i=0;i<n;i++)
		 {
			p[i]= sc.nextInt();
			
		 }
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<n;i++)
		 {
			 map.put(arr1[i],p[i]);
		 }
		 Arrays.sort(arr1);
		 
	int sum=0;
		 
		 int i=0;
		 while(k>=0)
		 {
			if (i<n &&(arr1[i]-arr1[0]<=m))
			{
				sum=sum+map.get(arr1[i]);
			}
			i++;
			k--;
		 }
		 System.out.println(sum);
		 
	}

}
