package EX_03_28_03_2023;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Pako", 30, "mail@google.com", "Svilengrag");
        User user2 = new User("Stefan", 40, "priStefan@abv.bg", "Sofia");
        UserView userView = new UserView();


        UserController uc1 = new UserController(user1,userView);
        UserController uc2 = new UserController(user2,userView);

        uc1.printUserInfo();
        uc2.printUserInfo();

        uc1.updateUserInfo("Pako", 31, "mail@google.com", "Svilengrad");
        uc2.updateUserInfo("Stefan", 41, "priStefan@abv.bg", "Varna");

        uc1.printUserInfo();
        uc2.printUserInfo();

    }
}
