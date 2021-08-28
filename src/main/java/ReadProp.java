import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProp {
    Properties prop;

    public ReadProp(String file) {
        prop = new Properties();

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getPropValues(String name) {
        try {
            return prop.getProperty(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "none";
    }
}
