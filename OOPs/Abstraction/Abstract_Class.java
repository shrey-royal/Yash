abstract class IceCream {
    void makeIceCream() {
        System.out.println("IceCream is made");
    }

    abstract void flavour();    // abstract method
    
    void eat() {
        System.out.println("IceCream is eaten");
    }
}

class Vadilal extends IceCream {
    void flavour() {
        System.out.println("Vadilal IceCream is flavoured");
    }
}

class Amul extends IceCream {
    void flavour() {
        System.out.println("Amul IceCream is flavoured");
    }
}


public class Abstract_Class {
    public static void main(String[] args) {
        // IceCream i = new IceCream();    // Error
        // i.makeIceCream();
        // i.flavour();
        // i.eat();

        IceCream i = new Vadilal(); // Dynamic binding
        i.makeIceCream();
        i.flavour();
        i.eat();

        i = new Amul(); // reassigning the object
        i.makeIceCream();
        i.flavour();
        i.eat();
    }    
}
