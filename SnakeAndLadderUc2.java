package com.bridgelabz.snakeandladders;

/**
 * Program for Player rolls the die to get a number between 1 to 6.
 * 
 * @author Shivaji Ghasti
 * 
 */
public class SnakeAndLadderUc2 {
	
		// Initialise Start Position as Zero
		private int position = 0;

		/*
		 * In this method we are taking random no between 1 to 6 for rolling dice
		 */
		public int rollDice() {
			int dice = (int) (Math.random() * 10) % 6 + 1;
			return dice;
		}
		
		public static void main(String[] args) {
			SnakeAndLadderUc2 player1 = new SnakeAndLadderUc2();
			System.out.println("Player 1 rolled dice value : " + player1.rollDice());
		}
}


