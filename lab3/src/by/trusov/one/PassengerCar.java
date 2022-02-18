package by.trusov.one;
import by.trusov.one.icar.ICar;

public class PassengerCar extends Car implements ICar {
    private int numberofseats;

    public PassengerCar() {
        super();
        this.numberofseats = 0;
        Engine eng = new Engine();
    }
    public PassengerCar(int numberofseats) {
        super();
        this.numberofseats = numberofseats;
        Engine eng = new Engine();
    }

    public PassengerCar(String model, double fuelconsumption, int speed, int numberofseats, double cost) {
        super(model, fuelconsumption, speed, cost);
        this.numberofseats = numberofseats;
        Engine eng = new Engine();
    }

    public class Engine{
        private int numberofcylinders;
        public Engine() {
            this.numberofcylinders = 0;
        }
        public Engine(int numberofcylinders) {
            this.numberofcylinders = numberofcylinders;
        }

        public int getNumberofcylinders() {
            return numberofcylinders;
        }

        public void setNumberofcylinders(int numberofcylinders) {
            this.numberofcylinders = numberofcylinders;
        }

        public void CheckEngine(){
            System.out.println("Hello it's engine!");
        }
    }

    public int getNumberofseats() {
        return numberofseats;
    }

    public void setNumberofseats(int numberofseats) {
        this.numberofseats = numberofseats;
    }

    public enum SupportedFuel{
        Type92,Type95
    }

    @Override
    public void ToDrive() {
        System.out.println("I am driving!!!Dr-Dr-Dr(PCar)");
    }

    @Override
    public void ToClose() {
        System.out.println("The alarm is on(PCar)");
    }

    @Override
    public void ToStart() {
        System.out.println("The engine is running(PCar)");
    }

    @Override
    public String toString() {
        return this.getModel() +":\n"+
                "Speed: "+this.getSpeed()+"\n"+
                "Fuel consumption: " + this.getFuelconsumption()+"\n"+
                "Number of seats: "+this.getNumberofseats();
    }


    }


