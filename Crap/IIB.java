package Crap;
public class IIB {
    int i;
    {
        i = 10;
        System.out.println("IIB");
    }
    IIB() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        IIB i1 = new IIB();
        IIB i2 = new IIB();
    }
}

/*
 * Instance Initialization Block (IIB):
 * 
 * > IIB is used to initialize instance variables.
 * > IIB is executed when object is created.
 * > IIB is executed every time when object is created.
 * > IIB is executed before constructor.
 * 
 * 
 * 
 * 
 */
