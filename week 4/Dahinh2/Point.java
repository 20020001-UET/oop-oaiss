public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     * 
     * @param pointX double
     * @param pointY dobule
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Get Distance between two points.
     * 
     * @param other Point
     * @return distance
     */
    public double distance(Point other) {
        double sqrX = this.pointX - other.pointX;
        double sqrY = this.pointY - other.pointY;
        return Math.sqrt(sqrX * sqrX + sqrY * sqrY);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(pointX);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pointY);
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
        Point other = (Point) obj;
        if (Math.abs(this.pointX - other.pointX) >= 0.001f) {
            return false;
        }
        if (Math.abs(this.pointY - other.pointY) >= 0.001f) {
            return false;
        }
        return true;
    }

    /**
     * toString method.
     */
    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }

}
