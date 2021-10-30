public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param width  double
     * @param length double
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     * 
     * @param width  double
     * @param length double
     * @param color  String
     * @param filled boolean
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * getArea method.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * getPerimater method.
     */
    @Override
    public double getPerimeter() {
        return (width + length) * 2.0f;
    }

    /**
     * toString method.
     */
    @Override
    public String toString() {
        String output;
        output = ",color=" + color + ",filled=" + filled + "]";
        return "Rectangle[width=" + width + ",length=" + length + output;
    }

}
