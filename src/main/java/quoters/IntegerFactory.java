package quoters;

import org.springframework.beans.factory.FactoryBean;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class IntegerFactory {
    public Integer getInt() throws Exception {
        Random random = new Random();
        return random.nextInt(100);
    }

}
