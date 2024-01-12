// 4. Create a class called Vehicle with variables brand and model, as well as
// methods to set and get the values of these variables. Then, create a subclass called Car that adds
// an additional variable numDoors and methods to set and get its value. Define another class that
// hosts the main method. Inside the main method: Create two instances/objects of the Car
// class. Call the set and get methods using the instance/objects created to display their
// functionality.

class Vehicle {
    String brand;
    String model;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

class Car extends Vehicle {
    int numDoors;

    void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
}

class VehicleMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setBrand("Toyota");
        car1.setModel("Corolla");
        car1.setNumDoors(4);

        car2.setBrand("Honda");
        car2.setModel("Civic");
        car2.setNumDoors(4);

        System.out.println("Car 1: " + car1.getBrand() + " " + car1.getModel() + " " + car1.getNumDoors());
        System.out.println("Car 2: " + car2.getBrand() + " " + car2.getModel() + " " + car2.getNumDoors());
    }
}