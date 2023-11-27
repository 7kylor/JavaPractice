// 6. Write the code for each class and include the necessary methods as
// described below:
// Animal class: Method: void eat() - prints "Animal is eating." ,Method: void
// sleep() - prints
// "Animal is sleeping."Mammal class (inherits from Animal): Method: void
// giveBirth() - prints "Mammal is giving birth."
// Bird class (inherits from Animal): Method: void fly() - prints "Bird is
// flying."
// Reptile class (inherits from Animal): Method: void crawl() - prints "Reptile
// is crawling."
// Dog class (inherits from Mammal): Method: void bark() - prints "Dog is
// barking."
// Eagle class (inherits from Bird): Method: void hunt() - prints "Eagle is
// hunting."
// Snake class (inherits from Reptile): Method: void poison() - prints "Snake is
// poisonous."
// Additionally, create a main method in a class named InheritanceHierarchy to
// demonstrate the
// behavior of the different animal types.

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Mammal is giving birth.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

class Reptile extends Animal {
    void crawl() {
        System.out.println("Reptile is crawling.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Eagle extends Bird {
    void hunt() {
        System.out.println("Eagle is hunting.");
    }
}

class Snake extends Reptile {
    void poison() {
        System.out.println("Snake is poisonous.");
    }
}

class InheritanceHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.giveBirth();
        dog.bark();

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.sleep();
        eagle.fly();
        eagle.hunt();

        Snake snake = new Snake();
        snake.eat();
        snake.sleep();
        snake.crawl();
        snake.poison();
    }
}