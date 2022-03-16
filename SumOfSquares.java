import java.util.Scanner;
public class SumOfSquares {


    /**
     * A program that calculates Sums of Squares
     *
     * <p>Purdue University -- CS18000 -- Spring 2021 -- Homework 05 -- Walkthrough</p>
     *
     * @author Purdue CS
     * @version February 20, 2021
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = 1;
        int square;
        int sum = 0;


        System.out.println("Please enter an integer:");
        int i = scan.nextInt();

        while (sum < i) {
            square = (k*k);
            sum = sum + square;
            k++;
            }

        System.out.println("The sum is: "+ sum);
    }

}
