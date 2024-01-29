class A {
    
    int age;
}

class B extends A {
    public B(int i){

    }
    String name;
}

public class Solution {
    public static void main(String[] args) {
        B b = new B(10);

        System.out.println(b.age);
        System.out.println(b.name);

    }
}

