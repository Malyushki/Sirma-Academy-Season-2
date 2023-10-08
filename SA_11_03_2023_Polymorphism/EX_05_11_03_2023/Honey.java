package EX_05_11_03_2023;

public class Honey extends Food{


    @Override
    public void show() {
        System.out.printf("%s is Sweet.%n",this.getClass().getSimpleName());
    }
}
