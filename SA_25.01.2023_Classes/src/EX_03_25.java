package src;

import java.util.Scanner;
 class EmployeeEX_03_25{
String fName;
String lName;
int age;
String position;

public void  printEmployee(){
    if (age<0){
        System.out.println("ERROR! Enter higher age!");
        return;
    }
    System.out.printf("Name: %s %s%n",this.fName,this.lName);
    System.out.printf("Age: %d%n",this.age);
    System.out.printf("Position: %s%n",this.position);

}


}
public class EX_03_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeEX_03_25 employee1 = new EmployeeEX_03_25();
        System.out.print("Enter first name: ");
        employee1.fName=scanner.nextLine();
        System.out.print("Enter last name: ");
        employee1.lName=scanner.nextLine();
        System.out.print("Enter age: ");
        employee1.age= Integer.parseInt(scanner.nextLine());
        System.out.print("Enter position: ");
        employee1.position=scanner.nextLine();
        employee1.printEmployee();
    }
}
