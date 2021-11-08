package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       // System.out.println("enter number between 1-5:");
        //int x = 10;

       /* while (x == 1){ // x == 80       /// if
            System.out.println("yo");
            System.out.println("man");
            x = 80; /// Stopping point - > x = 80
        }*/
        // 10- 0
        /*while (x > 0){
            System.out.println(x);
            x = x -1;
        }*/

        //1. print numbers from 1-100
        //2. print numbers from -100 to 100
        /*int num = -1000;

        while(num <= 1000){ /// <= - small or =
            System.out.println(num);
            num++;  // num = num + 1;
        }

        System.out.println("rest of the code...");
        System.out.println("rest of the code...");*/

       /* System.out.println("2 + 3 = ? ");
        int answer = scanner.nextInt();
        int attempts = 1;

        while (answer != 5){   // !=
            System.out.println("Wrong answer!!!  please try again 2 + 3 = ? ");
            answer = scanner.nextInt();
            attempts ++ ; // attempts = attempts + 1;
        }
        System.out.println("VERY GOOD! it took you" + attempts + "tries");*/


      /*  System.out.println(String.format("VERY GOOD! it took you %d tries", attempts));
        System.out.println(String.format("numbers are: %d, %d", 2 , 3));*/


        /*String gender = "Female";

        while (gender != "Female"){
            System.out.println("its a Male");
        }
        System.out.println("its a Female");*/
        /*Random random = new Random();
        int programGuess = random.nextInt(11);  // 1-10

        System.out.println("Enter your guess 1-10: ");
        int UserGuess = scanner.nextInt();
        int counter = 1;

        while (UserGuess != programGuess){ // כל עוד
            System.out.println("Wrong guess, try again...");
            UserGuess = scanner.nextInt();
            counter ++;
        }
        System.out.println("Correct!!! your number is " + programGuess);
        System.out.println("it took you " + counter + " tries");*/


        /*int password = 1234;
        //System.out.println("Enter password: ");
       int myPassword;

        do{
            System.out.println("what is your password?");
            myPassword = scanner.nextInt();
            System.out.println("Wrong password, try again");
        } while (myPassword != 1234);
        System.out.println("door is opened");*/

      /*  int r = 4;
        while (true){  // true
            System.out.println("infinity....");
        }*/

        do{
            System.out.println("infinity....");
            break;
        }while (true);

    }
}
