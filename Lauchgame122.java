package Otp;

import java.util.Scanner;

class TeamA
{
	int guessanum;
	
	public int guessTeam(int a,int b) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Guess a num");
		while(guessanum!=a && guessanum!=b) {
		System.out.println("Guess  a num");
			guessanum = s.nextInt();
	} 
		return guessanum;
	}
}


class TeamB
{
	int pickanum;
	
	public int pickTeam(int a, int b) {
		
		System.out.println("Hey players! Choose number from " + a + " "+ b);
		Scanner s = new Scanner(System.in);
		
		while(pickanum!=a && pickanum!=b) {
			System.out.println("Please pick a num");
			pickanum = s.nextInt();
	} 
		return pickanum;
	}
}



class Empire1
{
	int collectnumfromteam;
	int collectnumfrompick1;
	int collectnumfrompick2;
	int collectnumfrompick3;
	 
	 

	
	
	
	
	public void getnumfromteam() {
		TeamA t = new TeamA();
		collectnumfromteam=t.guessTeam(10,20);
	}
	
	public void getnumfrompick() {
		TeamB t1= new TeamB();
		TeamB t2= new TeamB();
		TeamB t3= new TeamB();
		
		collectnumfrompick1 = t1.pickTeam(10,20);
		collectnumfrompick2 = t2.pickTeam(10,20);
		collectnumfrompick3 = t3.pickTeam(10,20);
		
	}
	
	public void compare() {
		
		
		if(collectnumfromteam==collectnumfrompick1)
		{
			if(collectnumfromteam==collectnumfrompick2 && collectnumfromteam==collectnumfrompick3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(collectnumfromteam==collectnumfrompick2)
			{
				System.out.println("Player 1 and Player2 won the game");
			}
			else if(collectnumfromteam==collectnumfrompick3)
			{
				System.out.println("Player 1 and Player3 won ");
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			}
		}
		
		
		else if(collectnumfromteam==collectnumfrompick2)
		{
			
			if(collectnumfromteam==collectnumfrompick3)
			{
			System.out.println("Player 2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		
		
		else if(collectnumfromteam==collectnumfrompick3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	
	}
	
}




public class Lauchgame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empire1 u = new Empire1();
		u.getnumfromteam();
		u.getnumfrompick();
		u.compare();

	}

}
