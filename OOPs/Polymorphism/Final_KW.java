class A {
    final int a = 10;
    final void show(){
        System.out.println("A");
    }

    static final void show1(){
        System.out.println("A");
    }
}

// class B extends A {
//     @Override
//     void show(){
//         System.out.println("B");
//     }
// }


final class C {
    void show(){
        System.out.println("C");
    }
}

// class D extends C {
    
// }

// abstract interface InnerFinal_KW {
//     void show();
// }


public class Final_KW {
    public static void main(String[] args) {
        A obj = new A();

        // obj.a = 20; // Error: cannot assign a value to final variable a
        
        System.out.println(obj.a);
        obj.show();

        C obj1 = new C();
        obj1.show();
    }
}
