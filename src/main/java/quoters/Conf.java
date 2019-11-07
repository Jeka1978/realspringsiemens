package quoters;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
@ImportResource("classpath:context.xml")
public class Conf {

    @Bean
    public Integer integer() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
