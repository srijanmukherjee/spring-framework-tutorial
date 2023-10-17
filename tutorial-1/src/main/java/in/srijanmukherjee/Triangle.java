package in.srijanmukherjee;

public class Triangle {
    private String type;
    private int height;

    public Triangle() {
        System.out.println("Triangle object has been created");
    }

    public Triangle(int height) {
        System.out.println("Triangle ctor (int height) initialized");
        this.height = height;
    }

    public Triangle(String type) {
        System.out.println("Triangle ctor (String type) initialized");
        this.type = type;
    }

    public Triangle(String type, int height) {
        System.out.println("Triangle ctor (String type, int height) initialized");
        this.type = type;
        this.height = height;
    }

    public void draw() {
        System.out.println(getType() + " triangle of height " + getHeight() + " drawn");
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }
}
