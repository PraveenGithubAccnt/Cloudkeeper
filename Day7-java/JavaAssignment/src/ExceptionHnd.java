import java.util.Scanner;
public class ExceptionHnd {

    public double Division(int num1, int num2) {
        double result = 0;
        try {
            result = num1 / num2;
        } catch (Exception e) {
            System.out.println("Error during division: " + e.getMessage());
        } finally {
            System.out.println("Division completed");
        }
        return result;
    }


    int[] arr = new int[5];

    public void nastedExp() {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Outer try");

            try {
                System.out.println("Inner try");
                int result = 10 / 0;
            } catch (ArithmeticException ae) {
                System.out.println("Caught inner ArithmeticException: " + ae);
            }

            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Enter a number " + i + ":");
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Caught outer ArrayIndexOutOfBoundsException: " + e);
        }
    }


    void m3() {
        try {
            int result = 5 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("m3 caught exception: " + ae);
            throw ae;
        }
    }

    void m2() {
        try {
            m3();
        } catch (ArithmeticException ae) {
            System.out.println("m2 caught and rethrowing");
            throw ae;
        }
    }

    void m1() {
        try {
            m2();
        } catch (ArithmeticException ae) {
            System.out.println("m1 finally caught: " + ae);
        }
    }

    public String Emailvalid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email:");
        String mail = sc.nextLine();

        try {
            if (!mail.contains("@") || !mail.contains(".")) {
                throw new Exception("Invalid Email, provide proper Email-id");
            } else {
                System.out.println("Email is valid");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return mail;
    }




    public void Propagation() {
        m1();
        Emailvalid();
    }


    public static void main() {
        ExceptionHnd div = new ExceptionHnd();
        double output = div.Division(6, 3);
        System.out.println("output is " + output);

        div.nastedExp();
        div.Propagation();
    }
}