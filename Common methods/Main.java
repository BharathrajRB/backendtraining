import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Class1 {
    public void method1(float a) {
    }

    public void method2(float c) {
    }

    public void method3() {
    }
}

class Class2 {
    public void method1(float a) {
    }

    public void method4(double d) {
    }
}

class Class3 {
    public void method1(float a) {
    }

    public void method5(boolean flag) {
    }
}

public class Main {
    public static void main(String[] args) {
        Map<String, Method> commonMethods = new HashMap<>();

        Class<?>[] classes = { Class1.class, Class2.class, Class3.class };
//float.class;
        for (Class<?> clazz : classes) {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                // if (method.getName().equals("method1") &&
                //         Arrays.equals(method.getParameterTypes(), new Class<?>[] { Float.class })) {
                    String methodSignature = method.getName() + Arrays.toString(method.getParameterTypes());
                    if (commonMethods.containsKey(methodSignature)) {
                        System.out.println("Common method: " + method.getName() +
                                " with parameters: (float) in class: " + clazz.getSimpleName());
                    } else {
                        commonMethods.put(methodSignature, method);
                    }
                // }
            }
        }
    }
}