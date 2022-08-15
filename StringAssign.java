package Otp;

import java.util.Scanner;

public class StringAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Assignment 1");
		StringBuffer sb = new StringBuffer("iNeuron");
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("======================= ");
		
		System.out.println("Assignment 2");
		String s = "Think Twice";
		String s1="";
		String a[]=s.split("");
		for(int i=a.length-1; i>=0;i--) {
			s1=s1 + a[i];
		}
		System.out.println(s1);
		
		
		
		System.out.println("====================== ");
		
		System.out.println("Assignment 3 - anagram");
		String q= "each";
		String p = "achh";
		String r="";
		//int count=0;
		
		for(int i=0;i<q.length();i++) {
			for(int j=0;j<p.length();j++) {
				if(q.charAt(i)==p.charAt(j)) {
					r=r+q.charAt(i);
				}
			}
		}
		if(r.equals(q)) {
		System.out.println("this is anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
		
        System.out.println("====================== ");
		
		System.out.println("Assignment 3 - panagram");
		Scanner sc= new Scanner(System.in);
		
		String ab=sc.nextLine();
		
		for(int i=0;i<ab.length();i++) {
			if( ab.charAt(i)<=90 &&  ab.charAt(i)>=65) {
				System.out.println("panagram");
			}
//			else {
//				System.out.println("not");
//			}
		}
		

	}

}
