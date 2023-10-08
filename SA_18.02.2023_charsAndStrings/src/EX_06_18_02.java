import java.util.Scanner;

public class EX_06_18_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first text:");
        String text = scanner.nextLine();
        System.out.println("Enter second text:");
        String text2 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);

        if (text.length()%2==0){

            sb.insert(text.length()/2,text2);
        }else {
            sb.replace(text.length()/2,text.length()/2+1,text2);


        }

        System.out.println("Result:");
        System.out.println(sb.toString());
    }
}
