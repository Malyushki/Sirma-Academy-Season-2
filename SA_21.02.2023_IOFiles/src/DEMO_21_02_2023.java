import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DEMO_21_02_2023 {
    public static void main(String[] args) {
        try {
            File myFile = new File("filename.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile);
            } else {
                System.out.println("File already exists");
            }

            FileWriter myWriter = new FileWriter("filename.txt");

            myWriter.write("Some interesting content ! \nSome more interesting content");
            myWriter.close();
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String text = myReader.nextLine();
                System.out.println(text);

            }


        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

    }
}
