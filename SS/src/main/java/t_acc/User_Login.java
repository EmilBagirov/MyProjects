package t_acc;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class User_Login {


    public static String login (User_Creation userCreated) throws IOException {

        EmailGen emailGen = new EmailGen();
        userCreated = new User_Creation();
        String user = userCreated.create(emailGen);
        final String X_Nimsaleschannel = "SAMSTORE";
        String url = "https://www.qa.texture.com/accounts/api/login/texture ";


        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("X-Nimsaleschannel", X_Nimsaleschannel);
        String postJsonData = "j_username="+user+"&j_password=24232558";

        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(postJsonData);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("Response code: " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String outPut;
        StringBuffer response = new StringBuffer();

        while ((outPut = in.readLine()) != null) {
            response.append(outPut);
        }
        in.close();

        System.out.println("Response: \n"+response.toString());
        return String.valueOf(response);
    }



}
