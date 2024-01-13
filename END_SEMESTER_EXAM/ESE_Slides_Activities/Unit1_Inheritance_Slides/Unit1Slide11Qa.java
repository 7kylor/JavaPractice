
// a. Create a class called Vehicle with instance variables brand and model, as well as methods to set and get the values of these variables. Then, create a subclass called Car that adds an additional instance variable numDoors and methods to set and get its value. Create a Main class , create two objects of Car class and call all the methods.

class Vehicle_ESE_Slides {
    String brand;
    String model;

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

class Car_ESE extends Vehicle_ESE_Slides {
    int numDoors;

    void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    int getNumDoors() {
        return numDoors;
    }
}

class VehicleMain_ESE_Slides {
    public static void main(String[] args) {
        Car_ESE car1 = new Car_ESE();
        Car_ESE car2 = new Car_ESE();

        car1.setBrand("Tesla");
        car1.setModel("Model 3");
        car1.setNumDoors(4);

        car2.setBrand("Tesla");
        car2.setModel("Model X");
        car2.setNumDoors(4);

        System.out.println("Car 1");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Number of Doors: " + car1.getNumDoors());

        System.out.println("Car 2");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Number of Doors: " + car2.getNumDoors());
    }
}
