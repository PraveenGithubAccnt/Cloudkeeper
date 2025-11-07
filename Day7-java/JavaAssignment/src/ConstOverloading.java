public class ConstOverloading {
    String name;
    int age;
    int Roll_No;
    ConstOverloading(String name, int age)
    {
        System.out.println("Name of student is "+name+" age is "+age);
    }

    ConstOverloading(String name, int age, int Roll_No)
    {
        System.out.println("Name of student is "+name+" age is "+age+" Roll number is "+Roll_No);
    }
    public static void main(String[] args)
    {
        ConstOverloading obj1=new ConstOverloading("Peter",23);
        ConstOverloading obj2=new ConstOverloading("Poland",23,3);

    }
}
