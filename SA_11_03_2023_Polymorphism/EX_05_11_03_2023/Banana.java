package EX_05_11_03_2023;

public class Banana extends Food{


    @Override
    public void show() {
        System.out.printf("%s is Sweet.%n",this.getClass().getSimpleName());
    }
}
