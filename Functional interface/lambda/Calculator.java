package lambda;

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
    // default void
}

interface cal extends Calculator {
    // int calculate(int a, int b ,int c);
    int cal1(int a, int b);

}