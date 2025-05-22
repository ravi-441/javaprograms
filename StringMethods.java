package String_Programs;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		String ss=new String();
		System.out.println(ss.length());
		ss="gffhjjfj";
		System.out.println(ss.length());
		

		
		String s="  Ravich andra ";
		System.out.println(s.trim());
		String s1=s+"ravi";
		String s2=s1.concat(s);
		System.out.println(s.isEmpty());
		System.out.println(s.length());
		System.out.println(s.replace('R', 'r'));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));
		System.out.println(s.subSequence(1, 5));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		//Scanner sc=new Scanner(System.in);
		//System.out.println("entre string");
		//String s12=sc.nextLine();
		//System.out.println(s12);
		//System.out.println(s2);
		
		
		
		

	}

}
