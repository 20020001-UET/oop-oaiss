public class StudentManagement {

    // thuoc tinh
    private Student[] students = new Student[100];
    private int length = 0;

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
        students[length] = newStudent;
        length++;
        return;
    }

    /**
     * Get students by Group method.
     * 
     * @return String
     */
    public String studentsByGroup() {
        String[] groups = new String[100];
        int glength = 0;
        String result = "";

        for (int i = 0; i < length; ++i) {
            String curGroup = students[i].getGroup();
            boolean check = false;

            for (int j = 0; j < glength; ++j) {
                if (curGroup.equals(groups[j])) {
                    check = true;
                    break;
                }
            }

            if (!check) {

                groups[glength++] = curGroup;
                result += curGroup + '\n';

                for (int j = i; j < length; ++j) {
                    if (students[j].getGroup().equals(curGroup)) {
                        result += students[j].getInfo() + '\n';
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
        for (int i = 0; i < length; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < length - 1; j++) {
                    students[j] = students[j + 1];
                }
                length--;
                i--;
            }
        }
        return;
    }

}