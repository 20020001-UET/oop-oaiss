public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

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

    /**
     * Construtor.
     * 
     * @param topLeft Point
     * @param width   double
     * @param length  double
     * @param color   String
     * @param filled  boolean
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
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

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((topLeft == null) ? 0 : topLeft.hashCode());
        temp = Double.doubleToLongBits(width);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        if (topLeft == null) {
            if (other.topLeft != null) {
                return false;
            }
        } else {
            if (!topLeft.equals(other.topLeft)) {
                return false;
            }
        }
        if (Math.abs(this.width - other.width) >= 0.001f) {
            return false;
        }

        if (Math.abs(this.length - other.length) >= 0.001f) {
            return false;
        }
        return true;
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
        output = ",width=" + width + ",length=" + length;
        output += ",color=" + color + ",filled=" + filled + "]";
        return "Rectangle[topLeft=" + topLeft.toString() + output;
    }

}
