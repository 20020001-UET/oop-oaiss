public class Circle {
    // Attributes
    private double radius = 1.0f;
    private String color = "red";

    // PI define
    protected static final double PI = 3.14f;

    /**
     * Constructor 1.
     */
    public Circle() {
        radius = 1.0f;
        color = "red";
    }

    /**
     * Constructor 2.
     * 
     * @param radius double
     */
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    /**
     * Constructor 3.
     * 
     * @param radius double
     * @param color  String
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter
    /**
     * Get Radius method.
     * 
     * @return double
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Get Color method.
     * 
     * @return String
     */
    public String getColor() {
        return this.color;
    }

    // Setter
    /**
     * Set Radius method.
     * 
     * @param radius double
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Set Color method.
     * 
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    }

    // Area
    /**
     * Get Radius method.
     * 
     * @return double
     */
    public double getArea() {
        return radius * radius * PI;
    }

    // To String
    /**
     * To String method.
     */
    public String toString() {
        return "Circle[" + radius + "," + color + "]";
    }
}
