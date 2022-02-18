import java.util.ArrayList;
import java.util.List;
import by.trusov.one.Car;
import by.trusov.one.PassengerCar;
import by.trusov.one.manager.Manager;
import by.trusov.one.track.Track;

public class Main {

    public static void main(String[] args) {

        List<Car> taxiCompany = new ArrayList<Car>();

        taxiCompany.add(new PassengerCar("Toyota Camri", 10.0, 80, 5 , 450.50));
        taxiCompany.add(new Track("MAN-630", 5.0, 40, "Tree", 250));
        taxiCompany.add(new PassengerCar("Toyota Celica", 8.0, 90, 5 , 350));
        taxiCompany.add(new PassengerCar("Chevrolet Camaro", 8.0, 1000, 2, 550.50 ));
        taxiCompany.add(new Track("Gaz-5050", 12.0, 50, "Seed", 350.90));

        for(Car item : taxiCompany){
            System.out.println(item.toString());
            System.out.println();
        }
        System.out.println("---------------");

        Manager manager = new Manager("John");
        manager.DoSort(taxiCompany);
        System.out.println("---------------");
        manager.GetCar(taxiCompany, 50, 100);
    }
}
