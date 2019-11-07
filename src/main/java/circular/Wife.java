package circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class Wife {
    @Autowired
    private Husband husband;

    @PostConstruct
    public void init(){
        husband.doWork();
    }

    public void gotoShopping() {
        System.out.println("Shopping");
    }
}
