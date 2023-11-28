package commonmethods;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.lang.Object;
// import org.apache.commons.io.IOUtils;
// import org.apache.commons.lang3.ClassPathUtils;

public class CommonMethodsFinder {

    public static void main(String[] args) {
        String packageName = "MYPACK";
        findCommonMethods(packageName);
    }

    private static void findCommonMethods(String packageName) {
        Map<String, List<String>> commonMethods = new HashMap<>();

        // Scan the classes in the package
        List<Class<?>> classes = getClasses(packageName);

        // Get all the methods in each class
        for (Class<?> clazz : classes) {
            for (Method method : clazz.getDeclaredMethods()) {
                String methodName = method.getName();
                List<String> parameterTypes = new ArrayList<>();

                for (Class<?> parameterType : method.getParameterTypes()) {
                    parameterTypes.add(parameterType.getName());
                }

                String parametersKey = String.join(",", parameterTypes);
                String classAndMethodKey = clazz.getName() + "." + methodName + "(" + parametersKey + ")";

                if (commonMethods.containsKey(classAndMethodKey)) {
                    commonMethods.get(classAndMethodKey).add(clazz.getName());
                } else {
                    List<String> classesList = new ArrayList<>();
                    classesList.add(clazz.getName());
                    commonMethods.put(classAndMethodKey, classesList);
                }
            }
        }

        // Print the common methods
        for (Map.Entry<String, List<String>> entry : commonMethods.entrySet()) {
            if (entry.getValue().size() > 1) {
                String[] splitKey = entry.getKey().split("\\.");
                String methodName = splitKey[1];
                String parametersKey = splitKey[2].substring(0, splitKey[2].length() - 1);

                System.out.println("Common Method: " + methodName);
                System.out.println("Common Parameters: " + parametersKey);
                System.out.println("Classes: " + String.join(", ", entry.getValue()));
                System.out.println();
            }
        }
    }

    private static List<Class<?>> getClasses(String packageName) {
        List<Class<?>> classes = new ArrayList<>();
        try {
            classes.addAll(
                    ClassPathUtils.from(ClassLoader.getSystemClassLoader()).getTopLevelClassesRecursive(packageName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classes;
    }
}