/*Animal Hierarchy
○ Description: Create a hierarchy where Animal is the superclass, and Dog, Cat,
and Bird are subclasses. Each subclass has a unique behavior.
○ Tasks:
■ Define a superclass Animal with attributes name and age, and a method
makeSound().
■ Define subclasses Dog, Cat, and Bird, each with a unique
implementation of makeSound().
○ Goal: Learn basic inheritance, method overriding, and polymorphism with simple
classes. */

class Animal{
    String name;
    int age;

    public Animal(String name,int age){
        this.name = name;
        this.age= age;

    }

    public void display(){
        System.out.println("Name "+name+" Age "+age);

    }
    public void makeSound(){
        System.out.println("Making sound");
    }
}
class Dog extends Animal{

       public Dog (String name,int age){
        super(name,age);
       } 
       
       @Override
       public void display(){
        System.out.println("Name "+name+" Age "+age);

       }
       @Override
       public void makeSound(){
        System.out.println("Barking sound");
    }
}
class Cat extends Animal{

       public Cat (String name,int age){
        super(name,age);
       } 
       
       @Override
       public void display(){
        System.out.println("Name "+name+" Age "+age);

       }
       @Override
       public void makeSound(){
        System.out.println("Mewwww");
    }
}
class Bird extends Animal{

       public Bird (String name,int age){
        super(name,age);
       } 
       
       @Override
       public void display(){
        System.out.println("Name "+name+" Age "+age);

       }
       @Override
       public void makeSound(){
        System.out.println("Crawling");
    }
    


}

public class AnimalHierarchy {
    public static void main(String args[]){
        Animal dog = new Dog("Tommy",12);
        Animal cat = new Cat("Shushi",6);
        Animal bird = new Bird("Parrot",3);

        dog.display();
        dog.makeSound();

        cat.display();
        cat.makeSound();

        bird.display();
        bird.makeSound();

    }
}
