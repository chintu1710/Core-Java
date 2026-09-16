package in.co.rays.mini.projects;

import java.util.Random;

public class Game {
	public static void main(String[] args) {
		Random rand = new Random();
		int player1 = 0;
		int player2 = 0;
		int chances = 10;

		int[] penaltyNums = { 0, 2, 5, 3, 8, 12, 16, 48, 63 };
		
		System.out.println("🎮 Tough Game Start!");

		for (int i = 0; i <= chances; i++) {
			System.out.println("\nRound" + i);
			
			//player 1
			
			int num1 = rand.nextInt(50) - 10; // negative chances
            System.out.println("Player1 got: " + num1);
            
            if (isPenalty(num1, penaltyNums)) {
                player1 /= 2; // score half
                System.out.println("⚠️ Penalty! Player1.");
            } else {
                player1 += num1;
                
           System.out.println("Player 1 " + player1);
           if (player1 >= 100) {
               System.out.println("🎉 Player1 Wins!");
               return;
           }
           for (int i = 0; i <= chances; i++) {
   			System.out.println("\nRound" + i);
   			
   			//player 2
   			
   			int num2 = rand.nextInt(50) - 10; // negative chances
               System.out.println("Player2 got: " + num1);
               
               if (isPenalty(num2, penaltyNums)) {
                   player2 /= 2; // score half
                   System.out.println("⚠️ Penalty! Player1.");
               } else {
                   player1 += num1;
                   
              System.out.println("Player 2 " + player1);
              if (player2 >= 100) {
                  System.out.println("🎉 Player2 Wins!");
                  return;
              }
                
               
            
            
           			

		}

	}
}
