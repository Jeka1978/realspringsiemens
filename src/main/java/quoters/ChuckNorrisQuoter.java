package quoters;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Book
@Film
public class ChuckNorrisQuoter implements Quoter {
    @InjectRandomQuote
    private String message;
    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }
}
