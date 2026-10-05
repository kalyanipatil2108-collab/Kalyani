class Calculator {

    // Function Overloading

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Return current object
    Student getStudent() {
        return this;
    }
}

public class FunctionDemo {

    public static void main(String[] args) {

        // Function Overloading
        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(5, 10));

        System.out.println("Add three integers: " + calc.add(5, 10, 15));

        System.out.println("Add two doubles: " + calc.add(5.5, 4.5));

        // Constructor Demonstration
        Student s1 = new Student();

        Student s2 = new Student("Kalyani", 51);

        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();

        // Returning current object using this
        Student s4 = s2.getStudent();

        System.out.println("Student s4 details (reference to s2):");

        s4.display();
    }
}



Output :

Add two integers: 15
Add three integers: 30
Add two doubles: 10.0
Name: Unknown, Age: 0
Name: Kalyani, Age: 51
Name: Kalyani, Age: 51
Student s4 details (reference to s2):
Name: Kalyani, Age: 51
