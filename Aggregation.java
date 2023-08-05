/*
 * What is aggregation?
 * > Aggregation is a special form of association where objects are assembled or
 *  configured together to create a more complex object. 
 * 
 * > It is a relationship between two classes like association, however its a
 * directional association, which means it is strictly a one way association.
 * 
 */

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Aggregation {
    int id;
    String name;
    Address address;    // aggregation

    public Aggregation(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("GZB", "UP", "India");
        Address address2 = new Address("AMD", "GUJ", "India");

        Aggregation e = new Aggregation(111, "Varun", address1);
        Aggregation e2 = new Aggregation(112, "Arjun", address2);

        e.display();
        e2.display();
    }
}