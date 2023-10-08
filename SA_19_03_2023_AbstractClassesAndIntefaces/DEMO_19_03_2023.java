
abstract class EmployeeDEMO19_03_2023 {

    public String name;
    public String address;
    public int number;

    public EmployeeDEMO19_03_2023(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }

    public abstract void print();

}

class Salary extends EmployeeDEMO19_03_2023 {
    private double salary;   // Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.address);
    }
}
class DEMO_19_03_2023 {
    public static void main(String[] args) {

        Salary s = new Salary("Ivan Ivanov", "tintyava 20", 3, 1600.00);

        s.mailCheck();
        s.print();

    }
}