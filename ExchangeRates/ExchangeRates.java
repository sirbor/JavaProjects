import java.util.Scanner;
public class ExchangeRates {
	public static void main(String [] args) {
	final double Ex_Rate = 1200.00;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter your Dollars: ");
	double dollars = scanner.nextDouble();
	double Naira = dollars*Ex_Rate;
	System.out.println("Your Naira is: " + Naira);
	scanner.close();
	}
}
