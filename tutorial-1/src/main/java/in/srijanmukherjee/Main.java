package in.srijanmukherjee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("equilateralTriangle");

        triangle.draw();

        // Check for shared singleton instance
        System.out.println("context.isSingleton(\"equilateralTriangle\"): " +
                context.isSingleton("equilateralTriangle"));

        TriangleWithPoints triangleWithPoints = context.getBean("triangleWithPoints", TriangleWithPoints.class);
        triangleWithPoints.draw();

        TriangleWithPoints aliasedTriangle = context.getBean("triangle-alias", TriangleWithPoints.class);

        // compares the reference
        System.out.println("triangleWithPoints == aliasedTriangle: " + (triangleWithPoints == aliasedTriangle));

        // NOTE: close() method is in AbstractApplicationContext not ApplicationContext
        context.close();
    }
}