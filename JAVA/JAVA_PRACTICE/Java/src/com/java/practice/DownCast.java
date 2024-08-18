// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Animal {
    void eat() {
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    void eat() {
        System.out.println("Dog eating.....");
    }
    void bark() {
        System.out.println("Barking.....");
    }
}

class Main{
    public static void main(String args[]) {
        Animal a = new Dog();// calls only inherited method
        Dog d = (Dog)a;
        
        a.eat();
        d.bark();
        a.bark();//compile time error
        
    }
}