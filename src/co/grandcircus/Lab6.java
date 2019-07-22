package co.grandcircus;

import java.util.Scanner;

import java.util.Random;

public class Lab6 {

	public static void main(String[] args) {

		System.out.println("Hey buddy, how many sides does a pair of dice have?");

		Scanner scan = new Scanner(System.in);

		int numSides = scan.nextInt();

		char userChar = 'y';

		System.out.println("Would you like to roll??? (y/n)");
		
		userChar = scan.next().charAt(0);
		
		while (userChar == 'y') {

			int dieRoll = generateRandomDieRoll(numSides);
			int dieRoll2 = generateRandomDieRoll(numSides);
			
			System.out.println(dieRoll + " " + dieRoll2);
		
			System.out.println("Would you like to roll??? (y/n)");
			
			userChar = scan.next().charAt(0);

		}
		System.out.println("Ok bye");
		
		
		scan.close();
	}

	public static int generateRandomDieRoll(int randomRoll) {

		return (new Random()).nextInt(randomRoll) + 1;
	}
	
	
	}


