package com.Lewis;
import java.util.*;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to rock, paper, scissors!");

        Boolean correctInput = false;

        while (!correctInput)
        {
            System.out.print("Type 'rock' for rock, 'paper' for paper, and 'scissors' for scissors: ");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine().toLowerCase();

            if(input.equals("rock") || input.equals("paper") || input.equals("scissors"))
            {
                String[] options = {"rock", "paper", "scissors"};
                Random random = new Random();
                int x = random.nextInt(1, 3);
                String randomSelection = options[x];

                if(randomSelection.equals(input))
                {
                    System.out.println("\nTie.");
                }

                if(input.equals("rock"))
                {
                    switch(randomSelection)
                    {
                        case "paper":
                            System.out.println("\nYou lose.");
                        case "scissors":
                            System.out.println("\nYou win.");
                    }
                }
                else if(input.equals("paper"))
                {
                    switch(randomSelection)
                    {
                        case "rock":
                            System.out.println("\nYou win.");
                        case "scissors":
                            System.out.println("\nYou lose.");
                    }
                }
                else if(input.equals("scissors"))
                {
                    switch(randomSelection)
                    {
                        case "rock":
                            System.out.println("\nYou lose.");
                        case "paper":
                            System.out.println("\nYou win.");
                    }
                }

                System.out.println("You chose " + input + " and the computer chose " + randomSelection + ".\n");

                System.out.println("Would you like to play again? (Y or N): ");
                String playAgain = sc.nextLine();

                if(!playAgain.toUpperCase().equals("Y"))
                {
                    correctInput = true;
                }
            }
            else
            {
                System.out.println("Invalid input.\n");
            }
        }

    }
}
