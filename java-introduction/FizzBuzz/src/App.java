import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // FizzBuzz
        Scanner getNumber = new Scanner(System.in);
        System.out.print("Number: ");
        int number = getNumber.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);

        // System.out.println(3 % 2);
        getNumber.close();
    }
}
