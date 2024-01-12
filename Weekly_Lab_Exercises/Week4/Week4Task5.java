// Write a JAVA program to implement Run-Time Polymorphism (Dynamic Binding or Late Binding) 
// through Method Overriding. First create a class called Animal with instance variables name and 
// age, as well as methods to set and get the values of these variables. One more method sound() 
// to  print  the  message  "Animal  makes  a  sound".  Then,  create  first  subclass  called  Dog  that  adds  
// additional  instance  variables  breed  and  methods  to  set  and  get  its  values.  One  more  method 
// sound()  to  print  the  message  "Dog  barks"  .  Then,  create  second  subclass  called  Cat  that  adds  
// additional instance variables breed and methods to set and get their values. One more method 
// sound() to print the message " Cat meows"".  Define another class that hosts the main method. 
// Inside the main method:  Create  an object of the Animal class instance. Call the methods of Dog 
// and cat class by assigning their objects to animal class. Call the set and get and sound() methods 
// using the instance/object created to display their functionality.

class Animal {
    String name;
    int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    String breed;

    void setBreed(String breed) {
        this.breed = breed;
    }

    String getBreed() {
        return breed;
    }

    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    String breed;

    void setBreed(String breed) {
        this.breed = breed;
    }

    String getBreed() {
        return breed;
    }

    void sound() {
        System.out.println("Cat meows.");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.setName("Taher");
        animal.setAge(20);
        animal.sound();
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());

        dog.setName("Taher");
        dog.setAge(20);
        dog.setBreed("Pug");
        dog.sound();
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());

        cat.setName("Taher");
        cat.setAge(20);
        cat.setBreed("Persian");
        cat.sound();
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Breed: " + cat.getBreed());
    }
}
