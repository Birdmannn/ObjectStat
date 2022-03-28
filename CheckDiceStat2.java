
public class CheckDiceStat2 {
	
	private static PairOfDice dice = new PairOfDice();
	private static int NUMBER_OF_EXPERIMENTS = 10000;
	
	public static void main(String[] args) {
		System.out.println("Whatever,\nThis Program must run!");
		System.out.println("These are the dice stats:");
		System.out.println();
		System.out.println("Dice Number    Average roll    Maximum roll    Standard Deviation");
		System.out.println("-----------   --------------   ------------    ------------------");
		for (int i = 2; i <= 12; i++) {
			StatCalc stat = getStats(i);
			System.out.printf("%7d%17.3f%16.3f%17.3f", i, stat.getMean(), stat.getMax(), stat.getStandardDeviation());
			System.out.println();
		}
		
	}
	
	
	static int rollFor(int N) {
		int rollCount = 0;
		do {
			dice.roll();
			rollCount++;
		} while (dice.getTotal() != N);
		return rollCount;
	}
	
	static StatCalc getStats(int totalRoll) {
		StatCalc calc = new StatCalc();
		
		for (int i = 0; i <= 12; i++)
			calc.enter(rollFor(totalRoll));
		return calc;
	}

}
