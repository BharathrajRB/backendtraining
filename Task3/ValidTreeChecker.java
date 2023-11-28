import java.util.*;

public class ValidTreeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        ArrayList<Integer> nodeList = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                nodeList.add(Integer.parseInt("" + inputString.charAt(i)));
            }
        }

        boolean isValidTree = true;

        HashMap<Integer, Integer> parentCount = new HashMap<>();
        HashMap<Integer, List<Integer>> children = new HashMap<>();

        for (int i = 1; i < nodeList.size(); i += 2) {
            int parent = nodeList.get(i);

            parentCount.put(parent, parentCount.getOrDefault(parent, 0) + 1);

            if (parentCount.get(parent) > 2) {
                isValidTree = false;

                // Store children for invalid parent
                if (!children.containsKey(parent)) {
                    children.put(parent, new ArrayList<>());
                }
                children.get(parent).add(nodeList.get(i-1)); // Add child

                // Print parent and its children
                System.out.println("Parent: " + parent);
                System.out.println("Children: " + children.get(parent));
            }
        }

        System.out.println(isValidTree);
    }
}
