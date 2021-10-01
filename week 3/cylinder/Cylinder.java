public class Cylinder extends Circle {
    // Attributes
    private double height = 1.0f;

    // Constructor
    /**
     * Constructor 1.
     */
    public Cylinder() {
        super();
        this.height = 1.0f;
    }

    /**
     * Constructor 2.
     * 
     * @param radius double
     */
    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0f;
    }

    /**
     * Constructor 3.
     * 
     * @param radius double
     * @param color  String
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = 1.0f;
    }

    /**
     * Constructor 4.
     * 
     * @param radius double
     * @param color  String
     * @param height double
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter
    /**
     * Get Height method.
     * 
     * @return height:double
     */
    public double getHeight() {
        return this.height;
    }

    // Setter
    /**
     * Set Height method.
     * 
     * @param height double
     */
    public void setHeight(double height) {
        this.height = height;
    }

    // Volume
    /**
     * Get Volume of the Cylinder.
     * 
     * @return double
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    // To String
    /**
     * To String method.
     */
    public String toString() {
        return "Cylinder[" + super.toString() + "," + height + "]";
    }

}