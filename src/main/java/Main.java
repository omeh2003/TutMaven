

public class Main {

    static Sender Mail = Options.getSender();
    private static String[] Urls = Options.getUrls();

    public static void main(String[] args) {
        // write your code here
        for (String Url : Urls) {

            try {
                URLConnectionReader.GetUrl(Url);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
