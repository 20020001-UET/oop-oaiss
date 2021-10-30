public class Circle extends Shape {
    protected double radius;
    protected Point center;

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

    /**
     * Constructor.
     * 
     * @param center Point
     * @param radius double
     * @param color  String
     * @param filled boolean
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((center == null) ? 0 : center.hashCode());
        long temp;
        temp = Double.doubleToLongBits(radius);
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
        Circle other = (Circle) obj;
        if (center == null) {
            if (other.center != null) {
                return false;
            }
        } else {
            if (!center.equals(other.center)) {
                return false;
            }
        }
        if (Math.abs(this.radius - other.radius) >= 0.001f) {
            return false;
        }
        return true;
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
        String output;
        output = ",color=" + color + ",filled=" + filled + "]";
        return "Circle[center=" + center.toString() + ",radius=" + radius + output;
    }

}
