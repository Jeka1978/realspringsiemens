package profiles_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
//spring.profiles.active
public class Confi {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Confi.class);
    }
}
