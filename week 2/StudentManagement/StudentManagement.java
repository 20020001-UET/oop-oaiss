public class StudentManagement {

    // thuoc tinh
    private int length = 0;
    private Student[] studentArray = new Student[100];

    // constructor
    /**
     * Constructor.
     */
    public StudentManagement() {
        length = 0;
        studentArray = new Student[100];
    }

    /**
     * Check if two students is the same.
     * 
     * @param s1 Student
     * @param s2 Student
     * @return true if two students is the same.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    /**
     * Add student method.
     * 
     * @param newStudent Student
     */
    public void addStudent(Student newStudent) {
        if (length < 100) {
            studentArray[length] = newStudent;
            length++;
        }
        return;
    }

    /**
     * Get students by Group method.
     * 
     * @return String
     */
    public String studentsByGroup() {
        String result = "";
        String[] lastGroup = new String[100];
        int glengh = 0;
        for (int i = 0; i < length; i++) {
            boolean check = false;
            for (int j = 0; j < glengh; j++) {
                if (studentArray[i].getGroup() == lastGroup[j]) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                lastGroup[glengh] = studentArray[i].getGroup();
                glengh++;

                result += studentArray[i].getGroup() + '\n';

                for (int j = 0; j < length; j++) {
                    if (sameGroup(studentArray[i], studentArray[j])) {
                        result += studentArray[j].getInfo() + '\n';
                    }
                }
            }
        }

        return result;
    }

    /**
     * Remove student with id method.
     * 
     * @param id String
     */
    public void removeStudent(String id) {
        int pos = -1;
        for (int i = 0; i < length; i++) {
            if (studentArray[i].getId().equals(id)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return;
        }

        for (int i = pos; i < length - 1; i++) {
            studentArray[i] = studentArray[i + 1];
        }
        studentArray[length - 1] = null;
        length--;
        return;
    }

}