package animal;

// import animal.Animal;

public class Mammal implements Animal {
	public void eat() {
		System.out.println("Mammal Eats");
	}

	public void travel() {
		System.out.println("Mammal Travel");
	}

	public int noOfLegs() {
		return 0;
	}

	public static void main(String args[]) {
		Mammal m = new Mammal();
		m.eat();
		m.travel();
	}
}

/*
Encapsulation: Encapsulation is the mechanism of hiding of data implementation by restricting access to public methods.

Tasks:

Problem 1: Library Management System
Create a library management system with two packages: 'library' and 'main'. The 'library' package should contain classes for books and users, with appropriate encapsulation of their attributes. The 'main' package should provide methods to borrow and return books while ensuring proper encapsulation.

**Problem Statement: Library Management System**

**Description:**

You are tasked with creating a library management system in Java. The system should be divided into two packages: `library` and `main`. The `library` package will contain classes that represent books and users of the library, with appropriate encapsulation of their attributes. The `main` package should provide methods to borrow and return books while ensuring proper encapsulation.

**Package Structure:**

1. `library` package:
   - `Book` class: Represents a book with attributes like title, author, ISBN, and availability. Use encapsulation to protect the book's attributes.
   - `User` class: Represents a user of the library with attributes like name, ID, and borrowed books. Encapsulate the user's attributes properly.

2. `main` package:
   - `LibrarySystem` class: Contains the main method. Simulate the library system by creating instances of books and users, and provide methods for borrowing and returning books. Ensure that the borrowing and returning processes modify the book availability and user's borrowed books list appropriately.

**Requirements:**

1. Define the `Book` class with encapsulated attributes (title, author, ISBN, availability).
2. Define the `User` class with encapsulated attributes (name, ID, borrowed books list).
3. Implement methods in the `LibrarySystem` class for:
   - Registering new users.
   - Adding new books to the library's collection.
   - Displaying available books.
   - Borrowing a book (updating user's borrowed books list and book availability).
   - Returning a book (updating user's borrowed books list and book availability).
   - Displaying a user's borrowed books.

**Constraints:**

- Ensure that attributes of the `Book` and `User` classes are private and accessible through appropriate getters and setters.
- Use meaningful method and variable names.
- Demonstrate the proper use of encapsulation to protect data integrity.

**Note:**

This problem assesses your ability to design and implement a library management system using encapsulation principles in Java. Make sure to follow best practices in terms of encapsulation, naming conventions, and organization of classes and packages.

----------------------------------------------------------------------------------------

Problem 2: Banking Application
Design a banking application with packages 'bank', 'account', and 'main'. The 'bank' package should contain a 'Bank' class with a list of accounts. The 'account' package should have classes representing different types of accounts, each with encapsulated account information. The 'main' package should simulate transactions between accounts.

Problem 3: Online Shopping System
Create an online shopping system with packages 'products', 'users', and 'main'. The 'products' package should contain classes for different products, each with encapsulated details. The 'users' package should have classes for customers and sellers, with proper encapsulation. The 'main' package should allow users to buy products and manage their accounts.

Problem 4: Employee Management System
Develop an employee management system with packages 'employee', 'department', and 'main'. The 'employee' package should include classes for different employee roles, each with encapsulated information. The 'department' package should contain classes representing different departments with encapsulated attributes. The 'main' package should allow for employee information management.

Problem 5: Online Exam Platform
Build an online exam platform with packages 'exams', 'students', and 'main'. The 'exams' package should have classes representing different exams, encapsulating details such as questions and answers. The 'students' package should include classes for students, each encapsulating their exam scores. The 'main' package should simulate exam-taking and score calculation.


*/