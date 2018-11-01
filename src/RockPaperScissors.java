import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

    public static void main(String[] args) {
        int input;
        int b=1;
        Scanner sage= new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Rock Paper Scissors");
        System.out.println("Select 1, 2, 3, for rock, paper, scissors");
        while (b != 0) {
            int rock = 1, paper = 2, scissors = 3;
            input = sage.nextInt();
            int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;

            if (randomNumber == rock) {
                if (input == rock) {
                    System.out.println("Rock vs Rock, Its a tie!");
                } else if (input == paper) {
                    System.out.println("Rock vs Paper, You win");
                } else if (input == scissors) {
                    System.out.println("Rock vs Scissors, You lose");
                }
            }else if (randomNumber == paper) {
                if (input == rock) {
                    System.out.println("Paper vs Rock, You lose");
                } else if (input == paper) {
                        System.out.println("Paper vs Paper, Its a tie");
                } else if (input == scissors) {
                        System.out.println("Paper vs Scissors, You win");
                    }
            }else if (randomNumber == scissors) {
                if (input == rock) {
                    System.out.println("Scissors vs Rock, You win");
                } else if (input == paper) {
                    System.out.println("Scissors vs Paper, You lose");
                } else if (input == scissors) {
                    System.out.println("Scissors vs Scissors, Its a tie");
                }
            }
        }
    }
}
