import bot.Bot;
import org.apache.log4j.Logger;
import org.telegram.telegrambots.ApiContextInitializer;

/**
 * Hello world!
 */
public class App {
    private static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        String name ="";
        String token = "";
        ApiContextInitializer.init();
        Bot test_habr_bot = new Bot(name, token);
        test_habr_bot.botConnect();
    }
}