package Otp;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Assignment 3 - anagram");
		String q= "king";
		String p = "gink";
		String r="";
		//int count=0;
		
		for(int i=0;i<q.length();i++) {
			for(int j=0;j<p.length();j++) {
				if(q.charAt(i)==p.charAt(j)) {
					r=r+q.charAt(i);
					break;
				}
			}
		}
		if(r.equals(q)) {
		System.out.println("this is anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		

	}

}
