import java.util.*;

public class EX_08_18_02_Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        System.out.println("Enter letter or leave empty to finish:");
        String command = scanner.nextLine();
        while (!command.equals("")){
            System.out.println("Enter letter or leave empty to finish:");
            sb.append(command);

            command =scanner.nextLine();
        }
        char[] result = sb.toString().toCharArray();
        Arrays.sort(result);


        System.out.println("Result:");
        System.out.println(result);



    }
}
