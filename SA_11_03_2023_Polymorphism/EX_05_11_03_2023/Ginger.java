package EX_05_11_03_2023;

public class Ginger extends Food{


    @Override
    public void show() {
        System.out.printf("%s is Spicy.%n",this.getClass().getSimpleName());
    }
}
