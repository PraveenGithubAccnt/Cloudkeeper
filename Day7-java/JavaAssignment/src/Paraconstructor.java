public class Paraconstructor {

    String name;
    int age;
    Paraconstructor(String name, int age)
    {
        System.out.print("The name of the Student is "+name+" and age is "+age);
    }
    public static void main(String[] args)
    {
        Paraconstructor stu=new Paraconstructor("Rakesh",18);
    }
}
