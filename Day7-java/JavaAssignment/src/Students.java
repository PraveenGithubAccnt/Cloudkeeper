import java.util.Scanner;

public class Students {
    String name;
    int marks=0;

    Students(String name)
    {
        this.name=name;
    }


    public void CalculateAvg()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=3; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks+= sc.nextInt();

        }
        System.out.print("The Average marks of student "+name+" is "+ marks/3);
    }

    public static void main(String[] args)
    {
        Students st1=new Students("Rahul");
        st1.CalculateAvg();
    }
}
