import java.util.Scanner;

public class GuesserGame {
	int numFromGuesser;
	int[] numFromPlayers;
	int playerCount;
	boolean[] result;
	int count=0;
	public void compareGuess() {
		result=new boolean[playerCount];
		boolean flag=false;
		for(int i=0;i<numFromPlayers.length;i++)
			if(numFromPlayers[i]==numFromGuesser ) 
				result[i]=true;
		for(int i=0;i<result.length;i++) {
			if(result[i])
				count++;
		}
		if(count==playerCount) {
			System.out.println("Match Draw");
		} else if(count==0) {
			System.out.println("No one Won the match");
			
		} else {
			String winners="";
			for(int i=0;i<playerCount;i++) {
				if(result[i]) {
					if(!(i==0))
							winners+=" & ";	
					winners+=""+(i+1);
				}
				
			}
			System.out.println("Player "+winners+" won the match");
		}
	}
	public static void main(String[] args) {
		GuesserGame ump= new GuesserGame();
		Guesser guesser= new Guesser();
		ump.numFromGuesser=guesser.guesserNumber();
		System.out.println("Enter the Player Count");
		Scanner scan= new Scanner(System.in);
		ump.playerCount=scan.nextInt();
		Players player= new Players(ump.playerCount);
		ump.numFromPlayers=player.playerGuessNumber();
		ump.compareGuess();
	}
}
class Guesser {
	int guesserNumber;
	public int guesserNumber() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Guesser guess any number ");
		guesserNumber=scan.nextInt();
		return guesserNumber;

	}

}
class Players {
	int playerCount;
	int[] playerGuess;
	Players(int playerCount){
		this.playerCount=playerCount;
		playerGuess=new int[this.playerCount];
	}
	public int[] playerGuessNumber() {
		Scanner scan= new Scanner(System.in);
		for(int i=0;i<playerCount;i++) {
			System.out.println("Player "+(i+1)+" guess any number");
			playerGuess[i]=scan.nextInt();
		}
		return playerGuess;
	}

}