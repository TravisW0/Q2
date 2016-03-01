import java.util.Scanner;

public class TuitionCalculator {
	// Private attributes
	private static int InitialTuition;
	private static double PercentIncrease;
	private static double APR;
	private static int Term;
	private static int FourYearCost;

	public static void main(String[] args) {

		// Scanner for user input
		Scanner UserInput = new Scanner(System.in);
		TuitionCalculator TuitionObj = new TuitionCalculator();

		// Asking for InitialTuition
		System.out.println("Enter tuition rate: ");
		InitialTuition = UserInput.nextInt();

		// Asking for PercentIncrease
		System.out.println("What is the percent increased by? ");
		PercentIncrease = UserInput.nextDouble();

		// Asking for FourYearCost
		FourYearCost = TuitionObj.totalCost(InitialTuition, PercentIncrease);
		// Printing out cost after 4 years
		System.out.printf("Your total cost after 4 years: %d",
				TuitionObj.totalCost(InitialTuition, PercentIncrease));

		// Asking for APR
		System.out.println("Enter the APR: ");
		APR = UserInput.nextDouble();

		// Asking for Term
		System.out.println("Enter the Term: ");
		Term = UserInput.nextInt();
		// Printing out cost per month
		System.out.printf("You will have to pay this much per month: %d",
				TuitionObj.monthlyPayment(FourYearCost, APR, Term));
	}

	// Calculating total tuition and interest after four years
	public int totalCost(int InitialTuition, double PercentIncrease) {
		return (int) (InitialTuition * PercentIncrease + InitialTuition) * 4;
	}

	// Calculating monthly payment with interest
	public int monthlyPayment(int FourYearCost, double APR, int Term) {
		int total = 0;
		for (int a = 0; a < Term; a++) {
			total = (int) (FourYearCost * (1.0 + APR));
		}

		// Total monthly cost
		return total / (Term * 12);
	}
}