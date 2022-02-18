package by.trusov.one;

public abstract class Car {
    private String model;
    private double fuelconsumption;
    private int speed;
    private double cost;
    public Car(){
        model = "";
        fuelconsumption = 0;
        speed = 0;
        cost = 0;
    }

    public Car (String model, double fuelconsumption, int speed, double cost){
        this.model = model;
        this.fuelconsumption = fuelconsumption;
        this.speed = speed;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public double getFuelconsumption() {
        return fuelconsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelconsumption(double fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


}
