package com.first_project;

import java.util.StringTokenizer;

public class day7str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="department of artificial intelligence";
	char c[]=s.toCharArray();
	StringTokenizer st=new StringTokenizer(s," ");
	int n=0;
		while(st.hasMoreTokens()==true) {
			System.out.println(st.nextToken());
			n=n+1;
		}
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
			
		}
		System.out.println();
		System.out.println("no. of words in string is " +n);
		
	}
}