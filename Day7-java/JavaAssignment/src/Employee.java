import java.util.*;
class EmPojo{

    private int id;
    private String name;
    private double salary;

    EmPojo(int id, String name, double salary)
    {
       this.id=id;
       this.name=name;
       this.salary=salary;
    }

    public void setId(int id)
    {

        this.id=id;
    }

    public void setName(String name)
    {

        this.name=name;
    }

    public void setSalary(double salary)
    {

        this.salary=salary;
    }

    public int getId()
    {

        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {

        return salary;
    }
    public void calculateSalary()
    {

        System.out.println("Base Salary: " + salary);
    }
}


class FulltimeEmployee extends EmPojo
{   public double baseSalary=8000;
    FulltimeEmployee(int id, String name, double salary) {

        super(id, name, salary);   // calling parent constructor
    }
    @Override
    public void calculateSalary()
    {    System.out.println("About Fulltime Employee Details");
         System.out.println("The ID of the employee is "+getId()+"\nName is "+getName());
         System.out.println("Full time Employee Salary is "+(baseSalary+getSalary()));
    }
}

class PartTimeEmployee extends EmPojo
{
    PartTimeEmployee(int id, String name, double salary) {

        super(id, name, salary);   // calling parent constructor
    }
    @Override
    public void calculateSalary()
    {   System.out.println("About PartTime Employee Details");
        System.out.println("The ID of the employee is "+getId()+"\nName is "+getName());
        System.out.println("Full time Employee Salary is "+getSalary());
    }
}

public class Employee {
    public static void main(String[] args) {

        FulltimeEmployee full = new FulltimeEmployee(1031, "Palash", 53342);
        full.calculateSalary();

        PartTimeEmployee part = new PartTimeEmployee(1032, "Holand", 34256);
        part.calculateSalary();
    }
}

