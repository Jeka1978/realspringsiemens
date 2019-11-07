package quoters;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);

        context.close();
    }
}
