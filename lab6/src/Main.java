import java.sql.*;
import DB.*;
import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {
    static {
        new DOMConfigurator().doConfigure("log/log4j.xml", LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        System.out.println("Hello! Let's start:");
        try {
            LOG.info("Program is started.");
            DB db = new DB();
            System.out.println("Connetion is opened");
            LOG.info("Connetion is opened");

            db.queryVoid("delete from cities");
            db.queryPreparedVoid("insert into cities (CityName, YearOfCreation, GeneralSquare, Population) " +
                    "values ('Minsk',1067, 307.0, 1974.0)");

            db.queryVoid("insert into cities (CityName, YearOfCreation, GeneralSquare, Population) " +
                    "values ('Gomel',1142, 135.0, 535.0)");
            db.queryVoid("insert into cities (CityName, YearOfCreation, GeneralSquare, Population) " +
                    "values ('Brest',1019, 145.0, 346.0)");
            db.queryVoid("insert into cities (CityName, YearOfCreation, GeneralSquare, Population) " +
                    "values ('Grodno',1128, 142.0, 356.9)");
            db.queryVoid("insert into cities (CityName, YearOfCreation, GeneralSquare, Population) " +
                    "values ('Vitebsk',974, 134.0, 362.9)");


            db.queryVoid("delete from people");
            db.queryVoid("insert into people (City, NamePers , Surname, ComLang) " +
                    "values ('Minsk','Vsevolod', 'Trusov', 'Rus/Eng/Bel')");
            db.queryVoid("insert into people (City, NamePers, Surname, ComLang) " +
                    "values ('Gomel','Evgenya', 'Trusova', 'Bel/Rus')");
            db.queryVoid("insert into people (City, NamePers, Surname, ComLang) " +
                    "values ('Minsk','Evgenya', 'Oleshkevich', 'Eng/Rus')");
            db.queryVoid("insert into people (City, NamePers, Surname, ComLang) " +
                    "values ('Brest','Alex', 'Marlow', 'Eng')");
            db.queryVoid("insert into people (City, NamePers, Surname, ComLang) " +
                    "values ('Grodno','John', 'Narrow', 'Eng/Chinese')");
            db.queryVoid("insert into people (City, NamePers, Surname, ComLang)" +
                    " values ('Vitebsk','Bob', 'Pin', 'Spanish/Eng')");

            ResultSet myRs = db.queryResult("SELECT * FROM cities");
            ResultSet myRs2 = db.queryResult("SELECT * FROM people");

            ResultSet myRs3 = db.queryResult("SELECT * FROM people WHERE City LIKE 'Minsk' " +
                    "AND ComLang LIKE 'Rus/Eng/Bel'");
            ResultSet myRs4 = db.queryResult("SELECT City FROM people WHERE NamePers LIKE 'Evgenya' ");
            ResultSet myRs5 = db.queryResult("SELECT CityName, Population, NamePers FROM cities INNER JOIN people " +
                    "ON cities.CityName = people.City WHERE cities.Population > 500 ");

            ResultSet myRs6 = db.queryPreparedResult("SELECT NamePers, CityName,MIN(YearOfCreation) AS YearOfCreation " +
                    "FROM cities INNER JOIN people ON cities.CityName = people.City");
            //results set
            db.printCities(myRs);
            db.printPeople(myRs2);
            db.printFirstQuery(myRs3);
            LOG.info("The First query is done");
            db.printSecondQuery(myRs4);
            LOG.info("The Second query is done");
           db.printThirdQuery(myRs5);
            LOG.info("The Third query is done");
           db.printFourthQuery(myRs6);
            LOG.info("The Fourth query is done");
            db.closeConnection();
            System.out.println("Connetion is closed");
            LOG.info("Connetion is closed");
        } catch (Exception exc) {
            exc.printStackTrace();
            LOG.error(exc.getMessage());
        }
        LOG.info("Program is excecuted");
    }
}
