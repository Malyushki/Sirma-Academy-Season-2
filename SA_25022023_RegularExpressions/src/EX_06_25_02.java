import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EX_06_25_02 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text: ");
            String text = scanner.nextLine();

            String[] words = text.split("\\s+");
            StringBuilder capitalized = new StringBuilder();
            for (String word : words) {
                capitalized.append(word.substring(0, 1).toUpperCase());
                capitalized.append(word.substring(1));
                capitalized.append(" ");
            }

            try {
                String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SA_24.02.2023_RegularExpressions\\Files\\";
                String fileName = "EX_06_25_02.txt";
                FileWriter writer = new FileWriter(path+fileName);
                writer.write(capitalized.toString());
                writer.close();

            }
            catch (IOException e) {
                System.out.println("ERROR");
                e.printStackTrace();
            }
        }
    }
