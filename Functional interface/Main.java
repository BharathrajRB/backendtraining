public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface functionalInterface = () -> {
            System.out.println("Lambda expression implementation of myMethod");
        };

        functionalInterface.myMethod(); // Output: Lambda expression implementation of myMethod
        functionalInterface.myDefaultMethod(); // Output: Default method in functional interface
        MyFunctionalInterface.myStaticMethod(); // Output: Static method in functional interface
    }
}
