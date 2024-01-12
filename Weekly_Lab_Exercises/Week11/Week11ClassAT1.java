
class Animal {
    String name;
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    String breed, sound;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSound(String sound) {
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
        dog.setName("Test");
        dog.setAge(5);
        dog.setBreed("Test");
        dog.setSound("Test");

        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Sound: " + dog.getSound());
    }
}