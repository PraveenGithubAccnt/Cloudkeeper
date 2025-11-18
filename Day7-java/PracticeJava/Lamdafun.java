
// BiFunction<T,U ,R > Lamda exp;
// T → Type of first argument
// U → Type of second argument
// R → Return type


import java.util.function.BiFunction;
public class Lamdafun {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> div = (a, b) -> a / b;

        System.out.println(add.apply(4, 6));
        System.out.println(mul.apply(6, 6));
        System.out.println(div.apply(12, 6));
    }
}


