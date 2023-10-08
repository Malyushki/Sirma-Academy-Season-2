import java.util.Random;
import java.util.stream.IntStream;

public class DEMO_26_02_2023 {
    public static void main(String[] args) {
        Random random = new Random();

        int intX = random.nextInt(51);
        int intY = random.nextInt(1001);

        System.out.println("Randomly generated integers:");
        System.out.println(intX);
        System.out.println(intY);

        double doubleX = random.nextDouble(51);
        double doubleY = random.nextDouble(1001);

        System.out.println("Randomly generated flot numbers:");
        System.out.println(doubleX);
        System.out.println(doubleY);

        IntStream intNumbers = random.ints(5, 1, 101);
        System.out.println("Randomly generated stream of integers:");
        intNumbers.forEach(System.out::println);

    }
}
