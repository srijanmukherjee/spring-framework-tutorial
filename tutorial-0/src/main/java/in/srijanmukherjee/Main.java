package in.srijanmukherjee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("equilateralTriangle");

//         will throw org.springframework.beans.factory.NoSuchBeanDefinitionException
//         triangle = (Triangle) context.getBean("circle");

        triangle.draw();

        triangle = (Triangle) context.getBean("isoscelesTriangle");
        triangle.draw();

        // close() method in AbstractApplicationContext
        context.close();
    }
}