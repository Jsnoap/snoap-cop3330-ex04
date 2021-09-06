/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String noun, verb, adj, adv;

        System.out.println("Enter a noun:");
        Scanner inputNoun = new Scanner(System.in);
        noun = inputNoun.nextLine();

        System.out.println("Enter a verb:");
        Scanner inputVerb = new Scanner(System.in);
        verb = inputVerb.nextLine();

        System.out.println("Enter an adjective:");
        Scanner inputAdj = new Scanner(System.in);
        adj = inputAdj.nextLine();

        System.out.println("Enter an adverb:");
        Scanner inputAdv = new Scanner(System.in);
        adv = inputAdv.nextLine();

        System.out.println("How's your " + adj + " " + noun + "? I saw it " + adv + " " + verb + "!");
    }
}
