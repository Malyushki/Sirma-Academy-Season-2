package EX_03_26_03_2023;

import java.io.Serializable;

public class Student implements Serializable {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
