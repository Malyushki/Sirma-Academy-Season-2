package EX_03_26_03_2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileOpenerClass implements FileOpener {
    FileAdapter fileAdapter;

    public FileOpenerClass() {
        fileAdapter = new FileAdapter("txt");
    }

    public String open(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("txt")) {
            return fileAdapter.open(fileType, fileName);
        } else if (fileType.equalsIgnoreCase("ser")) {
            String path = "SirmaAcademy_2023/SA_26_03_2023/EX_03_26_03_2023/files/";
            try (

                    FileInputStream fileIn = new FileInputStream(path + fileName);
                    ObjectInputStream in = new ObjectInputStream(fileIn)) {
                Student student = (Student) in.readObject();
                return student.getName();
            } catch (IOException | ClassNotFoundException i) {
                i.printStackTrace();
            }
        }
        return null;
    }
}

