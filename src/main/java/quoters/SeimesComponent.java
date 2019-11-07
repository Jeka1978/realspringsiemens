package quoters;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Component
@Bean
public @interface SeimesComponent {
}
