import java.lang.reflect.*;

class Class1 {
    @CustomMethod
    public void method1(int param1) {

    }

    @CustomMethod
    public void method2(String param1) {

    }

    public void method3(int param1, String param2) {

    }
}

class Class2 {
    @CustomMethod
    public void method1(int param1) {

    }

    public void method4(double param1) {

    }

    @CustomMethod
    public void method3(int param1) {

    }
}

public class MainClass {
    public static void main(String[] args) {
        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();
        @SuppressWarnings("rawtypes")
        
        Class class1 = obj1.getClass();
        Class<?> class2 = obj2.getClass();
        Method[] methods1 = class1.getDeclaredMethods();
        Method[] methods2 = class2.getDeclaredMethods();
        for (Method method1 : methods1) {
            if (method1.isAnnotationPresent(CustomMethod.class)) {
                for (Method method2 : methods2) {
                    if (method2.isAnnotationPresent(CustomMethod.class) &&
                            method1.getName().equals(method2.getName()) &&
                            java.util.Arrays.equals(method1.getParameterTypes(), method2.getParameterTypes())) {
                        String className1 = method1.getDeclaringClass().getName();
                        String className2 = method2.getDeclaringClass().getName();
                        System.out.println("Common method found: " + method1.getName() +
                                " in classes " + className1 + " and " + className2);
                    }
                }
            }
        }
    }
}
