package in.srijanmukherjee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();

//        System.out.println(context.getMessage("driverName", null, "NA", Locale.getDefault()));

        Vehicle bus = context.getBean("bus", Vehicle.class);
        bus.run();

        // NOTE: close() method is in AbstractApplicationContext not ApplicationContext
        context.close();
    }
}