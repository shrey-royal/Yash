class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}


public class Upcasting_DownCasting {
    public static void main(String[] args) {
        // Animal a = new Animal();    // Static binding
        // Upcasting
        Animal a = new Dog();   //dynamic binding
        a.eat();
        // a.bark(); // Error

        // Downcasting
        Dog d = (Dog) a;
        d.bark();
    }
}