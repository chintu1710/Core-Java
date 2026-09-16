package in.co.rays.mini.projects;

import java.util.Random;

public class OnlineGame {
	public static void main(String[] args) {
		Random rand = new Random();
		int player1 = 0;
		int player2 = 0;
		int chances = 10;

		int[] penaltyNums = { 0, 2, 5, 3, 8, 12, 16, 48, 63 };

		System.out.println("🎮 Tough Game Start!");

		for (int i = 1; i <= chances; i++) {
			System.out.println("\nRound " + i);

			// Player 1 turn
			int num1 = rand.nextInt(50) - 10;
			System.out.println("Player1 got: " + num1);

			if (isPenalty(num1, penaltyNums)) {
				player1 /= 2;
				System.out.println("⚠️ Penalty! Player1 score halved.");
			} else {
				player1 += num1;
			}

			System.out.println("Player1 total: " + player1);

			if (player1 >= 100) {
				System.out.println("🎉 Player1 Wins!");
				return;
			}

			// Player 2 turn
			int num2 = rand.nextInt(50) - 10;
			System.out.println("Player2 got: " + num2);

			if (isPenalty(num2, penaltyNums)) {
				player2 /= 2;
				System.out.println("⚠️ Penalty! Player2 score halved.");
			} else {
				player2 += num2;
			}

			System.out.println("Player2 total: " + player2);

			if (player2 >= 100) {
				System.out.println("🎉 Player2 Wins!");
				return;
			}
		}

		// After all chances
		System.out.println("\n🏁 Game Over!");

		if (player1 > player2) {
			System.out.println("🏆 Player1 Wins with " + player1 + " points!");
		} else if (player2 > player1) {
			System.out.println("🏆 Player2 Wins with " + player2 + " points!");
		} else {
			System.out.println("🤝 It's a Draw!");
		}
	}

	// Checks whether num is present in penaltyNums
	public static boolean isPenalty(int num, int[] penaltyNums) {

		for (int n : penaltyNums) {
			if (n == num) {
				return true;
			}
		}

		return false;
	}
}
