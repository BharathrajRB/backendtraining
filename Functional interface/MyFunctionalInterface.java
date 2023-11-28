@FunctionalInterface
public interface MyFunctionalInterface {
    void myMethod(); // Abstract method

    // You can have multiple default or static methods here
    default void myDefaultMethod() {
        System.out.println("Default method in functional interface");
    }

    static void myStaticMethod() {
        System.out.println("Static method in functional interface");
    }
}
// @FunctionalInterface
// interface MyFunctionalInterface2 extends MyFunctionalInterface {

// void myMethod2(); // Abstract method
// }