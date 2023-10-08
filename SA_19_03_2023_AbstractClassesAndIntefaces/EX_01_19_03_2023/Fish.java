package EX_01_19_03_2023;

public class Fish extends Animal implements Pet {


    public Fish() {
        super(0);

    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish food..nom nom");
    }

    @Override
    public String getName() {
        return "Random Fish";
    }

    @Override
    public void walk() {
      swim();
    }
    private void swim(){
        System.out.println("I am Just Fish I am swimming not walking");
    }

    @Override
    public void setName(String name) {
        System.out.println("I am fish, Just Fish");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
