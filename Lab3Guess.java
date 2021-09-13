/* 
Maurzel Castleberry
Due Date: 09/12 | CS232


*/
package lab3guess;

import java.util.Scanner;



public class Lab3Guess {


    public static void main(String[] args) {
        
    Scanner Input = new Scanner(System.in);
        
    double rand = Math.random(); 
            
     int num; 
     int tries=0;
     int guess;
     int max = 100;
     int min = 1;
     int range = max - min + 1;
     boolean game = true;
  
//GENERATES RANDOM NUMBER BETWEEN 1 AND 100
/*   
for (int i = 0; i < 100; i++) {
        num = (int)(Math.random() * range) + min;
            
            System.out.println("I'm thinking of a number between 1 and 100 ...\n");
            System.out.println("Please guess a number; ");
        }
        */
        // inset the game title and the guess stuff herey
        System.out.println("I'm thinking of a number between 1 and 100 ... ");
        
        num = (int)(Math.random() * range) + min;
        //for testing
        System.out.println(num);
    while (game) {
        tries+=1; 
        System.out.print("What is your guess:");
        guess = Input.nextInt();
        if (guess == num) 
            {
                System.out.println("Congratulations! You guessed the number in "+tries+" guess(es)!");
                System.exit(1);
                game = false;
            } 
        else if (guess > num)
        { 
                System.out.println(" "+guess+" is too high.\n");
                //guess = Input.nextInt();
        } 
            else if (guess < num) 
            { 
                System.out.println(" "+guess+" is too low.\n");
                //guess = Input.nextInt();
        }	 
        
    }
 //-------------------END CODE---------------------//   

    }
}
