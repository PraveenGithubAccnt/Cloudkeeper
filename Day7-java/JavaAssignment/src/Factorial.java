public class Factorial {

    Factorial(int num)
    {  int fact=1;
        for(int i=num; i>0;i--)
        {
            fact*=i;

        }
        System.out.println("The Factorial of number "+ num +" is " + fact);
    }

    public static void main(String[] args)
    {
          Factorial fac=new Factorial(5);
    }
}
