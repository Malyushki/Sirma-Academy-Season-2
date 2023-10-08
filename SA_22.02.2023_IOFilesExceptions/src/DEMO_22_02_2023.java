import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DEMO_22_02_2023 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

 /*       try {
            // Risky code
            double x = s.nextDouble();
            System.out.println(1 / x);
        }
        // Exception handling
        catch (Exception e) {
            System.out.println("Wrong input data");
            e.printStackTrace();
        }
        // Cleanup always runs
        finally {
            System.out.println("Cleanup code");
        }
        System.out.println("Moving on to better things");

  */
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_22.02.2023_IOFilesExceptions\\Files";
        String fileName = "test";
        try {
            File newDir = new File(path + fileName);
            newDir.mkdir();
            File newFile = new File(fileName + "/newFile.txt");
            newFile.createNewFile();

            String[] fileList = newDir.list();
            for (String file : fileList) {
                System.out.println(file);
            }
            if (newFile.isFile()) {
                newFile.renameTo(new File("newNewFile.txt"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }

    }
}
