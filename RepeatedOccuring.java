package Otp;

public class RepeatedOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="karthik";
		//char abc[]=m.toCharArray();
		
		String ch="";
		//String chi="";
	
		for(int i=0; i<m.length(); i++) {
			for(int j=i+1; j<m.length(); j++) {
				if(m.charAt(i)==m.charAt(j) ) {
					
						ch = ch + m.charAt(i);
						
						
						//System.out.println(m.charAt(i));
						
						break;
						
				}
				
			}
			
		}
		System.out.println(ch);
		
		
	
		
		

	}

}
