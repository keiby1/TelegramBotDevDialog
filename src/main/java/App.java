import bot.Bot;
import org.apache.log4j.Logger;
import org.telegram.telegrambots.ApiContextInitializer;

public class App {
    private static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        ReadProp props = new ReadProp("conf.properties");

        String name = props.getPropValues("bot.name");
        String token = props.getPropValues("bot.token");

        ApiContextInitializer.init();
        Bot test_habr_bot = new Bot(name, token);
        test_habr_bot.botConnect();
    }
}