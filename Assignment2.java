package Otp;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=4;
     int count = 0;
     for (int i=0; i<n; i++) {
    	 for(int j=0;j<n;j++) {
    		 if(i==count && j<n) {
    			 System.out.print(i+1);
    		 }else {
    			 System.out.print("");
    		 }
    	 }
    	 System.out.println("");
    	 count++;
     }
	}

}
