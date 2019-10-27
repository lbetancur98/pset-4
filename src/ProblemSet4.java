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
        
        //ps.sum();
        //ps.reverse();
        //ps.digits();
        //ps.average();
        //ps.prime();
        //ps.fibonacci();
        ps.factors();
        //ps.mario();
        //ps.luigi();
        //ps.credit();
                
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
            System.out.print("Positive Integer: ");
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
            System.out.print("Positive Integer: ");
            integer = in.nextInt();
            in.nextLine();
            
        } while (integer <= 0);

        String integerString = String.valueOf(integer);

        for(int i = integerString.length(); i >= 1 ; i--){
            
        
            if(Integer.parseInt(Character.toString(integerString.charAt(i-1))) % 2 != 0){
                sumOfOdds += Integer.parseInt(Character.toString(integerString.charAt(i-1)));
            }
           

        }
        
         System.out.println("\n" + sumOfOdds+ ".");
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
        
        System.out.printf("\n%,.2f.", averageOfNumbers);

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
            System.out.print("Non-negative integer: ");
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
            System.out.print("Positive integer: ");
            numberOfSequences = in.nextInt();
            in.nextLine();
            
            
        } while (!(numberOfSequences >= 1) || !(numberOfSequences <=92));

        for( int i = 3; i <= numberOfSequences; i++){
            n3 = n1+n2;
             
            n1 = n2;
            n2 = n3;
              
        }

        System.out.println(n3 + ".");

    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a positive integer. What are its factors?
     */
    
    public void factors() {

        int integer;
        String factors = " ";
        int count = 0;
        int sameQuestion = 1;

        do {
            System.out.print("Positive integer: ");
            integer = in.nextInt();
            in.nextLine();
            
            
        } while (integer <= 0);

        for(int i =1; i < integer; i++){
            if (integer % i == 0){


                if(count == 0){
                        factors = factors +  i + ", " + integer/i;
                } else {
                    for(int j=0; j<=factors.length()-1;j++) {
                        System.out.println(Character.forDigit(i, 10));
                        System.out.println(integer/i);
                        
                        if(factors.charAt(j) == Character.forDigit(i, 10) ){
                            System.out.println("here");
                            sameQuestion = 0;
                            j = factors.length();
                        } else {
                            sameQuestion = 1;
                        }
                        
                        
                        
                    }
                    if(sameQuestion == 1){
                        factors = factors + ", " + i + ", " + integer/i;
                    } else {

                    }
                
                }
                
               

                
                
                
            }

            count++;
        }

        System.out.println(factors + ".");

    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */
    
    public void mario() {        

    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */
    
    public void luigi() {

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */
    
    public void credit() {
        
    }
}