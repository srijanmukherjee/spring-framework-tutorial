package in.srijanmukherjee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();

        // Coding to interface
        Vehicle car = context.getBean("car", Vehicle.class);
        Vehicle truck = context.getBean("truck", Vehicle.class);
        car.run();
        truck.run();

        context.getBean("bus", Vehicle.class).run();

        // NOTE: close() method is in AbstractApplicationContext not ApplicationContext
        context.close();
    }
}