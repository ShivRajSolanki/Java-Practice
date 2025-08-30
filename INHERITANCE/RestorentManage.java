/*: Restaurant Management System with Hybrid
Inheritance
○ Description: Model a restaurant system where Person is the superclass and
Chef and Waiter are subclasses. Both Chef and Waiter should implement a
Worker interface that requires a performDuties() method.
○ Tasks:
■ Define a superclass Person with attributes like name and id.
■ Create an interface Worker with a method performDuties().
■ Define subclasses Chef and Waiter that inherit from Person and
implement the Worker interface, each providing a unique implementation
of performDuties().
○ Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving
multiple behaviors to the same objects. */
class Person {
 protected String name;
 protected int id;

public Person(String name, int id) {
this.name = name;
this.id = id;
}

public void displayInfo() {
System.out.println("Name: " + name);
System.out.println("ID: " + id);
}
}
interface Worker {
void performDuties(); // Abstract method to be implemented by subclasses
}
// Subclass Chef
class Chef extends Person implements Worker {
private String specialty;
// Constructor
public Chef(String name, int id, String specialty) {
    super(name, id);
this.specialty = specialty;
}
// Implement performDuties() from Worker
@Override
public void performDuties() {
System.out.println("Duties: Preparing meals, specializing in " + specialty);
}

@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Specialty: " + specialty);
}
}

class Waiter extends Person implements Worker {

private String shift;
public Waiter(String name, int id, String shift) {
super(name, id);
this.shift = shift;
}
@Override
public void performDuties() {
System.out.println("Duties: Serving customers during the " + shift + "shift");
}
// Display additional Waiter-specific details
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Shift: " + shift);
}
}

public class RestorentManage {
    public static void main(String args[]){
        Worker chef = new Chef("rahul", 101, "Italian Cuisine");
Worker waiter = new Waiter("Bobby", 102, "Evening");
// Storing workers in an array
Worker[] workers = { chef, waiter };
// Displaying worker details and their duties


for (Worker worker : workers) {

System.out.println("Worker Details:");

if (worker instanceof Person) {
((Person) worker).displayInfo();
}
worker.performDuties();
System.out.println("-----------------------------------------------");
}
}
}

    

