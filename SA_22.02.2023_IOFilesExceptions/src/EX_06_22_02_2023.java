import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class EX_06_22_02_2023 {
    public static void main(String[] args) {

        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_25.01.2023_Classes\\src";


        try {
            File dir = new File(path);
            if (dir.isDirectory()) {
                for (File file : dir.listFiles()) {
                    if (file.isFile() && file.getName().endsWith(".java")) {
                        System.out.println("There are java files");
                        return;
                    }
                }

            }
            System.out.println("There aren't any java files");
        } catch (Exception e) {
            throw new RuntimeException(e);


        }


    }

}