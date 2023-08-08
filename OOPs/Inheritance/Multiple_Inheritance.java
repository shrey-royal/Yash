interface Parent {
    void fun();
}

class BigBrother {
    void funwbb() {
        System.out.println("Child class fun method");
    }
}

class Child extends BigBrother implements Parent {
    @Override
    public void fun() {
        System.out.println("Child class fun method");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.fun();
        c.funwbb();
    }
}
