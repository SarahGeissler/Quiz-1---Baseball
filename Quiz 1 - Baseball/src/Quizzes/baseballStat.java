package Quizzes;

import java.util.Scanner;

public class baseballStat{
	private String name;
	private int atBat;
	private int hits;
	private int doubles;
	private int triples;
	private int homeRuns;
	private int runs;
	private int walks;

	public baseballStat() {
	
	Scanner stdin = new Scanner(System.in);
	
	System.out.println("Enter name:");
	name = stdin.nextLine();
	System.out.println("Enter number of at bats:");
	atBat = stdin.nextInt();
	System.out.println("Enter number of hits:");
	hits = stdin.nextInt();
	System.out.println("Enter number of doubles:");
	doubles = stdin.nextInt();
	System.out.println("Enter number of triples:");
	triples = stdin.nextInt();
	System.out.println("Enter number of home runs:");
	homeRuns = stdin.nextInt();
	System.out.println("Enter number of runs:");
	runs = stdin.nextInt();
	System.out.println("Enter number of walks:");
	walks = stdin.nextInt();
	stdin.close();
	}
	
	public String getName() {
		return name;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public double battingAverage() {
		
		double BA = (hits/atBat);
		return BA;
		
	}
	
	public double onBasePercentage() {
		
		double OBP = (hits + walks)/(atBat + walks);
		return OBP;
		
	}

	
	public int totalBases(){
		int singles = hits - (doubles+triples+homeRuns);
		int TB = singles + doubles + triples + homeRuns;
		return TB;
		
	}
	
	public double sluggingPercentage() {
		
		double SLG = (this.totalBases());
		return SLG;
		
	}
	
	public double onBasePlusSlugging() {
		double OPS = (this.onBasePercentage()) + (this.sluggingPercentage());
		return OPS;
		
	}
	
	public static void main(String[] args) {
		baseballStat baseballStatistics = new baseballStat();
		System.out.println("BA:" + baseballStatistics.battingAverage());
		System.out.println("OBP:" + baseballStatistics.onBasePercentage());
		System.out.println("TB:" + baseballStatistics.totalBases());
		System.out.println("SP:" + baseballStatistics.sluggingPercentage());
		System.out.println("OPS:" + baseballStatistics.onBasePlusSlugging());
	}
}

