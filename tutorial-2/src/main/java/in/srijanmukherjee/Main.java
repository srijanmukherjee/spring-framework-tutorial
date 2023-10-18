package in.srijanmukherjee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = context.getBean("triangle", Triangle.class);
        triangle.draw();

        // NOTE: close() method is in AbstractApplicationContext not ApplicationContext
        context.close();
    }
}