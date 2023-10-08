import java.util.Scanner;

public class WA_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int[n];
        int [] numbersBy3 = new int[n];
        int [] numbersBy7 = new int[n];
        int counter1=0;
        int counter2=0;

        for (int i = 0; i <n ; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i]%3==0){
                numbersBy3[counter1] = numbers[i];
                counter1++;
            }
            if (numbers[i]%7==0){
                numbersBy7[counter2] = numbers[i];
                counter2++;
            }

        }
        System.out.println("Number multiples by 3");
        for (int i = 0; i < numbersBy3.length; i++) {
            if (numbersBy3[i]!=0){
                System.out.print(numbersBy3[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Number multiples by 7");
        for (int i = 0; i < numbersBy7.length; i++) {
            if (numbersBy7[i]!=0){
                System.out.print(numbersBy7[i]+" ");
            }
        }
    }
}
