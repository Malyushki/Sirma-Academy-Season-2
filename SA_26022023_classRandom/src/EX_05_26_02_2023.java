import java.util.*;

public class EX_05_26_02_2023 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerNumber = getComputerNumber(random);
        //System.out.println(computerNumber);
        int gameCounter = 1;
        System.out.println("GAME TRIES: " + gameCounter);
        System.out.println("Enter 4 different numbers:");
        String userNumber = scanner.nextLine();
        while (checkUserNumber(userNumber)) {
            userNumber = scanner.nextLine();
        }

        while (!userNumber.equals(computerNumber) && gameCounter < 10) {
            int countBulls = 0;
            int countCows = 0;
            for (int i = 0; i < 4; i++) {
                if (userNumber.charAt(i) == computerNumber.charAt(i)) {
                    countBulls++;
                }
            }
            for (char e : userNumber.toCharArray()) {
                if (computerNumber.contains(e + "")) {
                    countCows++;
                }
            }
            countCows -= countBulls;
            System.out.println("You have: " + countBulls + " Bolls");
            System.out.println("You have: " + countCows + " Cows");

            gameCounter++;

            System.out.println("GAME TRIES: " + gameCounter);
            System.out.println("Enter 4 different numbers:");
            userNumber = scanner.nextLine();
            while (checkUserNumber(userNumber)) {
                userNumber = scanner.nextLine();
            }

        }
        if (gameCounter < 10) {
            System.out.println("Congratulations you win. The number was: " + computerNumber);
        } else {
            System.out.println("You lose. The number was: " + computerNumber);
        }
    }

    private static String getComputerNumber(Random random) {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 4) {
            int newNumber = random.nextInt(10);
            if (!numbers.contains(newNumber)) {
                numbers.add(newNumber);
            }
        }
        return numbers.toString().replaceAll("[\\[\\], ]", "");
    }

    private static boolean checkUserNumber(String userNumber) {
        if (userNumber.length() != 4) {
            System.out.println("Your number should be 4 digits long");
            return true;
        }

        for (int i = 0; i < userNumber.length(); i++) {
            for (int j = i + 1; j < userNumber.length(); j++) {
                if (userNumber.toCharArray()[i] == userNumber.toCharArray()[j]) {
                    System.out.println("You have 2 identical numbers. Enter again: ");

                    return true;
                }
            }
        }
        return false;
    }
}
