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

    public double getSide() {
        return super.width;
    }

    public void setSide(double side) {
        super.width = side;
        super.length = side;
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
        return "Square[side=" + super.width + ",color=" + color + ",filled=" + filled + "]";
    }

}
