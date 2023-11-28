import java.util.*;
class c{
    int a=0;
}

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(10);
        }
        System.out.println(list);
        ArrayList list1=new ArrayList();
        System.out.println(list1.size());
        list1.addAll(list);
        System.out.println(list1);
        System.out.println(list1.size());
        list1.clear();
        System.out.println(list1);
        ArrayList list2=new ArrayList();
        list2.ensureCapacity(80);
       // System.out.println(list2.get(76));
c c1=new c();
        System.out.println(c1);
        System.out.println(list2.isEmpty());
    list2.addAll(list);
        System.out.println(list2);
        System.out.println(list2);


        System.out.println(list2.isEmpty());
    }
}