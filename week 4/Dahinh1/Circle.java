public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param radius double
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor.
     * 
     * @param radius double
     * @param color  String
     * @param filled boolean
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getArea method.
     */
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * getPerimater method.
     */
    @Override
    public double getPerimeter() {
        return radius * 2.0f * Math.PI;
    }

    /**
     * toString method.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }

}
