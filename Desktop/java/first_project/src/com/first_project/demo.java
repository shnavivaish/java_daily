package com.first_project;

public class demo {

	public static void main(String[] args) {
		System.out.println("hi vaishnavi");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if((i==1||i==2||i==3)&&(j==1||j==2||j==3))
				{
					System.out.print("   ");
				}
				else {
					System.out.print(" * ");
				}
					
			}
			System.out.println(" ");
		}

	}

}
