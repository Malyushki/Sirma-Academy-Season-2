import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;

public class DEMO_02042023AES {

    private static final String SECRET_KEY = "mysecretkey12345"; // Replace with your own secret key

    public static void main(String[] args) throws Exception {
        String plainText = "Hello, world!"; // Replace with your own text

        byte[] cipherText = encrypt(plainText);
        System.out.println("Cipher text: " + new String(cipherText, StandardCharsets.UTF_8));

        String decryptedText = decrypt(cipherText);
        System.out.println("Decrypted text: " + decryptedText);
    }

    public static byte[] encrypt(String plainText) throws Exception {
        Key key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
    }

    public static String decrypt(byte[] cipherText) throws Exception {
        Key key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        //byte[] base64decodedTokenArr = Base64.decodeBase64(decodeStr.getBytes());
        //byte[] decryptedPassword = cipher.doFinal(base64decodedTokenArr);

        byte[] decryptedText = cipher.doFinal(cipherText);
        return new String(decryptedText, StandardCharsets.UTF_8);
    }
}
