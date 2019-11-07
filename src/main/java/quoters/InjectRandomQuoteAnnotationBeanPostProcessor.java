package quoters;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectRandomQuoteAnnotationBeanPostProcessor implements BeanPostProcessor {
    private Faker faker = new Faker();
    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomQuote.class)) {
                field.setAccessible(true);
                field.set(bean,faker.chuckNorris().fact());
            }
        }
        return bean;
    }
}


