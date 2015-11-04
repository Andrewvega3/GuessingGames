package vega_3_guessinggame;

import java.util.Random;
import java.util.Scanner;

public class Vega_3_GuessingGame {

    static int magicnumber;
    static int userguess;
    static String username;
    static Random randy = new Random();
    static boolean playagain;
    
    public static void main (String[] args) {
        playagain = true;
        magicnumber = randy.nextInt(52);
        System.out.println("Hello, would you like to play again?");
        System.out.println("What's your name?");
        Scanner userinputname = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        //Two main ones we need
        //int something = sc.nextInt();
        //sc.nextLine();
        username = userinputname.nextLine();
        System.out.println("Hello " + username + " lets play");
        int lives = 5;
        //runs while the condition is true
        while (lives > 0){
        playthegame();
        lives--;
    }
    }
    
    static void playthegame(){
        Scanner userinputnumbers = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        userguess = userinputnumbers.nextInt();
        if (magicnumber == userguess){
            System.out.println("You Win");
            System.out.println("The number was" + magicnumber);
            playagain = false;
            
        
        } else if (magicnumber > userguess){
            System.out.println ("Your guess is to low");
            
        } else {
            System.out.println("Your guess is to high");
        }

    }
        
    
                
                
}