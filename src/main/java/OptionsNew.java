/**
 * Created by ivan on 21.10.16.
 */
class OptionsNew {

    static Sender getSender() {
        return new Sender("mail@mail.com", "password");
    }

    static String[] getUrls() {
        return new String[]{
                "http://***.ru/",
                "http://***.ru/",
                "http://***.ru/"

        };
    }

    static String getCounter() {
        return "id:0000000";
    }
}
