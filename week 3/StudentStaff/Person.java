public class Person {
    // Attributes
    private String name;
    private String address;

    // Constructor
    /**
     * Constructor 1.
     */
    public Person() {
        this.name = "";
        this.address = "";
    }

    /**
     * Constructor 2.
     * 
     * @param name    String
     * @param address String
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter
    /**
     * Get Name method.
     * 
     * @return name:String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get Address method.
     * 
     * @return address:String
     */
    public String getAddress() {
        return this.address;
    }

    // Setter
    /**
     * Set Address method.
     * 
     * @param address String
     */
    public void setAddress(String address) {
        this.address = address;
    }

    // To String
    /**
     * To String method.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
