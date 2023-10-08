package EX_01_14_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
       catList.add(new Bengal(3, "Lucky"));
       catList.add(new Persian(4, "Pointy"));
       catList.add(new Siamese(1, "Charm"));

        for (Cat cat:catList) {
            cat.show();
        }



    }


}
