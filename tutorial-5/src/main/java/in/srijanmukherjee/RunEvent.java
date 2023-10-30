package in.srijanmukherjee;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class RunEvent extends ApplicationEvent {
    public RunEvent(Object source) {
        super(source);
    }

    public RunEvent(Object source, Clock clock) {
        super(source, clock);
    }

    @Override
    public String toString() {
        return "Run event has occurred [" + this.getTimestamp() + "]";
    }
}
