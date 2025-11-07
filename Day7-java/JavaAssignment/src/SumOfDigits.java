public class SumOfDigits {

    public int sumofdig(int num) {
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits sm = new SumOfDigits();
        int ans = sm.sumofdig(126);
        System.out.print("The sum is " + ans);
    }
}
