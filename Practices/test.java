import java.lang.reflect.Modifier;

public class test {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("employee");
        System.out.println("name" + c.getName());
        System.out.println("Super " + c.getSuperclass().getName());
        Class[] x = c.getInterfaces();
        System.out.println("Interfaces list :");
        for (Class x1 : x) {
            System.out.println(x1.getName());
        }
        int i = c.getModifiers();
        System.out.println("modifiers: " + Modifier.toString(i));
    }
}
