package profiles_example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import quoters.Conf;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Confi.class)
@ActiveProfiles("Staging")
public class ConfiTest {

    @Autowired
    private StamService stamService;

    @Test
    public void testme(){
        stamService.doWork();
    }


}

