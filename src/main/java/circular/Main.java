package circular;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("circular");
    }
}
