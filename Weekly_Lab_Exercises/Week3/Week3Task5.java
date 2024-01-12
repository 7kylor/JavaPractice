// 5. Create a class called Animal with instance variables name and age, as well
// as methods to set and get the values of these variables. Then, create a subclass called Dog that
// adds additional instance variables breed and sound and methods to set and get their values.
// Define another class that hosts the main method. Inside the main method: Create a instance/object
// of the Dog class. Call the set and get methods using the instance/object created to display their functionality.

class Animal {
    String name;
    int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }
}

class Dog extends Animal {
    String breed;
    String sound;

    void setBreed(String breed) {
        this.breed = breed;
    }

    void setSound(String sound) {
        this.sound = sound;
    }

    public String getBreed() {
        return breed;
    }

    public String getSound() {
        return sound;
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Dog");
        dog.setAge(5);
        dog.setBreed("Labrador");
        dog.setSound("Woof");

        System.out.println("Dog: " + dog.getName() + " " + dog.getAge() + " " + dog.getBreed() + " " + dog.getSound());
    }
}
