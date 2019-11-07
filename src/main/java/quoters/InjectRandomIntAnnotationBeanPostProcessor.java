package quoters;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> type = bean.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(bean, value);
            }
        }
        return bean;
    }
}
