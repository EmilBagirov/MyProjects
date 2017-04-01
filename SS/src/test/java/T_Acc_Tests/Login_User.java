package T_Acc_Tests;
import DB_requests.DB_Connection;
import org.junit.Test;
import t_acc.User_Login;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import static DB_requests.DB_Connection.getDB_con_Loc;

public class Login_User {
    User_Login user_login;
    Create_User create_user;

    @Test
    public void userLogin () throws SQLException, IOException {
        DB_Connection DB_con = new DB_Connection();
        DB_con.setDB_con_Loc();
        Statement st = getDB_con_Loc().createStatement();

        create_user.createAccApi();

    }
}
