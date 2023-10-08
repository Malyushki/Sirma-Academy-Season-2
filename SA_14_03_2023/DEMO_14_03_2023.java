class Animal14032023 {

    public String species;
    public String animal_class;
    public String test;

    public Animal14032023(String c, String s){
        this.species=s;
        this.animal_class=c;
    }

    public void show(){
        System.out.println("This animal is of class "+this.animal_class+" and it is a "+this.species);
    }
}

class Dog extends Animal14032023 {
    public String breed;
    public String test;

    public void set(String a, String b){
        this.test=a;
        super.test=b;
    }
    public void pr(){
        System.out.println(this.test);
        System.out.println(super.test);

    }

    public Dog(String b){
        super("mammal","dog");
        this.breed=b;
    }

    @Override
    public void show(){
        System.out.println("The dog is a "+this.animal_class+". This dog is a "+this.breed);
    }

    public void inh(){
        super.show();
    }
}
class JackRussel extends Dog{
    public int age;
    public String name;

    public JackRussel(int age, String name){
        super("jack russel");
        this.age=age;
        this.name=name;
    }

    /*@Override
  public void show(){
      System.out.println("The dog "+this.name+" is a "+this.breed+", it has "+this.age+" years");
}*/
}

class Terrier  extends Dog{
    public int age;
    public String name;

    public Terrier(int age, String name){
        super("terrier");
        this.age=age;
        this.name=name;
    }

    @Override
    public void show(){
        System.out.println("The dog "+this.name+" is a "+this.breed+", it has "+this.age+" years");

    }
}

class DEMO_14_03_2023 {
    public static void main(String[] args) {

        Animal14032023 a = new Animal14032023("mammal","dog");
        a.show();

        Dog d = new Dog("Bulldog");
        d.show();

        d.set("this","super");
        d.pr();
        d.inh();

        JackRussel j = new JackRussel(8, "Annie");
        j.show();
    }
}