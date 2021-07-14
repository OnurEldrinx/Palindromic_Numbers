import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = keyboard.nextInt();

        itItPalindromic(number);


    }

    static void itItPalindromic(int number){

        int tempNumber,mod,reverseNumber=0;

        tempNumber = number;

        while (tempNumber != 0){

            mod = tempNumber % 10;
            reverseNumber = reverseNumber * (10) + mod;
            tempNumber = tempNumber / 10;


        }

        if (number == reverseNumber){

            System.out.println(number + " is palindromic.");

        }else{

            System.out.println(number + " is not palindromic.");

        }


    }

}
