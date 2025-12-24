package com.first_project;

class Overloading {
	int add(int a , int b) {
		int sum=a+b;
		return sum;
	}
	double add(double a , int b) {
		double sum=a+b;
		return sum;
	}
	
	float add(float a , int b) {
		float sum=a+b;
		return sum;
	}
	double add(double a , double b) {
		double sum=a+b;
		return sum;
	}

	float add(float a , float b) {
		float sum=a+b;
		return sum;
	}
	double add(double a , double b,double c) {
		double sum=a+b+c;
		return sum;
	}
	double add(double a , double b,float c) {
		double sum=a+b;
		return sum;
	}
	double add(double a , float b, int c) {
		double sum=a+b+c;
		return sum;
	}
}
public class methodOver8{
	public static void main(String []args) {
		Overloading obj=new Overloading();
		double res=obj.add(12,50,60);
		System.out.println(res);
		
	}
}


