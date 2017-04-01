package DB_requests;

import t_acc.EmailGen;
import t_acc.User_Creation;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static DB_requests.DB_Connection.getDB_con_Loc;
import static java.lang.String.valueOf;

public class UsersInsertDB {

    public static int Insert (int i, User_Creation email, int password) throws SQLException, IOException {
        EmailGen emailGen = null;
        email = new User_Creation();
        DB_Connection DB_con = new DB_Connection();
        DB_con.setDB_con_Loc();


        String selectTableSQL = "INSERT INTO public.\"non_plan_users\" (\"id\", \"name\", \"password\") VALUES (?,?,?)";
        PreparedStatement prepSt = getDB_con_Loc().prepareStatement(selectTableSQL);
        //prepSt.setInt(Integer id++);
        prepSt.setInt(1, i);
        prepSt.setString(2, String.valueOf(email.create(emailGen)));
        prepSt.setInt(3, 24232558);
        int rs = prepSt.executeUpdate();
        if (getDB_con_Loc() != null) {
            DB_con.getConCloseLoc();
        }
        return rs;
    }


}
