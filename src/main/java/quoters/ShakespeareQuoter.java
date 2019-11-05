package quoters;

import lombok.AccessLevel;
import lombok.Setter;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class ShakespeareQuoter implements Quoter {
    @Setter
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
