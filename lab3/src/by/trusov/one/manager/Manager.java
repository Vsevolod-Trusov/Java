package by.trusov.one.manager;
import by.trusov.one.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void GetCost(List<Car> list){
        double resultcost = 0;
        for (Car item :
                list) {
            resultcost += item.getCost();
        }

        System.out.println("Result cost of all cars is: "+ resultcost);
    }



    public void DoSort(List<Car> list){
        list.sort(Comparator.comparing(Car::getFuelconsumption));
        System.out.println("Sorted by fuel list:");
        for(Car item : list){
            System.out.println(item.toString());
            System.out.println();
        }

    }

    public void GetCar(List<Car> list,int speed1,int speed2){
        boolean fl1 = false;
        String speedstring = "("+speed1+","+" "+speed2+")";
        for(Car item : list){
            if(item.getSpeed()>= speed1 && item.getSpeed()<= speed2 )
            {
                System.out.println("Your car with speed"+speedstring+":");
                System.out.println(item.toString());
                fl1 =true;
                break;
            }
        }

        if(!fl1){
            System.out.println("Sorry, I didn't find your car");
        }
    }

}
