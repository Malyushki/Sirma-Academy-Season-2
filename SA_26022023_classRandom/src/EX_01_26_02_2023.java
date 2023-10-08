import java.util.Random;

public class EX_01_26_02_2023 {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            char upperLetter = (char) (65 + random.nextInt(27));
            char smallLetter = (char) (97 + random.nextInt(27));
            char specialSymbol = (char) (33 + random.nextInt(32));
            int number = random.nextInt(10);
            sb.append(upperLetter).append(smallLetter).append(specialSymbol).append(number);
        }
        System.out.print("Your random password is: ");
        System.out.println(sb);
    }
}