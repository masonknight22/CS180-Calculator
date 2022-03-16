import java.util.Scanner;
/**
 * Calculator
 *
 * A program that calculates Addition, Subtraction, Multiplication, and division of any number as well as factorial.
 *
 * N/A
 *
 * @author Mason Knight
 * @version February 21, 2021
 */

public class Calculator {
    public static final String MENU = "Calculator" + "\n" +
            "1. Addition" + "\n" +
            "2. Subtraction" + "\n" +
            "3. Multiplication" + "\n" +
            "4. Division" + "\n" +
            "5. Factorial" + "\n" +
            "6. Quit" + "\n" +
            "Enter your selection:";
    public static final String ADDITION_PROMPT = "Enter each integer you would like added:";
    public static final String ADDITION_RESULT = "The sum of all these numbers is ";
    public static final String SUBTRACTION_PROMPT = "Enter each integer you would like subtracted:";
    public static final String SUBTRACTION_RESULT = "The difference of all these numbers is ";
    public static final String MULTIPLICATION_PROMPT = "Enter each integer you would like multiplied:";
    public static final String MULTIPLICATION_RESULT = "The product of all these numbers is ";
    public static final String DIVISION_PROMPT = "Enter each integer you would like divided:";
    public static final String DIVISION_RESULT = "The quotient of all these numbers is ";
    public static final String FACTORIAL_PROMPT = "Enter each integer you would like the factorial of:";
    public static final String FACTORIAL_RESULT = "The factorial of ";
    public static final String EXIT_MESSAGE = "Ending Calculator...";
    public static final String ERROR_MESSAGE = "Error, invalid option. Please select again.";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 1;

//enter menu

        while (i > 0) {

            System.out.println(MENU);

            int x = scan.nextInt();

//Addition prompt

            if (x == 1) {

                System.out.println(ADDITION_PROMPT);

                int sum = 0; //total sum

                while (x == 1) {


                    int s = scan.nextInt();

                    if (s > 0) {


                        sum = sum + s; //addition


                    } else if (s == 0) {

                        System.out.println(ADDITION_RESULT + sum);

                        break; //exit loop
                    }
                }


//Subtraction Prompt

            } else if (x == 2) {

                System.out.println(SUBTRACTION_PROMPT);

                int difference = 0;

                int d = scan.nextInt(); //starting number

                while (x == 2){

                    int dd = scan.nextInt(); //what is subtracting


                    if (dd > 0) {


                        d = d - dd; //difference

                    }

                    else if (dd == 0){

                        System.out.println(SUBTRACTION_RESULT+d);

                        break; //exit loop
                    }
                }

//Multiplication Prompt

            } else if (x == 3) {

                System.out.println(MULTIPLICATION_PROMPT);

                int product = 1;

                while (x == 3) {


                    int m = scan.nextInt();

                    if (m > 0) {


                        product = product * m; //multiplication


                    } else if (m == 0) {

                        System.out.println(MULTIPLICATION_RESULT + product);

                        break; //exit loop
                    }

                }

// Division Prompt

            } else if (x == 4) {

                System.out.println(DIVISION_PROMPT);

                int quotient = 0;

                int q = scan.nextInt(); //what is being divided

                while (x == 4) {

                    int qq = scan.nextInt(); //divisor


                    if (qq > 0) {


                        q = q / qq;

                    } else if (qq == 0) {

                        System.out.println(DIVISION_RESULT + q);

                        break; //exit loop
                    }
                }

// Factorial Prompt

            } else if (x == 5) {

                System.out.println(FACTORIAL_PROMPT);

                while (x == 5) {


                    int ss = scan.nextInt(); //starting number and next number for factorial to multiply !

                    int sume = 1; //sum

                    int se = ss; //for final print

                    if (ss > 0) {

                        while (ss > 0) {

                            sume = sume*ss; //factorial equation

                            ss--;

                        }

                            System.out.println(FACTORIAL_RESULT + se + " is " + sume);


                    }
                    else if (ss == 0) {

                        break; //exit loop
                    }
                }

// Exit Prompt

            } else if (x == 6) {

                System.out.println(EXIT_MESSAGE);

                break;

// Error Prompt for any number that is not from the number

            } else if (x > 6) {

                System.out.println(ERROR_MESSAGE);

            }
        }
    }
}