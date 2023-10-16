package in.srijanmukherjee;

public class Triangle {
    private String type;

    public Triangle() {
        System.out.println("Triangle object has been created");
    }

    public void draw() {
        System.out.println(type + " Triangle drawn");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
