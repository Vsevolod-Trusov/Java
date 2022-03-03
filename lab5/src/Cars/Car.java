package Cars;

import Roads.Road;

public class Car extends Thread{
    private String name;
    private String directon;
    private Road road;
    public Car(String name, String direction, Road road){
        this.name = name;
        this.directon = direction;
        this.road = road;
    }

    public String getNAME() {
        return name;
    }

    public void setId(String name) {
        this.name = name;
    }

    public String getDirecton() {
        return directon;
    }

    public void setDirecton(String directon) {
        this.directon = directon;
    }

    @Override
    public void run(){
        int numbOfCars = 0;
        try {
            if(road.getNumberOfCars()>3){
                if(road.getDirection()=="on work")
                    road.setDirection("from work");
                else
                    road.setDirection("on work");
                road.setNumberOfCars(0);
            }
            else {
                road.setNumberOfCars(++numbOfCars);
            }
            road.acquire(this);
            road.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
