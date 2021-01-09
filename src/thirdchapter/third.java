package thirdchapter;

import java.util.Random;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        int a=5;
        // for loops
//        for(int a =10; a>0; a--){
//            System.out.println("hello");
//        }
//        while(a<10){
//            if(a==7){
//                break;
//            }
//            System.out.println("Hello");
//            a++;
//        }
        // do while loop(any condition its runs at least once fixed)
        do{
            System.out.println("hello do while loop");
            a++;
        }while(a<5);
        // taking inputs from user's
//        System.out.println("enter number");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        System.out.println("Answer was: "+ answer);
//        System.out.println("enter name");
//        String name = scanner.next();
//        System.out.println("hello," +name);
       // games generate a random number, ask user to inter number check number for five time after that game over\

        System.out.println("start game");
        System.out.println("Welcome to game");
        System.out.println("what is your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " +name);
        System.out.println("shall we start the game?");
        System.out.println("\t1.yes");
        System.out.println("\t2.No");

        int beginAnswer = scan.nextInt();

        while(beginAnswer !=1){
            System.out.println("shall we start the game?"); 
            System.out.println("\t1.yes");
            System.out.println("\t2.No");

            beginAnswer = scan.nextInt();
        }
        Random ran = new Random();
        int x = ran.nextInt(20)+1;
        System.out.println("please guess a number: ");
        int guess = scan.nextInt();
        int timeTried =0;
        boolean hasWon = false;
        boolean shouldFinish = false;
        while(!shouldFinish){
            timeTried++;
            if(timeTried <5){
                if (guess == x){
                    hasWon = true;
                    shouldFinish= true;
                }else if(guess > x){
                    System.out.println("guess lower");
                    guess = scan.nextInt();
                }else {
                    System.out.println("Guess higher");
                    guess = scan.nextInt();
                }

            }else{
                shouldFinish = true;
            }

        }
        if(hasWon){
            System.out.println("congratulations! you have guessed in your "+ timeTried+"guess.");
        }else{
            System.out.println("Game Over");
            System.out.println("the number was: " +x);
        }


   }
}
