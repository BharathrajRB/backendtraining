
import java.lang.reflect.Method;

public class MainClass {
    public static void main(String[] args) {
        Class<?>[] classes = { CommonMethods.class, ClassA.class, ClassB.class, ClassC.class, ClassD.class };

        for (Class<?> clazz : classes) {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().startsWith("commonMethod")) {
                    System.out.println(clazz.getSimpleName() + " - " + method.getName());
                }
            } 
        }
    }
}
