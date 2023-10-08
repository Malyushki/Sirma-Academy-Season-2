package EX_02_02_04_2023;
//import java.io.File;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
import java.time.*;
import java.time.format.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;


class Task extends TimerTask {
    public void run() {
        try {
            String receivedMessage = EX_02_02_04_2023.readFromFile();
            System.out.println("\n" + receivedMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


public class EX_02_02_04_2023 {

    private static final String FILE_PATH = "SirmaAcademy_2023/SA_02_04_2023/EX_02_02_04_2023/shared_text_file.txt";
    private static final String SECRET_KEY = "mysecretkey12345"; // Replace with your own secret key

    public static void main(String[] args) {

        // Create or open shared text file
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file2 = new File("SirmaAcademy_2023/SA_02_04_2023/EX_02_02_04_2023/change.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Start chat program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nickname:");
        String nickname = scanner.next();
        LocalTime now;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        while (true) {

            // Read message from user
            System.out.print("Enter your message: ");
            now = LocalTime.now();
            String timeString = now.format(formatter);
            String message = timeString + "#" + nickname + ":" + scanner.next();
            // Write message to shared text file
            writeToFile(message);
            Timer timer = new Timer();
            int interval = 20000; // 5 seconds
            timer.scheduleAtFixedRate(new Task(), 0, interval);
            // Read messages from shared text file

        }
    }

    private static void writeToFile(String message) {
        String filePath = FILE_PATH;
        try {

            //String content = decrypt(Files.readAllBytes(new File(filePath).toPath()));
            FileInputStream fis = new FileInputStream(filePath);
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);

            String content = new String(decrypt(bytes));
            content += message;
            System.out.println("Content:" + content);
            byte[] cipherText = encrypt(content);
            String enmessage = new String(cipherText);
            //Files.write(new File(filePath).toPath(), (enmessage + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));

            File change = new File("change.txt");
            FileWriter fw = new FileWriter(change);
            fw.write("1");
            fw.close();
            //File chat = new File(FILE_PATH);
            //FileWriter fw2 = new FileWriter(chat);
            //fw2.write(enmessage);
            //fw2.close();
            FileOutputStream out = new FileOutputStream(filePath);
            //out.write(data);
            out.write(encrypt(enmessage));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readFromFile() {

        try {
            String filePath = FILE_PATH;
            File change = new File("SirmaAcademy_2023/SA_02_04_2023/EX_02_02_04_2023/change.txt");
            Scanner s = new Scanner(change);
            String content = s.next();
            if (content.equals("1")) {
                FileWriter fw = new FileWriter(change);
                fw.write("0");
                fw.close();
                FileInputStream fis = new FileInputStream(filePath);
                byte[] bytes = new byte[fis.available()];
                fis.read(bytes);

                String filecontent = new String(decrypt(bytes));
                return filecontent;

            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return "";
    }

    public static byte[] encrypt(String plainText) throws Exception {
        Key key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] paddedPlaintext = addPadding(plainText.getBytes(StandardCharsets.UTF_8));
        return cipher.doFinal(paddedPlaintext);
    }

    public static String decrypt(byte[] cipherText) throws Exception {
        if (cipherText.length == 0) {
            return "";
        } else {
            Key key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            System.out.println(cipherText);
            byte[] decryptedText = cipher.doFinal(cipherText);
            return new String(decryptedText, StandardCharsets.UTF_8);
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