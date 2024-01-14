import java.util.*;
public class guessnumbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxattempt = 5;
        int score = 0;

        boolean playAgain = true;
        while (playAgain) {
            int targetnumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between" + minRange + "and" + maxRange + "Try targetnumber");

            int attempts = 0;
            while (attempts < maxattempt) {
                System.out.println("Enter your guess Number:");
                int userGuess = scanner.nextInt();
                attempts ++;

                if (userGuess < targetnumber){
                    System.out.println("Too low! Try again.");
                }
                else if (userGuess > targetnumber){
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Congratulations! you guessed the number" + targetnumber + "in" + attempts);
                    score = maxattempt - attempts + 1;
                    break;

                }
                
            }
            if (attempts == maxattempt){
                System.out.println("sorry , you've reached the maximum number of attempts.");
            }
            System.out.println("Do you want to play again?(yes/no)");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }
        System.out.println("Thanks for playing! your total score is:" + score);

    }
}