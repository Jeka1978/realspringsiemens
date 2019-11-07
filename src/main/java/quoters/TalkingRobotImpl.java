package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired(required = false)
    @Film
    @Book
    private List<Quoter> quoters = Arrays.asList(() -> System.out.println("this is default quote"));


    @Override
    @PostConstruct
    public void talk(){
        quoters.forEach(Quoter::sayQuote);
    }
}
