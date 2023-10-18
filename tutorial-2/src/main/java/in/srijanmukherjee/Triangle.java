package in.srijanmukherjee;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {
    private List<Point> points;
    private ApplicationContext context = null;
    private String beanName;

    public Triangle(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        System.out.print("Drawing triangle with points ");
        for (Point pt : getPoints()) {
            System.out.print(pt + " ");
        }
        System.out.println();
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return this.points;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("Bean name: " + name);
    }
}
