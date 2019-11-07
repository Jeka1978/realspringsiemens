package circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class Husband {
    @Autowired
    private Wife wife;

    @PostConstruct
    public void init(){
        wife.gotoShopping();
    }

    public void doWork() {
        System.out.println("h w");
    }
}
