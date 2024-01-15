// 2.
// a. Create and justify an inheritance hierarchy that could be used to represent the following classes:
// Animal, Mammal, Bird, Reptile, Dog, Eagle, Snake.
// (25 marks)
// b. Implement the above inheritance hierarchy using Java. Write the code for each class and include
// the necessary methods as described below:
// 1. Animal class:
// • Method: void eat() - prints "Animal is eating."
// Method: void sleep() - prints "Animal is sleeping."
// 2. Mammal class (inherits from Animal):
// Method: void giveBirth () - prints "Mammal is giving birth."
// 3. Bird class (inherits from Animal):
// •
// Method: void fly() - prints "Bird is flying."
// 4. Reptile class (inherits from Animal): a Programmine
// 5. Dog class (inherits from Mammal): • Method: void crawl) - prints " Reptile is crawling."
// 6. Eagle class (inherits from Bird):
// Method: void barkl) - Prints "Dog is barking."
// Method: void hunt) - prints "Eagle is hunting."
// 7. Snake class (inherits from Reptile):
// • Method: void poison() - prints "Snake is poisonous."
// Additionally, create a main method in a class named InheritanceHierarchy to demonstrate the
// behavior of the different animal types. Inside the main method:
// • Create an instance of the Doe class named muDog. Call the eat(), sleep(), giveBirth(), and bark()
// methods on myDog.
// • Create an instance of the Eagle class named myEagle. Call the eat(), sleep(), fly), and hunt)
// methods on myEagle.

class ESEQ2_Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class ESEQ2_Mammal extends ESEQ2_Animal {
    void giveBirth() {
        System.out.println("Mammal is giving birth.");
    }
}

class ESEQ2_Bird extends ESEQ2_Animal {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

class ESEQ2_Reptile extends ESEQ2_Animal {
    void crawl() {
        System.out.println("Reptile is crawling.");
    }
}

class ESEQ2_Dog extends ESEQ2_Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class ESEQ2_Eagle extends ESEQ2_Bird {
    void hunt() {
        System.out.println("Eagle is hunting.");
    }
}

class ESEQ2_Snake extends ESEQ2_Reptile {
    void poison() {
        System.out.println("Snake is poisonous.");
    }
}

class ESEQ2_AnimalMain {
    public static void main(String[] args) {
        ESEQ2_Dog myDog = new ESEQ2_Dog();
        myDog.eat();
        myDog.sleep();
        myDog.giveBirth();
        myDog.bark();

        ESEQ2_Eagle myEagle = new ESEQ2_Eagle();
        myEagle.eat();
        myEagle.sleep();
        myEagle.fly();
        myEagle.hunt();
    }
}
