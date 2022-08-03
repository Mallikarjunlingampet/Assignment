 package Otp;
import java.lang.*;
import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;	
		
	}	

}

class Player
{
	int pguessNum;
	
	
	public int guessNumber()
	{ 
		
		Umpire b = new Umpire();
		int c[]=b.options();
		
		System.out.println("Choose options");
		for(int i=0; i<4;i++) { System.out.println(c[i]);}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Player kindly guess the number from above options " );
		int pguessNum=s.nextInt();
		int index = 0;
		for(int i=0; i<4;i++) {
			
			if(pguessNum==c[i]) {
				
				pguessNum=c[i];
				index = i;
				//return i;
			}
		}
		System.out.println( "Option is " + (index+1) );
		return pguessNum;
		
		
	}
	
	
		
		
		
}

 class Umpire
{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
    
    
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	
	
	 public int[] options() {
		 int a[]= new int[4];
		 System.out.println("enter options");
		 Scanner s= new Scanner(System.in);
		 for(int i=0;i<4; i++) {
			 a[i]= s.nextInt();
		 }
		 
		 return a;
	 }
	
	
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
		
		
	}
	
	void compare()
	{
		
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player3 won ");
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			}
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			
			if(numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		
		
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
	
}





public class Launchgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}







