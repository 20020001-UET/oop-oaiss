public class Student {

    // thuoc tinh
    private String name;
    private String id;
    private String group;
    private String email;

    // constructor
    /**
     * Constructor 1.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     * 
     * @param name  String
     * @param id    String
     * @param email String
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Constructor 3.
     * 
     * @param s String
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    // getter
    /**
     * Get name method.
     * 
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * Get id method.
     * 
     * @return id String
     */
    public String getId() {
        return id;
    }

    /**
     * Get group method.
     * 
     * @return group String
     */
    public String getGroup() {
        return group;
    }

    /**
     * Get email method.
     * 
     * @return email String
     */
    public String getEmail() {
        return email;
    }

    // setter
    /**
     * Set name method.
     * 
     * @param n String
     */
    public void setName(String n) {
        this.name = n;
        return;
    }

    /**
     * Set id method.
     * 
     * @param i String
     */
    public void setId(String i) {
        this.id = i;
        return;
    }

    /**
     * Set group method.
     * 
     * @param g String
     */
    public void setGroup(String g) {
        this.group = g;
        return;
    }

    /**
     * Set email method.
     * 
     * @param e String
     */
    public void setEmail(String e) {
        this.email = e;
        return;
    }

    /**
     * Get Info method.
     * 
     * @return name - id - group - email String
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}
