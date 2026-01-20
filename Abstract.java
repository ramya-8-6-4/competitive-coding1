abstract class Animal
{
  abstract void eat();
}
class Dog extends Animal {  
    void eat() {  
        System.out.println("The dog eats food .");  
    }  
}

public class Abstract{  
    public static void main(String[] args) {  
        Dog d = new Dog();
        d.eat();
           
            }  
}

