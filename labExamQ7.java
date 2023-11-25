// Q7 : Create a class called Vehicle with variables brand and model, as well as
// methods to set and get the values of these variables. Then, create a subclass called Car that has an
// additional variable numDoors and methods to set and get its value. Define another class that
// hosts the main method. Inside the main method: Create two instances/objects of the Car
// class. Call the set and get methods using the instance/objects created to display their functionality.

class Vehicle {
    String brand, model;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }
}

class Car extends Vehicle {
    int numDoors;

    void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    int getNumDoors() {
        return numDoors;
    }
}

class VehicleMain {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Toyota");
        c1.setModel("Corolla");
        c1.setNumDoors(4);

        Car c2 = new Car();
        c2.setBrand("Honda");
        c2.setModel("Civic");
        c2.setNumDoors(4);

        System.out.println("Car 1 Brand: " + c1.getBrand());
        System.out.println("Car 1 Model: " + c1.getModel());
        System.out.println("Car 1 Number of Doors: " + c1.getNumDoors());

        System.out.println("Car 2 Brand: " + c2.getBrand());
        System.out.println("Car 2 Model: " + c2.getModel());
        System.out.println("Car 2 Number of Doors: " + c2.getNumDoors());
    }
}