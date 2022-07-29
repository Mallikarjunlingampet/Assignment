package Otp;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		//I
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 && j<n || i==n/2 && j<n || j==n/2 && i<n/2) {
				
				System.out.print("*");
			}else {System.out.print(" ");}
				}
			System.out.println("");

		}
				//N
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 && i<n || j==n-1 && i<n || i==j) {
					System.out.print("*");			
					}else {
						System.out.print(" ");
					}
			}System.out.println(" ");
		}
		System.out.println(" ");
		//E
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 && i<n || i==0 && j<n || i==n-1 && j<n || i==n/2 && j<n) {
					System.out.print("*");			
					}else {
						System.out.print(" ");
					}
			}System.out.println(" ");
		}
		
		//U
		System.out.println(" ");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0 && i<n  || j==n-1 && i<n ) || i==n-1 && j!=0 &&j!=n-1) {
					System.out.print("*");			
					}else {
						System.out.print(" ");
					}
			}System.out.println(" ");
		}
		
		//R
		System.out.println(" ");

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 && j<n/2  || j==0 && i<n || i+j==n/2 || i-j==n/2 ) {
					System.out.print("*");			
					}else {
						System.out.print(" ");
					}
			}System.out.println(" ");
		}

	}

}
