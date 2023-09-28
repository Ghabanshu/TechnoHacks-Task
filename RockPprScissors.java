package com.game;
 
import java.util.*;

public class RockPprScissors {
    public static void main(String[] args) {
        System.out.println("Wellcome to Rock Paper Scissors Game....");
        System.out.println("      || Instructions ||     ");
        System.out.println("'0' for rock!");
        System.out.println("'1' for paper!");
        System.out.println("'2' for scissors!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your input");
        int userinput = sc.nextInt();
        
        Random rmd = new Random();
        int computerinput = rmd.nextInt(3);
        
        if(computerinput == userinput){
            System.out.println("Game is draw");
        }
        else if(computerinput == 0 && userinput == 1 || computerinput == 1 && userinput ==2
                || computerinput == 2 && userinput == 0){
            System.out.println("Congratulations " + name + " you win the game!!");  
        }
        else{
            System.out.println("Computer win the game!!");
        }
        
        System.out.println("Computer choice is " +computerinput);
        
        if(computerinput == 0){
            System.out.println("Computer choice is rock");
        }
        else if(computerinput ==1){
            System.out.println("Computer choice is paper");
        }
        else{
            System.out.println("Computer choice is Scissors");
        }
    }
   
}
