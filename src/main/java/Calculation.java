import org.junit.Test;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Calculation {

    public static BigInteger a;
    public static BigInteger b;
    public static double c;
    public static double d;
    public static BigInteger resultProgramA;
    public static double resultProgramB;
    public static BigInteger resultOfDifference;
    public static Scanner input;
    public static final String GREEN = "\033[0;32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {

        input = new Scanner(System.in);
        while (true) {
            System.out.println("Multiply two numbers in two kinds of algorithm and get the difference of both results");
            TimeUnit.SECONDS.sleep(1L);
            System.out.println("Let's start!");
            TimeUnit.SECONDS.sleep(1L);
            programA();

            System.out.println("Let's continue with the second algorithm");
            TimeUnit.SECONDS.sleep(1L);
            programB();

            TimeUnit.SECONDS.sleep(1L);
            difference();
            System.out.println("\n Would you like to continue? (y or n)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if (s.equals("n")) {
                break;
            }
        }
    }
    @Test
    public static void programA() {
        System.out.println("First algorithm : \nEnter first number : ");
        a = input.nextBigInteger();

        System.out.println("Enter the second number: ");
        b = input.nextBigInteger();

        resultProgramA = a.multiply(b);
        System.out.println("The result of first algorithm : " + resultProgramA);
    }
    @Test
    public static void programB() {
        System.out.println("Second algorithm : \nEnter first number : ");
        c = input.nextDouble();
        System.out.println("Enter the second number: ");
        d = input.nextDouble();

        resultProgramB = c*d;
        System.out.println("The result of second algorithm : " + resultProgramA);

    }
    @Test
    public static void difference() {
        resultOfDifference = resultProgramA.subtract(resultProgramA);
        System.out.println(GREEN+"The difference between two algorithms is :" + resultOfDifference);
        System.out.println(ANSI_RESET);
    }
}
