public class StudentManagement {

    // thuoc tinh
    private int length = 0;
    private Student[] studentArray = new Student[100];
    private int glengh = 0;
    private String[] lastGroup = new String[100];

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
        studentArray[length] = newStudent;
        length++;
        return;
    }

    /**
     * Get students by Group method.
     * 
     * @return String
     */
    public String studentsByGroup() {
        String result = "";

        for (int i = 0; i < length; i++) {
            boolean check = false;
            String curGroup = studentArray[i].getGroup();

            for (int j = 0; j < glengh; j++) {
                if (curGroup.equals(lastGroup[j])) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                lastGroup[glengh] = curGroup;
                glengh++;
            }
        }

        for (int i = 0; i < glengh; i++) {
            result += lastGroup[i] + '\n';

            for (int j = 0; j < length; j++) {
                if (studentArray[j].getGroup().equals(lastGroup[i])) {
                    result += studentArray[j].getInfo() + '\n';
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
        for (int i = 0; i < length; i++) {
            if (studentArray[i].getId().equals(id)) {
                for (int j = i; j < length - 1; j++) {
                    studentArray[j] = studentArray[j + 1];
                }
                length--;
            }
        }
        return;
    }

}