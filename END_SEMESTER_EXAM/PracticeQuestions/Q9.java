// 9. Using the correct syntax in java, define a class called Vehicle that
// contains 2 data members: vehicleId and vehicleType, and 2 member functions:
// void input() to assign input values and void display() to display the values.
// Appropriate data types are to be chosen. Using the correct syntax in java,
// show how a subclass called myCar can be derived from the class vehicle to
// include additional data members carModel,carBrand. Appropriate data types are
// to be chosen.

class Vehicle_ESE {
    int vehicleId;
    String vehicleType;

    void input(int vehicleId, String vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class myCar_ESE extends Vehicle_ESE {
    String carModel;
    String carBrand;

    void input(int vehicleId, String vehicleType, String carModel, String carBrand) {
        super.input(vehicleId, vehicleType);
        this.carModel = carModel;
        this.carBrand = carBrand;
    }

    void display() {
        super.display();
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Brand: " + carBrand);
    }
}

class VehicleMain_ESE {
    public static void main(String[] args) {
        myCar_ESE car = new myCar_ESE();
        car.input(1, "Car", "Model 3", "Tesla");
        car.display();
    }
}