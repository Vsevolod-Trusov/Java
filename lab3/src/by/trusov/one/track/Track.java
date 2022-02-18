package by.trusov.one.track;
import by.trusov.one.icar.ICar;
import by.trusov.one.Car;

public class Track extends Car implements ICar{
    private String transportedcargo;

    public Track() {
        this.transportedcargo = "";
        Engine eng = new Engine();
    }
    public Track(String transportedcargo) {
        this.transportedcargo = transportedcargo;
        Engine eng = new Engine();
    }

    public Track(String model, double fuelconsumption, int speed, String transportedcargo, double cost) {
        super(model, fuelconsumption, speed, cost);
        this.transportedcargo = transportedcargo;
        Engine eng = new Engine();
    }

    public String getTransportedcargo() {
        return transportedcargo;
    }

    public void setTransportedcargo(String transportedcargo) {
        this.transportedcargo = transportedcargo;
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

    public enum SupportedFuel{
        Diesel,Petrol,Gas
    }
    public String toString() {
        return this.getModel() +":\n"+
                "Speed: "+this.getSpeed()+"\n"+
                "Fuel consumption: " + this.getFuelconsumption()+"\n"+
                "Trasported carg: "+this.getTransportedcargo();
    }
    @Override
    public void ToDrive() {
        System.out.println("I am driving!!!Dr-Dr-Dr(Track)");
    }

    @Override
    public void ToClose() {
        System.out.println("The alarm is on(Track)");
    }

    @Override
    public void ToStart() {
        System.out.println("The engine is running(Track)");
    }
}
