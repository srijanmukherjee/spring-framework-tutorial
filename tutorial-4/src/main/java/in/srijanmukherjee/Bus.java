package in.srijanmukherjee;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus is running");
    }
}
