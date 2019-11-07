package quoters;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author Evgeny Borisov
 */
public class BeanDefinitionAnalyzerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        String[] names = factory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition beanDefinition = factory.getBeanDefinition(name);
            if (beanDefinition.getDestroyMethodName() != null && beanDefinition.isPrototype()) {
                throw new RuntimeException("you are an idiot");
            }
        }

    }
}
