package qualifiers_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class Config {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }

}
