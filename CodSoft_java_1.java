import java.util.*;
public class CodSoft_java_1 {
    public static void main(String[] args){
   int rando;
   int input,n,round=0,score=0;
   int count;
   rando = (int)(Math.random()*100);
   Scanner sc = new Scanner(System.in);
   while(true){
    round++;
    System.out.println();
    System.out.println("THE PERFECT GUESS");
    System.out.println("Rules-->");
    System.out.println("1.Computer will generate a random number within 1 to 100.");
    System.out.println("2.You will be instructed to guess a random number");
    System.out.println("3.Computer will provide feedback on whether the guess is correct,too high or too low.");
    System.out.println("4.You can try for 5 times to guess the correct number");
    System.out.println("5.Try again in next round(Not more than 3rd round)");
    if(round==4){
        break;
    }
    if(round==1){
    System.out.println("Press 1 to start the game: ");
    } else if(round>1){
        System.out.println("Press 1 to play again: ");
    }
    n = sc.nextInt();
    if(n!=1){
        System.out.println("Wrong input");
        System.out.println("Terminating....");
        break;
    }
    System.out.println("ROUND "+round);
    count=0;
    switch(n){
        case 1:
     while(true){
        count++;
        if(count==6){
            System.out.println("You have crossed the limit of attempts.Better luck next time");
            break;
        }
        System.out.println("Attempt "+count);
        System.out.print("Guess a number: ");
        input = sc.nextInt();
        if(input<0){
            System.out.println("You have guessed a negative number");
            System.out.println("The number computer wanted you to guess is "+rando);
            System.out.println("Terminating....");
            break;
        }else if(input==rando){
            score++;
            System.out.println("Congratulations!!You have guessed the correct number which is "+input);
            System.out.println("Your current score: "+score);
            System.out.println("Terminating....");
            break;
        }else if(input>rando){
            System.out.println("You have guessed greater number");
        }else if(input<rando){
         System.out.println("You have guessed smaller number");
        }
   }
        break;
    }
    }

}
}
