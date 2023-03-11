/**
 * @author Trevor Hartman
 * @author Bryan Maus
 * Date 03/10/2023
 *
 * @since version 1.0
 *
 * This program calculates the greatest common factor of 2 numbers
 */

import java.util.Scanner;

public class MyMath {
    //Fluffy stuff
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        //Initialize and collect numbers
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("\nEnter second number: ");
        int b = s.nextInt();
        int c =0;

        //Loop to figure GCF
        while (b!=0){
            if(a>b){
                c=b;
                b=a%b;
                a=c;
            }
            else {
                b=b%a;
            }
        }
        //output to screen
        System.out.println("\nThe Greatest Common Factor is: " + GREEN + c + RESET);
    }
}
