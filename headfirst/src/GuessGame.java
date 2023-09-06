public class GuessGame {
	Player p1;         //GuessGame has three instance variables for the three Player objects.
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();       //create three Player objects and assign them to the three Player instance variables
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;       //declare three vaiables to hold the three guesses the Players make
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;   //declare three variables to hold a true or false based on the player's answer
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);    //make a 'target' number that the players have to guess
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while(true) {
			System.out.println("Number to guess is " + targetNumber);
			
			p1.guess();         //call each player's guess() method
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;     //get each player's guess by accessing the number vaiable of each player
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			if (guessp1 == targetNumber) {   //check each player's guess to see if it matches the target number. If a player is right, then set that player's variable to be true
				p1isRight = true;
			}
			
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {  //if player one OR player two OR player three is right...
				
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break;  //game over, so break out of the loop
				
			} else {
				//we must keep going because nobody got it right!
				System.out.println("Players will have to try again.");
			}  // end if/else
		}  //end loop
	}  //end method
}  //end class


				
			
			
class Player {
	int number = 0;  //where the guess goes
		
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
			
	}
}


class GuessGameLauncher {
	public static void main (String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
	}
}