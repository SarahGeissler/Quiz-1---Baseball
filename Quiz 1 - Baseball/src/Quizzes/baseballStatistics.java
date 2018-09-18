package Quizzes;

import java.util.Scanner;

public class baseballStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int atBat;
		int hits;
		int doubles;
		int triples;
		int homeRuns;
		int runs;
		int walks;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter name:");
		name = keyboard.nextLine();
		System.out.println("Enter number of at bats:");
		atBat = keyboard.nextInt();
		System.out.println("Enter number of hits:");
		hits = keyboard.nextInt();
		System.out.println("Enter number of doubles:");
		doubles = keyboard.nextInt();
		System.out.println("Enter number of triples:");
		triples = keyboard.nextInt();
		System.out.println("Enter number of home runs:");
		homeRuns = keyboard.nextInt();
		System.out.println("Enter number of runs:");
		runs = keyboard.nextInt();
		System.out.println("Enter number of walks:");
		walks = keyboard.nextInt();
		
		baseballStat player1 = new baseballStat (name, atBat, hits, doubles, triples, homeRuns, runs, walks);
		System.out.println(player1.toString());
	}
}

