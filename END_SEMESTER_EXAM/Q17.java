
// 17.	Create and justify an inheritance hierarchy that could be used to represent the following classes: Animal, Mammal, Bird, Reptile, Dog, Eagle, Snake.
//  Implement the above inheritance hierarchy using Java. Write the code for each class and include the necessary methods as described below:
// 1.	Animal class:
// •	Method: void move() - prints "Animal is moving."
// •	Method: void () - prints "Animal is sleeping."
// 2.	Amphibian class:
// •	Method: void habitat() – prints “ lives in land and in water”
// 3.	Mammal class :
// •	Method: void giveBirth() - prints "Mammal is giving birth."
// 4.	Bird class :
// •	Method: void layeggs() - prints "Birds lay eggs."
// 5.	Reptile class 
// •	Method: void crawl() - prints "Reptile is crawling."
// 6.	Dog class 
// •	Method: void  petanimal() - prints "Dog is a good pet animal."
// 7.	Eagle class (inherits from Bird):
// •	Method: void fly() - prints "Eagle flies very high."
// 8.	Snake class (inherits from Reptile):
// •	Method: void bite() - prints "Snake  bite is dangerous."

// Additionally, create a main method in a Main class  to demonstrate the behavior of the different animal types. Inside the main method . Create an instance of the Dog class  And Create an instance of the snake class. Call the methods of these two classes using the objects created.

class Animal_ESE {
    void move() {
        System.out.println("Animal is moving.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Amphibian_ESE extends Animal_ESE {
    void habitat() {
        System.out.println("Lives in land and in water");
    }
}

class Mammal_ESE extends Animal_ESE {
    void giveBirth() {
        System.out.println("Mammal is giving birth.");
    }
}

class Bird_ESE extends Animal_ESE {
    void layEggs() {
        System.out.println("Birds lay eggs.");
    }
}

class Reptile_ESE extends Animal_ESE {
    void crawl() {
        System.out.println("Reptile is crawling.");
    }
}

class Dog_ESE extends Mammal_ESE {
    void petAnimal() {
        System.out.println("Dog is a good pet animal.");
    }
}

class Eagle_ESE extends Bird_ESE {
    void fly() {
        System.out.println("Eagle flies very high.");
    }
}

class Snake_ESE extends Reptile_ESE {
    void bite() {
        System.out.println("Snake bite is dangerous.");
    }
}

class Main_ESE {
    public static void main(String[] args) {
        Dog_ESE dog = new Dog_ESE();
        Snake_ESE snake = new Snake_ESE();
        dog.move();
        dog.sleep();
        dog.giveBirth();
        dog.petAnimal();
        snake.move();
        snake.sleep();
        snake.crawl();
        snake.bite();
    }
}
