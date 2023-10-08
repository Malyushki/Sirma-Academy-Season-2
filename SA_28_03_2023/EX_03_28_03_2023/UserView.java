package EX_03_28_03_2023;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserView {
    void printUserInfo(String name, int age, String email, String address) {
      /*  StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s%n", name))
                .append(String.format("Age: %d%n", age))
                .append(String.format("Email: %s%n", email))
                .append(String.format("Email: %s%n", address));
        System.out.println(sb.toString().trim());


       */

        String path = "SirmaAcademy_2023/SA_28_03_2023/EX_03_28_03_2023/HTML_DATABASE/";
        String fileName = "view.html";
        File file = new File(path + fileName);

        try {
            FileWriter writer = new FileWriter(file);
            File fileToRead = new File("SirmaAcademy_2023/SA_28_03_2023/EX_03_28_03_2023/HTML_DATABASE/top.html");
            Scanner scanner = new Scanner(fileToRead);

            while (scanner.hasNextLine()) {
                writer.write(scanner.nextLine());
                writer.write(System.lineSeparator());
            }
            writer.write(htmlUserString(new User(name, age, email, address)));
            fileToRead = new File("SirmaAcademy_2023/SA_28_03_2023/EX_03_28_03_2023/HTML_DATABASE/bottom.html");
            scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()) {
                writer.write(scanner.nextLine());
                writer.write(System.lineSeparator());
            }


            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String htmlUserString(User user) {
        StringBuilder sb = new StringBuilder();
        sb.append("<tr>").append(System.lineSeparator())
                .append(String.format(" <td>%s</td>", user.getName())).append(System.lineSeparator())
                .append(String.format(" <td>%s</td>", user.getAge())).append(System.lineSeparator())
                .append(String.format(" <td>%s</td>", user.getEmail())).append(System.lineSeparator())
                .append(String.format(" <td>%s</td>", user.getAddress())).append(System.lineSeparator())
                .append("</tr>").append(System.lineSeparator());
        return sb.toString();

    }
}
