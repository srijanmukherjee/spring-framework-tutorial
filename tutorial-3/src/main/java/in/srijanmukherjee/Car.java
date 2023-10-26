package in.srijanmukherjee;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, BeanNameAware, DisposableBean {
    private Engine engine;
    private String beanName;

    public void run() {
        System.out.println("Vrooom! engine " + engine + " is working");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Car#" + beanName + " has been initialized");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Car#" + beanName + " is destroyed");
    }

    public void onInit() {
        System.out.println("car bean initialized");
    }

    public void onGlobalInit() {
        System.out.println("car's global init method called");
    }

    private void onDestroy() {
        System.out.println("car has been destroyed");
    }

    private void onGlobalDestroy() {
        System.out.println("car's global destroy method called");
    }
}
