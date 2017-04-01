package DB_requests;
import java.sql.*;

public class DB_Connection {

    private static Connection DB_con_NIM;
    private static Connection DB_con_Loc;

    //NIM database--------------------------------------------------------------
    public void setDB_con_NIM() {
        final String USERNAME = "readonly";
        final String PASSWORD = "4your3y3sonly";
        final String URL = "jdbc:postgresql://192.168.200.26:5432/nim";

        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
        }

        try {
            DB_con_NIM = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        this.DB_con_NIM = DB_con_NIM;
    }

    public static Connection getDB_con_NIM() {
        return DB_con_NIM;
    }

    public void getConCloseNIM() throws SQLException {
        try {
            DB_con_NIM.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //My database--------------------------------------------------------------
    public void setDB_con_Loc() {
        final String USERNAME = "postgres";
        final String PASSWORD = "espada2626";
        final String URL = "jdbc:postgresql://localhost:5432/Users";

        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
        }

        try {
            DB_con_Loc = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        this.DB_con_Loc = DB_con_Loc;
    }

    public static Connection getDB_con_Loc() {
        return DB_con_Loc;
    }

    public void getConCloseLoc() throws SQLException {
        try {
            DB_con_Loc.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
