public class Staff extends Person {
    // Attributes
    private String school;
    private double pay;

    // Constructor
    /**
     * Constructor 1.
     */
    public Staff() {
        super();
        this.school = "";
        this.pay = 0.0f;
    }

    /**
     * Constructor 2.
     * 
     * @param name    String
     * @param address String
     * @param school  String
     * @param pay     double
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Getter
    /**
     * Get School method.
     * 
     * @return school:String
     */
    public String getSchool() {
        return this.school;
    }

    /**
     * Get Pay method.
     * 
     * @return pay:double
     */
    public double getPay() {
        return this.pay;
    }

    // Setter
    /**
     * Set School method.
     * 
     * @param school String
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Set Pay method.
     * 
     * @param pay double
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    // To String
    /**
     * To String method.
     */
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}