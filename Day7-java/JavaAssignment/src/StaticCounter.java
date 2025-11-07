public class StaticCounter {

    static int count;
    StaticCounter()
    {
        count++;

    }

    public static void main(String [] args)
    {
        StaticCounter obj1=new StaticCounter();
        StaticCounter obj2=new StaticCounter();
        StaticCounter obj3=new StaticCounter();
        System.out.print("Object created = " + StaticCounter.count);
    }
}
