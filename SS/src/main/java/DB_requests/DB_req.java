package DB_requests;
import java.sql.*;
import java.util.Formatter;
import static DB_requests.DB_Connection.getDB_con_NIM;

public class DB_req {

    public static String DB_table1 () throws SQLException {
        DB_Connection DB_con = new DB_Connection();
        DB_con.setDB_con_NIM();
        Statement st = getDB_con_NIM().createStatement();

        String selectTableSQL = "select p.id AS P_ID, p.dtype AS P_DTYPE,  p.cover_sort_date AS P_CSD, p.go_live_date AS P_GLD, " +
                "p.image_resource_base AS P_IRB, rdv.device_classes AS RDV_DC, r.presentation_class AS R_PC\n" +
                "FROM \n" +
                "rendition r,\n" +
                "product_renditions pr,\n" +
                "product p, \n" +
                "product_titles pt,\n" +
                "rendition_device_classes rdv,\n" +
                "title t\n" +
                "WHERE \n" +
                "t.id = pt.titles and\n" +
                "pt.product = p.id and\n" +
                "pr.product = p.id and\n" +
                "pr.renditions = r.id and\n" +
                "rdv.rendition = r.id and\n" +
                "rdv.device_classes = 'WIN8' and\n" +
                "p.go_live_date <= now() and\n" +
                "t.id = 52088\n" +
                "order by  p.cover_sort_date DESC";
        ResultSet rs = st.executeQuery(selectTableSQL);
        Formatter header = new Formatter();
        header.format("%3s %10s %15s %12s %15s %55s %66s %7s", "#", "P_ID", "P_DTYPE", "P_CSD", "P_GLD","P_IRB", "RDV_DC", "R_PC");
        System.out.println(header);
        System.out.println();
        while (rs.next()) {
            Formatter fmt = new Formatter();
            Integer rowNumber = rs.getRow();
            Integer id = rs.getInt("P_ID");
            String dtype = rs.getString("P_DTYPE");
            Date csd = rs.getDate("P_CSD");
            Date gld = rs.getDate("P_GLD");
            String irb = rs.getString("P_IRB");
            String dc = rs.getString("RDV_DC");
            String pc = rs.getString("R_PC");
            fmt.format ("|%3s| |%10s| |%13s| |%12s| |%12s| |%15s| |%5s| |%5s|", rowNumber, id, dtype, csd, gld, irb, dc, pc);
            System.out.println(fmt);
        }

            if (getDB_con_NIM() != null) {
            DB_con.getConCloseNIM();
            }
        return String.valueOf(rs);
    }
}


