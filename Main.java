package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();

        // משחק ניחושים:
        // תוכנית שתגריל מספר רנדומלי RandomNumber +
        // userGuess לקלוט מספר מהמשתמש
        // לבדוק האם המספר שהמשתמש הכניס הוא המספר שהוגרל
        // ליצור תנאי IF שבודק האם המספר הרנדומלי שהגרלנו שווה למספר שקלטנו מהמשתמש

        int RandomNumber = random.nextInt(3);  // 1-99
        System.out.println("Enter your guess- ");
        int userGuess = s.nextInt();

        if (userGuess == RandomNumber){
            System.out.println("you Won!");
        }else{
            System.out.println("you loose");
            System.out.println("the random number was " + RandomNumber);
        }

        //String format:
        int x = s.nextInt();
        int y = s.nextInt();

        //System.out.println("Sum of the numbers is: " + (x + y));
        System.out.println(String.format("Sum of the numbers is %d", x + y)); // String format

        //int num = s.nextInt();

        //System.out.println("Enter number?");
        /*int number = s.nextInt();

        if(number == 8 || number == 2)  // || Or && AND
        {
            System.out.println(number);
        }
        else if(number == 5)
        {
            System.out.println(number);
        }
        else
        {
            System.out.println("not the correct number");
        }*/
       /* boolean isStudent = false;
        boolean isSmart = false;

        if(isStudent){ // ! flase -> true
            System.out.println("You are student");
        }
        else if(!isSmart){ // ! flase -> true
            System.out.println("You are smart");
        }
        else{
            System.out.println("other");
        }*/

    }
}
