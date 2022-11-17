import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // BinaryOperator<Integer> devide = (x, y) -> x / y; // В данном месте выпадает исключение поскольку нельзя делить на ноль
    BinaryOperator<Integer> devide = (x, y) -> (y == 0) ? 0 : x / y; // В данной реализации добавлена проверка делителя на равенство с нулем в виде тренарного оператора
    /*{    // В этом месте я представил проверку в виде блока кода с сообщением
        int z = 0;
        if (y == 0) {
            System.out.println("Нельзя делить на ноль");
        } else {
            z = x / y;
        }
        return z;
    };*/
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;


}
