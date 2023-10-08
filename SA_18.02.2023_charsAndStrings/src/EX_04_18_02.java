import java.util.Scanner;

public class EX_04_18_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        while (text.length()<4){
            System.out.println("You need to write at lest a 4 letter word");
            text=scanner.nextLine();
        }
       String result = text.substring(0,2)+text.substring(text.length()-2,text.length());

        System.out.println("Result:");
       System.out.println(result);
    }
}
