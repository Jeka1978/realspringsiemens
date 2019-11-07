package quoters;

import lombok.AccessLevel;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
@Book
public class ShakespeareQuoter implements Quoter {
    @Value("${shake}")
    private String message;

    @InjectRandomInt(min=3,max=6)
    private int repeat;

    @PostConstruct
    public void init(){
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }


}
