/*
Inner Classes:

> A class defined within another class is called inner class. 
> Inner classes are used to logically group classes and interfaces in one place so that it can be more readable and maintainable.
> Additionally, it can access all the members of outer class including private data members and methods.

Advantage of Inner class:
> It is a way of logically grouping classes that are only used in one place.
> It increases encapsulation.
> It can access all the members of outer class including private data members and methods.
> It can be used to develop more readable and maintainable code.


Types of Inner class:

1. Member inner class
2. Anonymous inner class
3. Local inner class
4. Static inner class
5. Nested inner class

*/


// Nested Inner Class
/*
class OuterClass {
    private int x = 10;

    class InnerClass {
        int y = 5;

        public void myInnerMethod() {
            System.out.println("x = " + x + " y = " + y);
        }
    }

    class InnerClass1 {
        int z = 15;

        public void myInnerMethod1() {
            System.out.println("x = " + x + " z = " + z);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.InnerClass1 myInner1 = myOuter.new InnerClass1();
        
        myInner.myInnerMethod();
        myInner1.myInnerMethod1();
    }
}
*/

// Static Inner Class
/*
class OuterClass {
    static int x = 10;

    static class InnerClass {
        int y = 5;

        public void myInnerMethod() {
            System.out.println("x = " + x + " y = " + y);
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        myInner.myInnerMethod();
    }
}
*/

// Local Inner Class
/*
class OuterClass {
    int x = 10;

    void myOuterMethod() {
        int y = 5;

        class MyInnerClass {
            public void myInnerMethod() {
                System.out.println("x = " + x + " y = " + y);
            }
        }

        MyInnerClass myInner = new MyInnerClass();
        myInner.myInnerMethod();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        myOuter.myOuterMethod();
    }
}
*/

// Anonymous Inner Class
/*
class MyOuterClass {
    interface MyInterface {
        void display();
    }

    public void myOuterMethod() {
        MyInterface myInterface = new MyInterface() {
            public void display() {
                System.out.println("Anonymous Inner Class");
            }
        };
        myInterface.display();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        MyOuterClass myOuter = new MyOuterClass();
        myOuter.myOuterMethod();
    }
}
*/
/*
// Member Inner Class
class MyOuterClass {
    private int x = 10;

    class MyInnerClass {
        public void display() {
            System.out.println("Member Inner Class");
        }
    }

    public void myOuterMethod() {
        MyInnerClass myInner = new MyInnerClass();
        myInner.display();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        MyOuterClass myOuter = new MyOuterClass();
        myOuter.myOuterMethod();
    }
}
*/

// Nested Interface

interface OuterInterface {
    void display();

    interface InnerInterface {
        void display1();
    }

    class MyInnerClass implements InnerInterface {
        public void display1() {
            System.out.println("Nested Interface");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterInterface.MyInnerClass myInner = new OuterInterface.MyInnerClass();
        myInner.display1();
    }
}

/*

Problem Statement 1: Online Shopping System
You are tasked with implementing an online shopping system. Create an `Order` class that contains an inner class `CartItem` representing items in the user's shopping cart. The `CartItem` class should have nested interfaces `Discountable` and `Taxable` to calculate discounts and taxes for different types of products.

Problem Statement 2: School Management System
Develop a School Management System with a `Student` class. Inside the `Student` class, define an inner class `Course` to represent the courses that a student is enrolled in. Additionally, create a nested interface `Grades` to calculate and store the student's grades for each course.

Problem Statement 3: Social Media Platform
Build a Social Media Platform with a `User` class. Create an inner class `Post` within the `User` class to represent user posts. Implement a nested interface `Likeable` to manage likes on posts and a nested interface `Commentable` to handle comments on posts.

Problem Statement 4: Music Streaming Service
Design a Music Streaming Service with a `Playlist` class. Inside the `Playlist` class, define an inner class `Song` to represent individual songs. Implement a nested interface `Playable` for managing play and pause functionality for songs and a nested interface `Downloadable` for enabling song downloads.

Problem Statement 5: Hotel Reservation System
Develop a Hotel Reservation System with a `Room` class. Create an inner class `Booking` within the `Room` class to represent bookings for a specific room. Define a nested interface `Pricing` to calculate the cost of different booking options (e.g., daily rate, weekly rate) and another nested interface `Cancellation` to handle cancellation policies.

*/