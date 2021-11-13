import java.util.Scanner;

public class Factorial {

    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a number to find it's factorial: ");

        int numToFactorial = SCANNER.nextInt();

        printFactorial(factorialNum(numToFactorial));
    }

    static void printFactorial (long factorial){

        System.out.println("The factorial of the entered number is: " + factorial);
    }

      static public long factorialNum (long numToFactorial){

          long factorial = 1;

          for (long i = numToFactorial; i >= 1; i--) {
              factorial *= i;
          }
        return factorial;
    }
}
