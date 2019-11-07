package profiles_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class StamService {
    @Autowired
    private Dao dao;

    @EventListener(ContextRefreshedEvent.class)
    public void doWork(){
        dao.saveAll();
    }


}
