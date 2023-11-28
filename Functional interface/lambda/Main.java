package lambda;

public class Main {
    // int calculate(int x, int y) {
    // int d = x + y;
    // return d;
    // }

    public static void main(String[] args) {

        // Lambda expression for addition
        Calculator addition = (a, b) -> a + b;

        int result = addition.calculate(5, 3);
        System.out.println("Addition Result: " + result);

        // Lambda expression for subtraction
        Calculator subtraction = (a, b) -> a - b;

        result = subtraction.calculate(10, 4);
        System.out.println("Subtraction Result: " + result);
        // for multiplication
        Calculator mul = (a, b) -> a * b;

        result = mul.calculate(10, 10);
        System.out.println("Multiplication Result: " + result);

        Calculator div = (a, b) -> a / b;
        int div1 = div.calculate(20, 2);
        System.out.println("Division Result: " + div1);
        cal add1 = (a, b) -> A + b;

    }
}
