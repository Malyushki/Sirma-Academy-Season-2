package EX_01_02_04_2023;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        User user  = new User("Pako", "Parolaewadasweda");
        user.saveUser();

        user.validateUser("Pako","Parolaewadasweda");


        user.validateUser("Pako","Parolaewadasweda");
    }
}
