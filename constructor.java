// constructor

class Person {
    String name;
    int age;
    Person() {
        name = "Unknown";
        age = 0;
    }
    Person(String n, int a) {
        name = n;   // no 'this' keyword
        age = a;    // no 'this' keyword
    }

    void Person() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class ConstructorPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.Person();
        Person p2 = new Person("Ramya", 20);
        p2.Person();
    }
}
