import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class URLConnectionReader {

    static void GetUrl(String url) throws Exception {

        URL oracle = new URL(url);

        URLConnection yc = oracle.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

        String inputLine;

        Boolean isCounterTrue = Boolean.FALSE;

        while ((inputLine = in.readLine()) != null) {
            String counter = Options.getCounter();
            boolean isCounter = inputLine.contains(counter);
            if (isCounter) {
                isCounterTrue = Boolean.TRUE;
            }
        }

        if (!isCounterTrue) Main.Mail.send(url, "Ненайден счетчик", "semenov@octopod.com");

        in.close();
    }

}