package com.first_project;

public class comaprisionString {

	public static void main(String[] args) {
		String s1="java";
		String s2=new String("java");
//		raw string will always store in constant pool in heap which means it can not store duplicates value
		if(s1==s2) {
			System.out.println("refferance are equal");
		}else if(s1.equals(s2)) {
			System.out.println("content is equal");
		}
		else {
			System.out.println("refferance are not equal");
		}
		s1.concat(s2); //it will create a new string in NCP
		s1=s1.concat(s2); // referance change honga means refferance override hua
		System.out.println(s1);
//  next method to check out
		String v1="java_";
		String v2="Java";
		String v4="java_Java";
		String v3=v1.concat(v2);
		
		if(v3==v4) {
			System.out.println("refferance are equal");
		}else if(v1.equalsIgnoreCase(v2)) {                      
			System.out.println("content is equal");
		}
		else {
			System.out.println("refferance are not equal");
		}
		
	}

}
