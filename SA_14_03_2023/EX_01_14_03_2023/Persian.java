package EX_01_14_03_2023;

public class Persian extends Cat{
    public int age;
    public String name;

    public Persian(int age, String name) {
        super("Persian");
        this.age = age;
        this.name = name;

    }

    @Override
    public void show() {
        System.out.println("The cat "+this.name+" is a "+this.breed+", it is "+this.age+" years old.");
    }
}
