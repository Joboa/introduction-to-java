
// import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        // String message = "Hello John";
        // Byte myAge = 24;
        // Byte brothersAge = 16;
        // int yearsOlderThanBrother = myAge - brothersAge;
        // int years[] = {2015, 2020};
        // System.out.println("Difference in age is " + yearsOlderThanBrother);
        // System.out.println(Arrays.toString(years));

        // System.out.println(Math.pow(2,4));
        // Scanner getPrice = new Scanner(System.in);
        // System.out.println("Enter new age");
        // int price = getPrice.nextInt();
        // System.out.println( "The price is " + price*2);
        // getPrice.close();

        // Mortage calculator
        // M = P[r(1+r)^n/((1+r)^n)-1]
        // Principal = 100,000
        // Annual interest rate = 3.92, period (years) = 30
        // Mortage = $472.81

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Principal
        Scanner getPrincipal = new Scanner(System.in);
        int principal = 0;
        while (true) {
            System.out.print("Principal ($1K -$1M): ");
            // Enter a number between 1,000 and 1,000,000.
            principal = getPrincipal.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        // Interest rate
        Scanner getAnnualInterest = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double interestRate = getAnnualInterest.nextDouble();
        double monthlyInterest = interestRate / PERCENT / MONTHS_IN_YEAR;
        // Period
        Scanner getPeriod = new Scanner(System.in);
        System.out.print("Period (Years): ");
        byte period = getPeriod.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;
        // Print out
        // M = P[r(1+r)^n/((1+r)^n)-1]

        double mortage = principal * (monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments))
                / ((Math.pow((1 + monthlyInterest), numberOfPayments)) - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortageAmount = currency.format(mortage);
        System.out.println("Mortage: " + mortageAmount);
        getPrincipal.close();
        getAnnualInterest.close();
        getPeriod.close();
    }
}
