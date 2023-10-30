package in.srijanmukherjee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;


@Component
public class Bus implements Vehicle, ApplicationEventPublisherAware {
    private final MessageSource messageSource;
    private ApplicationEventPublisher publisher;

    @Autowired
    public Bus(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void run() {
//        System.out.println("Bus is running, driver is " +
//                messageSource.getMessage("driverName", null, "N/A", Locale.getDefault()));
        String driver = this.messageSource.getMessage("driverName", null, "N/A", null);
        System.out.println(
                this.messageSource.getMessage(
                        "busRunningPrompt",
                        new Object[] { driver },
                        "Error!",
                        null)
        );

        publisher.publishEvent(new RunEvent(this));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
