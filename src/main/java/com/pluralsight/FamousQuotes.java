package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean condition = false;
        String anotherQuote;

        String[] favoriteQuotes = {
                "The unexamined life is not worth living. - Socrates",
                "He who has a why to live can bear almost any how. - Friedrich Nietzsche",
                "We are what we repeatedly do. Excellence, then, is not an act, but a habit. - Will Durant",
                "The happiness of your life depends upon the quality of your thoughts. - Marcus Aurelius",
                "Man is condemned to be free. - Jean-Paul Sartre",
                "The only true wisdom is in knowing you know nothing. - Attributed to Socrates",
                "No man ever steps in the same river twice. - Attributed to Heraclitus",
                "Life can only be understood backwards; but it must be lived forwards. - Søren Kierkegaard",
                "The wound is the place where the Light enters you. - Commonly attributed to Rumi",
                "It is not death that a man should fear, but he should fear never beginning to live. - Marcus Aurelius"
        };

        for (int i = 0; i < favoriteQuotes.length; i++) {
            System.out.println(favoriteQuotes[i]);
        }

        while(!condition){
            System.out.print("\nPlease choose a number between 1 and 10 to display that quote: ");
            int j = scan.nextInt();
            scan.nextLine();

            try {
                System.out.println(favoriteQuotes[j-1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: your entry was not between 1 and 10...");
                System.out.println("Exception message: " + e.getMessage());
            }

            System.out.print("View another quote (Y/N): ");
            anotherQuote = scan.nextLine();

            if(!anotherQuote.equalsIgnoreCase("Y")){
                condition = true;
            }
        }

    }
}
