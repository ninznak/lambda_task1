public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.divide.apply(a, b);   // изначально не предусмотрена обработка исключения деления на ноль
            calc.println.accept(c);
        } catch (ArithmeticException e) {

            System.out.println("Деление на ноль!" + e.getMessage());

        }
        int abb = calc.abs.apply(-6);
        System.out.println(abb);
    }
}