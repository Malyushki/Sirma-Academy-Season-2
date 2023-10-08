import java.util.Random;
import java.util.Scanner;

public class EX_04_26_02_2023 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("You need to guess a number between 0 and 100.");
        System.out.println("You have only 10 guesses.");
        System.out.println("Don't worry I will give you a hint each time you guess.");
        int number = random.nextInt(101);
        boolean isGuessed = false;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter you guess:");
            int playerNumber = Integer.parseInt(scanner.nextLine());
            if (playerNumber == number) {
                System.out.println("Congratulations you guessed the number!");
                isGuessed = true;
                break;
            } else if (playerNumber < number) {
                System.out.println("You need to go higher!");
            } else {
                System.out.println("You need to go lower!");
            }
        }
        if (!isGuessed) {
            System.out.println("You lose the number was: " + number);
        }
    }
}