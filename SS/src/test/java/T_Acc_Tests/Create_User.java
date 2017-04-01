package T_Acc_Tests;
import DB_requests.DB_Connection;
import DB_requests.UsersInsertDB;
import org.junit.Test;
import t_acc.User_Creation;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static DB_requests.DB_Connection.getDB_con_Loc;

public class Create_User {
    User_Creation user;
    UsersInsertDB UsersInsertDB;
    int id;
    int password;

    @Test
    public void createAccApi () throws IOException, SQLException {
        DB_Connection DB_con = new DB_Connection();
        DB_con.setDB_con_Loc();
        Statement st = getDB_con_Loc().createStatement();
        int usersAmount=5;
        int counter=0;

        String selectMaxIdSQL = "SELECT max(id) as id from public.\"non_plan_users\"";
        ResultSet rs = st.executeQuery(selectMaxIdSQL);

        rs.next();
        id=rs.getInt("id");
        id++;
        while (counter != usersAmount) {
            UsersInsertDB.Insert(id, user, password);
            counter++;
            id++;
        }
    }
}
