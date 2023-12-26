// 5.	Using the correct syntax in java, define a class called Vehicle that contains 2 data members: vehicleId and vehicleType, and 2 member functions: void input() to assign input values and void display() to display the values. Appropriate data types are to be chosen. Using the correct syntax in java, show how a subclass called myCar can be derived from the class vehicle to include additional data members carModel,carBrand. Appropriate data types are to be chosen. 

class Vehicle {
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

class MyCar {
    int carModel;
    String carBrand;

    void input(int carModel, String carBrand) {
        this.carModel = carModel;
        this.carBrand = carBrand;
    }

    void display() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Brand: " + carBrand);
    }
}

class Week12ClassActivityQ5 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.input(1, "Car");
        vehicle.display();

        MyCar myCar = new MyCar();
        myCar.input(2020, "Mercedes");
        myCar.display();
    }
}