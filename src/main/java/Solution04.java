/*
 *  UCF COP3330 Fall 2021 Assignment1 Solution for Pb4
 *  Copyright 2021: Praween Pongpat
 */

import java.util.Scanner;

public class Solution04 {
    /*
        print (prompt user) "Enter a noun: "
            'noun' = read string from user
        print (prompt user) "Enter a verb: "
            'verb' = read string from user
        print (prompt user) "Enter an adjective: "
            'adjective' = read string from user
        print (prompt user) "Enter an adverb: "
            'adverb' = read string from user
        print (output) using string interpolation (printf-%s,%d,.. as needed)
     */

    public static void main(String[] args) {    //beginning of main method
        Scanner input = new Scanner(System.in);         //allocate input using Scanner class from API

        System.out.print("Enter a noun: ");             //prompt user for a noun
        String noun = input.nextLine();                 //set 'noun' read from user

        System.out.print("Enter a verb: ");             //prompt user for a verb
        String verb = input.nextLine();                 //set 'verb' read from user

        System.out.print("Enter an adjective: ");       //prompt user for an adjective
        String adjective = input.nextLine();            //set 'adjective' read from user

        System.out.print("Enter an adverb: ");          //prompt user for an adverb
        String adverb = input.nextLine();               //set 'adverb' read from user

        System.out.printf("Do you %s your %s %s %s? That's hilarious!%n",
                           verb, adjective, noun, adverb);     //print output to screen
    }                                           //end main method
}
