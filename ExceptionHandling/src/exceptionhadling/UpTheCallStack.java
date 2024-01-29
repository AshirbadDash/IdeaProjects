package exceptionhadling;

public class UpTheCallStack {
    public static void main(String[] args) {
        System.out.println("main-start");
        method1();
        System.out.println("main-stop");

    }

    static void method1() {
        System.out.println("method1-start");
        method2();
        System.out.println("method1-stop");

    }

    static void method2() {
        System.out.println("method2-start");
        try {

            method3();
        } catch (Exception e) {
            System.out.println("exception caught");
        }
        System.out.println("method2-stop");
    }

    static void method3() {
        System.out.println("method3-start");
//        try {
        System.out.println(3 / 0);

        //jvm is looking for mechanism for exception handler in parent method where method
        //call is present (equivalent method call)
        // if exception handler is not present in the method where exception got generated
        //up the call stack --->exception handling mechanism

//        } catch (exception e) {
//            System.out.println("User! avoid using 0 for denominator");
//        }
        System.out.println("method3-stop");

    }
}
