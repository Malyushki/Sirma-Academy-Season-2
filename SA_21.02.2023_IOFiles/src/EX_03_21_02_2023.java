import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EX_03_21_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = scanner.nextLine();
        System.out.println("Enter password:");
        String userPassword = scanner.nextLine();
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\FIles\\" + userName;
        try {
         FileReader   reader = new FileReader(path);
            Scanner myReader = new Scanner(reader);
            if (myReader.hasNextLine()){
                if (userPassword.equals(myReader.nextLine())){
                    System.out.println("Log in is successful");
                }else {
                    System.out.println("Wrong password");
                }
            }

        } catch (IOException e) {
            System.out.println("User doesn't exists");
        }


    }
}
