// // the class cannot be private 
// /**
//  * reflex
//  */
// public class reflex {

//     private class Innerreflex {
//         public void intp() {
//             System.out.println("hi hrllo");

//         }

//     }

//     public static void main(String[] args) {
//         reflex.Innerreflex on = new reflex().new Innerreflex();
//         on.intp();
//     }
// }
import java.lang.Exception;

class A {
    A(int a) {
        System.out.println("parametized constructor");
    }
}

/**
 * reflex
 */
public class reflex {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("A");
        A a = (A) c.newInstance();
    }
}