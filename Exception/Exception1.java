
public class Exception1 {

    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
    }

    void isSleeping(int time) throws IllegalArgumentException {
        if (time < 0 || time > 24) {
            throw new IllegalArgumentException("Invalid time.");
        }
    }

    public static void main(String[] args) {
        String []cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota"};
        
        Exception1 myObj = new Exception1();
        /*
        try {
            System.out.println(cars[2]);
            myObj.checkAge(13);
            myObj.isSleeping(25);
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        } catch(ArithmeticException e) {
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You are accessing an array index that does not exist.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        */

        // Exception1 myObj = new Exception1();
        // try {
        //     myObj.checkAge(13);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }


        try {
            System.out.println(cars[2]);
            myObj.checkAge(13);
            myObj.isSleeping(25);
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}