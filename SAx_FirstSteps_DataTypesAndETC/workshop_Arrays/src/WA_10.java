import java.util.Scanner;

public class WA_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers1 = new int[10];
        int [] numbers2 = new int[5];

        for (int i = 0; i <10 ; i++) {
            System.out.print("Enter number: ");
            numbers1[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int i = 0; i <10 ; i+=2) {
            numbers2[counter] = numbers1[i] + numbers1[i+1];
            counter++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers2[i]+" ");
        }
    }

}
