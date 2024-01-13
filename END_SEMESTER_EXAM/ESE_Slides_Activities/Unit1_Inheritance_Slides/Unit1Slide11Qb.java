
// b. Create a class called Animal with instance variables name and age, as well as methods to set and get the values of these variables. Then, create a subclass called Dog that adds additional instance variables breed and sound and methods to set and get their values.Create a Main class, create an object of Dog class and call all the methods

class Animal_ESE_Slides {
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
}

class Dog_ESE extends Animal_ESE_Slides {
    String breed;
    String sound;

    void setBreed(String breed) {
        this.breed = breed;
    }

    void setSound(String sound) {
        this.sound = sound;
    }

    String getBreed() {
        return breed;
    }

    String getSound() {
        return sound;
    }
}

class AnimalMain_ESE_Slides {
    public static void main(String[] args) {
        Dog_ESE dog = new Dog_ESE();

        dog.setName("Dog Name");
        dog.setAge(5);
        dog.setBreed("Dog Breed");
        dog.setSound("Woof");

        System.out.println("Dog");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Sound: " + dog.getSound());
    }
}
