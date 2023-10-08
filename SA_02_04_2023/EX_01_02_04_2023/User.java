package EX_01_02_04_2023;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Scanner;

public class User {
    private String name;
    private String password;

    public User(String name, String password) throws IOException {
        this.name = name;
        setPassword(password);

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void saveUser() throws IOException {

        File file = new File("SirmaAcademy_2023/SA_02_04_2023/EX_01_02_04_2023/UserData/" + this.name + ".txt");
        FileWriter writer = new FileWriter(file);

        try {
            writer.write(String.valueOf(encryptPassword(this.password)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        writer.close();
    }

    public static byte[] encryptPassword(String plainText) throws Exception {
        String secretKey = getKey();
        Key key = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] paddedPlaintext = addPadding(plainText.getBytes(StandardCharsets.UTF_8));
        return cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
    }

    public static String getKey() throws FileNotFoundException {
        File file = new File("SirmaAcademy_2023/SA_02_04_2023/EX_01_02_04_2023/UserData/key.txt");
        Scanner scanner = new Scanner(file);
        return scanner.nextLine();

    }

    public static String decryptPassword(byte[] cipherText) throws Exception {

        String secretKey = getKey();
        Key key = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        //byte[] base64decodedTokenArr = Base64.decodeBase64(decodeStr.getBytes());
        //byte[] decryptedPassword = cipher.doFinal(base64decodedTokenArr);

        byte[] decryptedText = cipher.doFinal(cipherText);
        return new String(decryptedText, StandardCharsets.UTF_8);
    }

    public void validateUser(String username, String password){
        File file = new File("SirmaAcademy_2023/SA_02_04_2023/EX_01_02_04_2023/UserData/"+username+".txt");
        if (!file.exists()){
            System.out.println("User doesn't exists");
        }else {
            try {
                Scanner readPass = new Scanner(file);
                String passFromDB = readPass.nextLine();
                System.out.println(passFromDB);
                String decryptedText = decryptPassword(passFromDB.getBytes(StandardCharsets.UTF_8));
                System.out.println(decryptedText);
                if (decryptedText.equals(password)){
                    System.out.println("Successful log in");
                }else {
                    System.out.println("Wrong password");
                }


            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
    private static byte[] addPadding(byte[] input) {
        int paddingLength = 16 - (input.length % 16);
        byte[] output = new byte[input.length + paddingLength];
        System.arraycopy(input, 0, output, 0, input.length);
        Arrays.fill(output, input.length, output.length, (byte) paddingLength);
        return output;
    }


}
