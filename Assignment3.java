package Otp;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=17;
	     
	     for (int i=0; i<n; i++) {
	    	 for(int j=0;j<n;j++) {
	    		 if(i==0 && j<n || i==n-1 && j<n || j==0 && i<n || j==n-1 && i<n || (i+j<=n/2 || j-i>=n/2)) {
	    			 System.out.print("*");
	    			 
	    		 }else {
	    			 System.out.print(" ");
	    		 }
	    	 }
	    	 System.out.println(" ");

	}

}}
