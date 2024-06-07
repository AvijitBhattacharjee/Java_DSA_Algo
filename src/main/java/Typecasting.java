// Copyright (c) avijit bhattacharjee 2024
class A {
    public void show() {
        System.out.println("IN A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("IN B");
    }
}


public class Typecasting {
    public static void main(String[] args) {
        
        double d = 5.5;
        // this is type casting
        int i = (int) d;
        System.out.println(i);

        // type casting in class
        A a = (A) new B();
        a.show();
    }
}
