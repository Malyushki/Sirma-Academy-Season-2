import java.io.*;

public class EX_09_21_02_2023 {
    public static void main(String[] args) {
      UserEX_09_21_02_2023 user = new UserEX_09_21_02_2023("Malyushki","0000","21.02.2023", "M");
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\Files\\";
        String fileName = "UserEX_09_21_02_2023.ser";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(user);
            out.close();
            fileOutputStream.close();
            System.out.printf("Serialized data is saved in " + fileName +System.lineSeparator());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(path + fileName);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            UserEX_09_21_02_2023 userReceiveInfo = (UserEX_09_21_02_2023) in.readObject();

            in.close();
            fileInputStream.close();
            userReceiveInfo.print();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
class UserEX_09_21_02_2023 implements Serializable{
String userName;
String password ;
String registrationDate ;
String gender ;

    public UserEX_09_21_02_2023(String userName, String password, String registrationDate, String gender) {
        this.userName = userName;
        this.password = password;
        this.registrationDate = registrationDate;
        this.gender = gender;
    }
    public void print(){
        System.out.println(this.userName);
        System.out.println(this.password);
        System.out.println(this.registrationDate);
        System.out.println(this.gender);

    }
}
