package Crap;
class Parent {
    public Parent m1() {
        System.out.println("Parent class m1 method");
        return new Parent();    //it will return parent class object
    }
}

class Child extends Parent {
    @Override
    public Child m1() {
        System.out.println("Child class m1 method");
        return new Child();
    }
}

public class CovariantRT {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p + "\t-> " + p.m1());
        Child c = new Child();
        System.out.println(c  + "\t-> " + c.m1());
        Parent p1 = new Child();
        System.out.println(p1  + "\t-> " + p1.m1());
    }
}

/*
 *
 * Covariant return type is concept of java 5.0 version.
 * 
 * > If subclass overrides any method by using same signature and return type
 *  then it is called covariant return type.
 * 
 * > Covariant return type applicable only for object type but not for primitive
 * types.
 * 
 * > Covariant return type applicable only for non-static methods but not for
 * static methods.
 * 
 * > Covariant return type applicable only for overridden methods but not for
 * main method.
 * 
 * > Covariant return type applicable only for child class but not for parent
 * class.
 * 
 * > Covariant return type applicable only for return type but not for method
 * name and argument types.
 * 
 * > Covariant return type applicable only for method overriding but not for
 * method overloading.
 *  
 * 
 * Where covariant return type is required or used?
 * 
 * > Covariant return type is required to implement method overriding concept 
 *  in java.
 * 
 * 
 */
