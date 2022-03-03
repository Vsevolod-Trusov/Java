package Roads;


import Cars.Car;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Road extends Semaphore {
    private ReentrantLock loker;
    private String direction;
    private int numberOfCars;

    public Road(String direction, int permits, ReentrantLock loker){
        super(permits);
        this.direction = direction;
        this.numberOfCars = 0;
        this.loker = loker;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public void acquire(Car car) throws InterruptedException {
        super.acquire();
        this.loker.lock();
        System.out.println(car.getNAME()+ " едет по дороге " + car.getDirecton());
        this.loker.unlock();
        car.sleep(500);
        ++this.numberOfCars;
        this.loker.lock();
        System.out.println(car.getNAME()+" освободила дорогу");
        if(car.getDirecton() == "on work")
            car.setDirecton("from work");
        else
            car.setDirecton("on work");
        System.out.println("Now current direction of "+car.getNAME() +" is "+car.getDirecton());
        this.loker.unlock();
    }

    public void release() {
        super.release();
    }
}

