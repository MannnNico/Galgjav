package com.company;

import java.util.Scanner;

public class Main {

    
    public static Integer difficulty = 0;
    public static Integer maxTries = 100;



    public static void main(String[] args) {
        name();
        difficulty();
        wordgenerator();
        Guess();

    }

    private static void name() {
        System.out.println("Hello and welcome to the game!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Name input: ");
        String name = sc.next();
        System.out.println("Welcome: " + name);
    }

    public static void difficulty() {
        if (difficultyValid())
            setDifficultyToTries();
        else {
            System.out.println("Please chose difficulty between 1 and 5:");
            Scanner sc = new Scanner(System.in);
            try {
                difficulty = Integer.parseInt(sc.next());
            }catch (NumberFormatException ex){
                System.out.println("only numbers");
            }
            difficulty();  //Rekursion
        }
    }

    static boolean difficultyValid() {
        if (difficulty > 0 && difficulty < 6){
            System.out.println("Difficulty set to: " + difficulty);
            return true;
        } else {
            return false;
        }
    }
    static void setDifficultyToTries() {
        Float tries;    //float für Zahlen mit Kommata
        Float multipierTries;
        multipierTries = ((float) (difficulty / 10.0));
        tries = maxTries * multipierTries;
        System.out.println("You have "+ tries + " tries!");
    }
    static void wordgenerator() {
        Scanner sx = new Scanner(System.in);
        System.out.println("Please enter the word you wich to guess!");
        String word = sx.next();
        System.out.println("Your input: " + word);
        wordTransfer(word);
    }
    static void wordTransfer(String word){
        int wordLegth = word.length();
        char[] wordarray = new char[wordLegth];
       wordarray = word.toCharArray();
       System.out.println(wordarray[0]);
       Guess(wordarray);
    }
    static void Guess(char[] testarray){
        Scanner Guess = new Scanner(System.in);
        System.out.println("Take Guess!");
        String GuessInput = Guess.next();
        System.out.println(GuessInput);

        for(char i = 0;i < testarray.length;i++) {

        }
    }
}


