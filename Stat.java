
import textio.TextIO;
public class Stat {
	public static void main(String[] args) {
		
		StatCalc calc = new StatCalc();
		double data;
		
		
		System.out.println("Please kindly enter your data:");
		System.out.println("Press \"0\" to end.");
		do {
			data = TextIO.getlnDouble();
			if (data != 0)
				calc.enter(data);
		} while (data != 0);
		
		System.out.println();
		System.out.println();
		System.out.println("The number of items added is " + calc.getCount());
		System.out.println("The mean of the data is " + calc.getMean());
		System.out.println("The maximum of the data is " + calc.getMax());
		System.out.println("The minimum of the data is " + calc.getMin());
		System.out.printf("The Standard Deviation is %1.2f ", calc.getStandardDeviation());
		System.out.println();
	}

}
