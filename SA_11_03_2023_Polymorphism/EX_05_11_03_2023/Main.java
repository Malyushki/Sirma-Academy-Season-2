package EX_05_11_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Apple());
        foodList.add(new Banana());
        foodList.add(new Chili());
        foodList.add(new Chocolate());
        foodList.add(new Cinnamon());
        foodList.add(new Ginger());
        foodList.add(new Honey());
        foodList.add(new Tomato());
        foodList.add(new Vinegar());
        foodList.add(new Lemon());

        int count = 1;
        for (Food f: foodList) {
            System.out.print(count+". ");
            f.show();
            count++;
        }
    }
}
