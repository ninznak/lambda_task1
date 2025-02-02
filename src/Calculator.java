import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (a, b) -> a + b;
    BinaryOperator<Integer> minus = (a, b) -> a - b;
    BinaryOperator<Integer> multiple = (a, b) -> a * b;
    BinaryOperator<Integer> divide = (a, b) -> a / b;

    UnaryOperator<Integer> pow = (a) -> a * a;
    UnaryOperator<Integer> sqrt = (a) -> (int) Math.sqrt(a);
    UnaryOperator<Integer> abs = (a) -> a > 0 ? a : -a;

    Predicate<Integer> isPositiveEven = (a) -> a > 0;
    Consumer<Integer> println = System.out::println;


}
