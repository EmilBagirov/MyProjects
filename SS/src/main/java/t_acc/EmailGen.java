package t_acc;


import java.util.Random;

public class EmailGen {

    public String random() {
        final String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
        final int N = alphabet.length();
        String random = null;
        Random r = new Random();
        String temp = "";
        for (int i = 0; i < 10; i++) {
            random = String.valueOf(alphabet.charAt(r.nextInt(N)));
            temp += random;
        }
        String randomAcc = temp.concat("@yopmail.com");
        System.out.println("\nNon-Plan User: " + randomAcc);
        return randomAcc;
    }
}
