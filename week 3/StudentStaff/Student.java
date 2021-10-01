public class Student extends Person {
    // Attributes
    private String program;
    private int year;
    private double fee;

    // Constructor
    /**
     * Constructor 1.
     */
    public Student() {
        super();
        this.program = "";
        this.year = 0;
        this.fee = 0.0f;
    }

    /**
     * Constructor 2.
     * 
     * @param name    String
     * @param address String
     * @param program String
     * @param year    int
     * @param fee     double
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Getter
    /**
     * Get Program method.
     * 
     * @return program:String
     */
    public String getProgram() {
        return this.program;
    }

    /**
     * Get Year method.
     * 
     * @return year:int
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Get Fee method.
     * 
     * @return fee:double
     */
    public double getFee() {
        return this.fee;
    }

    // Setter
    /**
     * Set Program method.
     * 
     * @param program String
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Set Year method.
     * 
     * @param year int
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Set Fee method.
     * 
     * @param fee double
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    // To String
    /**
     * To String method.
     */
    public String toString() {
        String result;
        result = "Student[" + super.toString();
        result += ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
        return result;
    }
}