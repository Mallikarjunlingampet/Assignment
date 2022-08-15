package Otp;

public class RepeatedOne {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String m="malayalam";
//		//char abc[]=m.toCharArray();
//		
//		char ch[] = null;
//		//String chi="";
//	
//		for(int i=0; i<m.length(); i++) {
//			for(int j=i+1; j<m.length(); j++) {
//				if(m.charAt(i)==m.charAt(j)) {
//						ch[i] =  m.charAt(i);
//						System.out.println(ch);
//						//System.out.println(m.charAt(i));
////						if(ch.charAt(i)==ch.charAt(j)) {
////							ch = ch + m.charAt(i);
////							break;
////						}
//						//break;
//						
//				}
//				
//			}
//			
//		}
//		
////		for(int i=0;i<m.length();i++) {
////		System.out.println(ch[i]);}
////		
////		System.out.println("Remove duplicate values from " + ch);
//		//for(int )
//	
		
		
		
		
		String s = "maheshbabu";
		char[] c=s.toCharArray();
		int count=1;
		char ch[]=new char[s.length()];
		
		for(int i=0;i<c.length;i++) {
			
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]==c[j]) {
					
	    			 ch[i]=c[i];
					 System.out.println(ch[i]);
					 
					 break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("================");
//		System.out.println(count);
//		System.out.println("================");
////		for(int i=0;i<5;i++) {
////			System.out.println(ch[i]);
////		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
