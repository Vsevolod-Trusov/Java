import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import by.trusov.one.Car;
import by.trusov.one.PassengerCar;
import by.trusov.one.manager.Manager;
import by.trusov.one.track.Track;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.*;
public class Main {

    static {
        new DOMConfigurator().doConfigure("log/log4j.xml", LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws FileNotFoundException {
        LOG.info("Starting program_____________________________");
        List<Car> taxiCompany = new ArrayList<Car>();

        taxiCompany.add(new PassengerCar("Toyota Camri", 10.0, 80, 5 , 450.50));
        taxiCompany.add(new Track("MAN-630", 5.0, 40, "Tree", 250));
        taxiCompany.add(new PassengerCar("Toyota Celica", 8.0, 90, 5 , 350));
        taxiCompany.add(new PassengerCar("Chevrolet Camaro", 8.0, 1000, 2, 550.50 ));
        taxiCompany.add(new Track("Gaz-5050", 12.0, 50, "Seed", 350.90));
        LOG.info("object \"taxiCompany\" is created");
        for(Car item : taxiCompany){
            System.out.println(item.toString());
            System.out.println();
        }
        System.out.println("---------------");


        Manager manager = new Manager("John");
        manager.DoSort(taxiCompany);
        System.out.println("---------------");
        manager.GetCar(taxiCompany, 50, 100);
        LOG.info("object \"manager\" is created");
        //XML serialization
        FileOutputStream xmlFile = new FileOutputStream("files/info.xml");
        XMLEncoder xmlEncoder = new XMLEncoder(xmlFile);
        xmlEncoder.writeObject(taxiCompany);
        xmlEncoder.close();
        LOG.info("object\"taxiCompany\" is serialized");

        //XML deserialization
        FileInputStream xmlInFile = new FileInputStream("files/info.xml");
        XMLDecoder xmlDecoder = new XMLDecoder(xmlInFile);
        List<Car> desTaxiCompany = (List<Car>)xmlDecoder.readObject();
        xmlDecoder.close();
        LOG.info("object\"taxiCompany\" is serialized");

        System.out.println("\n-------Deserialized information--------");
        for(Car item : desTaxiCompany){
            System.out.println(item.toString());
            System.out.println();
        }
        System.out.println("---------------");
        LOG.info("End of the program____________________________");
    }
}
