/**
 * Problem Set 4.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();
        
        // comment out or uncomment as needed
        
        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();
                
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     * 
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */
    
    public void sum() {

        int lowerBound;
        int upperBound;
        int addedValue = 0;
        
        do {
            System.out.print("Lower bound: ");
            lowerBound = in.nextInt();
            in.nextLine();
            System.out.print("Upper bound: ");
            upperBound = in.nextInt();
            in.nextLine();

        } while (upperBound < lowerBound);

        while(lowerBound <= upperBound){
            
            if(lowerBound % 2 == 0){
                addedValue = addedValue + lowerBound;
            }
            lowerBound++;
        }

        System.out.printf("\n %,d. ", addedValue);
                

    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */
    
    public void reverse() {
        int integer;
        String stringAdd = "";
        
        do {
            System.out.print("\n\nPositive Integer: ");
            integer = in.nextInt();
            in.nextLine();
            
        } while (integer <= 0);

        String integerString = String.valueOf(integer);
        for(int i = integerString.length(); i >= 1 ; i--){
            
            if(i-1 == 0){
                stringAdd = stringAdd + integerString.charAt(i-1)+". ";
            } else {
                stringAdd = stringAdd + integerString.charAt(i-1)+", ";
            }
            
            
           

        }
        
         System.out.println("\n" + stringAdd);
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */
    
    public void digits() {

        int integer;
        String stringAdd = "";
        int sumOfOdds = 0;
        
        do {
            System.out.print("\nPositive Integer: ");
            integer = in.nextInt();
            in.nextLine();
            
        } while (integer <= 0);

        String integerString = String.valueOf(integer);

        for(int i = integerString.length(); i >= 1 ; i--){
            
        
            if(Integer.parseInt(Character.toString(integerString.charAt(i-1))) % 2 != 0){
                sumOfOdds += Integer.parseInt(Character.toString(integerString.charAt(i-1)));
            }
           

        }
        
         System.out.println("\n" + sumOfOdds+ ".\n");
    }
    
    
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */
    
    public void average() {
        
        int integer;
        double sumOfNumbers = 0;
        double numberOfNumbers = 0;
        double averageOfNumbers;
        
        do {
            System.out.print("Non-negative integer: ");
            integer = in.nextInt();
            in.nextLine();
            

            if(integer != -1){
                sumOfNumbers = sumOfNumbers + integer;
                numberOfNumbers++;
            }
            
            
        } while (integer != -1);


        averageOfNumbers = sumOfNumbers / numberOfNumbers;
        
        System.out.printf("\n%,.2f.\n", averageOfNumbers);

    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */
    
    public void prime() {
        
        int integer;
        boolean prime = true;
        
        do {
            System.out.print("\nNon-negative integer: ");
            integer = in.nextInt();
            in.nextLine();
            
            
        } while (integer <= 0);

        for(int i =2; i < integer; i++){
            if (integer % i == 0){
                prime = false;
                i = integer;
                
            }
        }

        

        if(prime == false){
            System.out.println("\nNot Prime.");
        } else {
            System.out.println("\nPrime.");
        }
    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */
    
    public void fibonacci() {

        int numberOfSequences;
        int n1 = 1;
        int n2 = 1;
        
        int n3 = 1;
        
        do {
            System.out.print("\nPositive integer: ");
            numberOfSequences = in.nextInt();
            in.nextLine();
            
            
        } while (!(numberOfSequences >= 1) || !(numberOfSequences <=92));

        for( int i = 3; i <= numberOfSequences; i++){
            n3 = n1+n2;
             
            n1 = n2;
            n2 = n3;
              
        }
        System.out.println("\n" + n3 + ".");
    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a positive integer. What are its factors?
     */
    
    public void factors() {
        System.out.print("\nPositive integer: ");
        int integer = in .nextInt();

        while (integer <= 0) {
            System.out.print("Positive integer: ");
            integer = in .nextInt();
        }

        System.out.print("\n");

        for (int i = 1; i <= integer / 2; i++) {


            if (integer % i == 0) {
                if (i > integer / i) {


                    System.out.print(".\n\n");
                    return;


                } else {


                    if (i == 1) {
                                             
                        System.out.print(i + ", " + (integer/ i));


                    } else {


                        if (i != (integer / i)) { 

                            System.out.print(", " + i + ", " + (integer / i));

                        } else {

                            System.out.print(", " + i + ".\n\n");
                            return;


                        }
                    }
                }
            }
        }
    }

     
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */
    
    public void mario() {
        
        int height =-1;
        String value = "";       
        String y = " ";
        String z = "#";

        do {
            
            System.out.print("Height: ");
            height = in .nextInt();
            
        } while (height < 1 || height > 24);

        System.out.print("\n");
        int x = height;

       

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < x - (i + 1); j++) {

                value = value + y;

            }
            for (int k = 0; k < i + 2; k++) {

                value = value + z;

            }

            value = value + '\n';
        }
        System.out.print(value + "\n");

    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */
    
    public void luigi() {
        int height;
        String value = "";
       
        String y = " ";
        String z = "#";

        do {
            
            System.out.print("Height: ");
            height = in .nextInt();
            
        } while (height < 1 || height > 24); 

        int x = height;
        System.out.print("\n");

        

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < height - (i + 1); j++) {
                value += y;
            }

            for (int j = 0; j <= i + 1; j++) {
                value += z;
            }

            value += y;
            value += y;

            for (int j = 0; j <= i + 1; j++) {
                value += z;
            }
            value += "\n";
        }

        System.out.print(value);
    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */
    
    public void credit() { in .nextLine();
        System.out.print("\nNumber: ");
        String number = in .nextLine();
        int sumEveryOther = 0;
        int numberMultiply;
        int finalSum = 0;

        for (int i = number.length() - 2; i >= 0; i -= 2) {

            numberMultiply = Character.getNumericValue(number.charAt(i));
            sumEveryOther = numberMultiply * 2;

            if (sumEveryOther >= 10) {              
                finalSum += (int)((sumEveryOther / Math.pow(10, 0)) % 10) + (int)((sumEveryOther / Math.pow(10, 1)) % 10);
            } else {
                finalSum += sumEveryOther;
            }

        }

        for (int i = number.length() - 1; i >= 0; i -= 2) {
            numberMultiply = Character.getNumericValue(number.charAt(i));
            finalSum += numberMultiply;
        }

        String stringEveryOther = Integer.toString(finalSum);


        if (stringEveryOther.charAt(stringEveryOther.length() - 1) == '0') {

            if (number.charAt(0) == '3' && (number.charAt(1) == '4' || number.charAt(1) == '7')) {
                System.out.println("\nAmex.\n");
            } else if (number.charAt(0) == '5' && (number.charAt(1) == '1' || number.charAt(1) == '2' || number.charAt(3) == '3' || number.charAt(4) == '4' || number.charAt(5) == '5')) {
                System.out.println("\nMastercard.\n");
            } else if (number.charAt(0) == '4') {
                System.out.println("\nVisa.\n");
            }


        } else {
            System.out.println("\nInvalid.\n");
        }
    }

}