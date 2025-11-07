public class ReverseNumber {

    ReverseNumber(int num)
    {
        int rem=0,rev=0;
        while(num>0)
        {

            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
      System.out.print("the reverse of the number "+num+" is "+ rev);
    }

    public static void main (String[] args)
    {
        ReverseNumber numb=new ReverseNumber(126);
    }
}
