package EX_05_11_03_2023;

public class Apple extends Food{


    @Override
    public void show() {
        System.out.printf("%s is Sour.%n",this.getClass().getSimpleName());
    }
}
