package com.first_project;
import java.util.Scanner;
public class Copyarray12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
//		reverse order mai print krne ke liye
		for(int i=(a.length-1);i>=0;i--) {   
			b[i]= a[i];
		}
		for(int i=(a.length-1);i>=0;i--) { //print hmko sidha krna hai
			System.out.print(b[i] +" ");
		}
		System.out.println();
		int m[]= {11,22,33,44};
		int n[]=new int[m.length];
		int j=m.length-1;
		for(int i=0;i<m.length;i++) {
			n[i]=m[j];
			j--;
		}
        for(int i=0;i<m.length;i++) {
        	System.out.print(n[i]+" ");
        }

	}

}
