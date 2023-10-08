package EX_02_21_03_2023;

public class Main {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food food1 = foodFactory.getFood("Dairy",5.40);
        Food food2 = foodFactory.getFood("Salami",8.40);
        Food food3 = foodFactory.getFood("Vegetable",1.40);

        food1.buy(18, 2);
        food1.prepare(6);
        food1.eat();

        food2.buy(50, 6);
        food2.prepare(3);
        food2.eat();

        food3.buy(1.4, 1);
        food3.prepare(1);
        food3.eat();



    }
}
