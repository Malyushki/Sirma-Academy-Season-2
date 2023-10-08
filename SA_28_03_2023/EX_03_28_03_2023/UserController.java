package EX_03_28_03_2023;

import javax.swing.text.View;

public class UserController {
    private User user;
    private UserView view;

    public UserController(User user, UserView view) {
        this.user = user;
        this.view = view;
    }

    void updateUserInfo(String name, int age, String email, String address) {
        this.user.updateInfo(name, age, email, address);

    }

    void printUserInfo() {

        view.printUserInfo(this.user.getName(), this.user.getAge(), this.user.getEmail(), this.user.getAddress());
    }
}
