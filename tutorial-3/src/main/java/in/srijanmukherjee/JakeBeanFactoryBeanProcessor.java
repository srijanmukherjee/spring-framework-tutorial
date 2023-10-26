package in.srijanmukherjee;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Arrays;

public class JakeBeanFactoryBeanProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("[BeanFactoryBeanProcessor] postProcessBeanFactory() called");
        System.out.println("Here are all the beans defined in spring.xml");
        Arrays.stream(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);
    }
}

// WE DON'T QUESTION JAKE