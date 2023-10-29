package in.srijanmukherjee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Truck implements Vehicle {
    private Engine engine;
    private Trailer trailer2;
    private Trailer trailer;
    private Trailer trailer3;

    @Override
    public void run() {
        System.out.println("Truck-kun is running with " + engine + " pulling along a trailer having " + trailer2.getWheels() + " wheels");
    }

    public Engine getEngine() {
        return engine;
    }

    @Required
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Trailer getTrailer2() {
        return trailer2;
    }

    @Autowired
    public void setTrailer2(Trailer trailer2) {
        this.trailer2 = trailer2;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    @Autowired
    @Qualifier("truckRelated")
    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public Trailer getTrailer3() {
        return trailer3;
    }

    @Resource(name = "trailer3")
    public void setTrailer3(Trailer trailer3) {
        this.trailer3 = trailer3;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializer called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("truck destroyed");
    }
}
