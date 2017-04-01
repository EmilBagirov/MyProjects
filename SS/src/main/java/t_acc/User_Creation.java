package t_acc;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class User_Creation {

    public static String create(EmailGen emailGen) throws IOException {
        emailGen = new EmailGen();
        final String X_Nimsaleschannel = "SAMSTORE";
        String email = emailGen.random();
        String url = "https://www.qa.texture.com/accounts/api/accounts/texture";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("X-Nimsaleschannel", X_Nimsaleschannel);
        String postJsonData = "email="+email+"&firstName=Test&captcha=&password=24232558&keepMeUpToDate=true";

        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(postJsonData);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        //System.out.println("\n'Create Account - texture domain' request: " + url+postJsonData);
        System.out.println("Response code: " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String outPut;
        StringBuffer response = new StringBuffer();

        while ((outPut = in.readLine()) != null) {
            response.append(outPut);
        }
        in.close();

        //System.out.println("Response: \n"+response.toString());
        return String.valueOf(email);
    }
}
