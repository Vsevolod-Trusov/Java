package DB;

import java.sql.*;

public class DB {
    private Connection connection;
    public DB() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/labjava", "root","root");

    }

    public void closeConnection() throws SQLException {
        connection.close();
    }



    public ResultSet queryResult(String query) throws SQLException {
        Statement myStmt = connection.createStatement();
        ResultSet resultSet =  myStmt.executeQuery(query);
        return  resultSet;
    }

    public void queryVoid(String query) throws SQLException {
        Statement myStmt = connection.createStatement();
        myStmt.execute(query);
    }

    public void queryPreparedVoid(String query) throws SQLException {
        PreparedStatement st = connection.prepareStatement(query);
        st.execute();
    }

    public ResultSet queryPreparedResult(String query) throws SQLException {
        PreparedStatement st = connection.prepareStatement(query);
        ResultSet resultSet = st.executeQuery();
        return resultSet;
    }

    public void printCities(ResultSet myRs) throws SQLException {
        System.out.println("Information from table: \"cities\"");
        while (myRs.next()) {
            System.out.println(myRs.getString("CityName") + " , " + myRs.getString("YearOfCreation") + " year, " + myRs.getString("GeneralSquare")+ " th, " + myRs.getString("Population") + " th");
        }
        System.out.println("-------------\n\n");
    }

    public void printPeople(ResultSet myRs2) throws SQLException {
        System.out.println("Information from table: \"people\"");
        while (myRs2.next()) {
            System.out.println(myRs2.getString("City") + " , " + myRs2.getString("NamePers") + " , " + myRs2.getString("Surname")+ " , " + myRs2.getString("ComLang"));
        }
        System.out.println("-------------\n");
    }

    public void printFirstQuery(ResultSet myRs3) throws SQLException {
        System.out.println("Result of First Query:");
        while (myRs3.next()) {
            System.out.println(myRs3.getString("City") + " , " + myRs3.getString("NamePers") + " , " + myRs3.getString("Surname")+ " , " + myRs3.getString("ComLang"));
        }
        System.out.println("-------------\n");
    }
    public void printSecondQuery(ResultSet myRs4) throws SQLException {
        System.out.println("Result of Second Query:");
        while (myRs4.next()) {
            System.out.println(myRs4.getString("City"));
        }
        System.out.println("-------------\n");
    }
    public void printThirdQuery(ResultSet myRs5) throws SQLException {
        System.out.println("Result of the Third Query:");
        while (myRs5.next()) {
            System.out.println(myRs5.getString("CityName") + " , " + myRs5.getString("NamePers") + " , " + myRs5.getString("Population"));
        }
        System.out.println("-------------\n");
    }

    public void printFourthQuery(ResultSet myRs6) throws SQLException {
        System.out.println("Result of the Fourth Query:");
        while (myRs6.next()) {
            System.out.println(myRs6.getString("NamePers") + " , " + myRs6.getString("CityName")+" , " + myRs6.getString("YearOfCreation"));
        }
        System.out.println("-------------\n");
    }
}