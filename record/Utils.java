package record;

public class Utils {

    public static void myInfo() {
        Student me = new Student("Maya", Constants.FIRST_GRADE_OF_HIGH_SCHOOL, Constants.MY_CLASS_NUMBER);
        System.out.println(me.getInfo());
        System.out.println("in high school? " + me.isInHighSchool());
    }

    public static int findStudentClassIndex(Classroom[] classrooms, int classCount, Student student) {
        for (int i = 0; i < classCount; i++) {
            if (classrooms[i].grade() == student.grade() &&
                    classrooms[i].classNum() == student.classNumber()) {
                return i;
            }
        }
        return Constants.DEFAULT_INDEX;
    }

    public static Classroom addStudentToClassroom(Classroom classroom, Student student) {
        Student[] oldGroup = classroom.students();
        Student[] newGroup = new Student[oldGroup.length + 1];
        for (int k = 0; k < oldGroup.length; k++) {
            newGroup[k] = oldGroup[k];
        }
        newGroup[oldGroup.length] = student;
        return new Classroom(classroom.grade(), classroom.classNum(), newGroup);
    }

    public static Classroom createNewClassroom(Student student) {
        Student[] group = new Student[]{student};
        return new Classroom(student.grade(), student.classNumber(), group);
    }

    public static Classroom[] sorting(Student[] students) {
        Classroom[] classrooms = new Classroom[students.length];
        int classCount = 0;
        for (Student student : students) {
            int classroomIndex = findStudentClassIndex(classrooms, classCount, student);
            if (classroomIndex == Constants.DEFAULT_INDEX) {
                classrooms[classCount] = createNewClassroom(student);
                classCount++;
            } else {
                classrooms[classroomIndex] = addStudentToClassroom(classrooms[classroomIndex], student);
            }
        }
        Classroom[] result = new Classroom[classCount];
        for (int i = 0; i < classCount; i++) {
            result[i] = classrooms[i];
        }
        return result;
    }

}
