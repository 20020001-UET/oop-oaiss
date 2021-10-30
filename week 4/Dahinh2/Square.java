public class Square extends Rectangle {
    public Square() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param side double
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor.
     * 
     * @param side   double
     * @param color  String
     * @param filled boolean
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor.
     * 
     * @param topLeft Point
     * @param side    double
     * @param color   String
     * @param filled  boolean
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.width;
    }

    public void setSide(double side) {
        super.width = side;
        super.length = side;
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
     * setWidth method.
     */
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    /**
     * setLength method.
     */
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    /**
     * toString method.
     */
    @Override
    public String toString() {
        String output;
        output = ",side=" + super.width;
        output += ",color=" + color + ",filled=" + filled + "]";
        return "Square[topLeft=" + topLeft.toString() + output;
    }

}
