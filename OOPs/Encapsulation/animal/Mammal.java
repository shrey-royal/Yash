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

Problem 2: Banking Application
Design a banking application with packages 'bank', 'account', and 'main'. The 'bank' package should contain a 'Bank' class with a list of accounts. The 'account' package should have classes representing different types of accounts, each with encapsulated account information. The 'main' package should simulate transactions between accounts.

Problem 3: Online Shopping System
Create an online shopping system with packages 'products', 'users', and 'main'. The 'products' package should contain classes for different products, each with encapsulated details. The 'users' package should have classes for customers and sellers, with proper encapsulation. The 'main' package should allow users to buy products and manage their accounts.

Problem 4: Employee Management System
Develop an employee management system with packages 'employee', 'department', and 'main'. The 'employee' package should include classes for different employee roles, each with encapsulated information. The 'department' package should contain classes representing different departments with encapsulated attributes. The 'main' package should allow for employee information management.

Problem 5: Online Exam Platform
Build an online exam platform with packages 'exams', 'students', and 'main'. The 'exams' package should have classes representing different exams, encapsulating details such as questions and answers. The 'students' package should include classes for students, each encapsulating their exam scores. The 'main' package should simulate exam-taking and score calculation.


*/