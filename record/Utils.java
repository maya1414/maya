package record;

public class Utils {

    public static void myInfo() {
        Student me = new Student("Maya", Constants.TENTH_GRADE, Constants.CLASS_NUMBER_ELEVEN);
        System.out.println(me.getInfo());
        System.out.println("in high school? " + me.isInHighSchool());
    }

    public static int findClassIndex(Classroom[] classrooms, int classCount, Student student) {
        for (int i = 0; i < classCount; i++) {
            if (classrooms[i].grade() == student.grade() &&
                    classrooms[i].classNum() == student.classNumber()) {
                return i;
            }
        }
        return Constants.NOT_FOUND;
    }

    public static void addStudentToClassroom(Classroom[] classrooms, int classroomIndex, Student student) {
        Student[] oldGroup = classrooms[classroomIndex].students();
        Student[] newGroup = new Student[oldGroup.length + 1];
        for (int k = 0; k < oldGroup.length; k++) {
            newGroup[k] = oldGroup[k];
        }
        newGroup[oldGroup.length] = student;
        classrooms[classroomIndex] = new Classroom(classrooms[classroomIndex].grade(), classrooms[classroomIndex].classNum(), newGroup);
    }

    public static void createNewClassroom(Classroom[] classrooms, int classCount, Student student) {
        Student[] group = new Student[1];
        group[0] = student;
        classrooms[classCount] = new Classroom(student.grade(), student.classNumber(), group);
    }

    public static Classroom[] sorting(Student[] students) {
        Classroom[] classrooms = new Classroom[students.length];
        int classCount = 0;
        for (Student student : students) {
            int classroomIndex = findClassIndex(classrooms, classCount, student);
            if (classroomIndex == Constants.NOT_FOUND) {
                createNewClassroom(classrooms, classCount, student);
                classCount++;
            } else {
                addStudentToClassroom(classrooms, classroomIndex, student);
            }
        }
        Classroom[] result = new Classroom[classCount];
        for (int i = 0; i < classCount; i++) {
            result[i] = classrooms[i];
        }
        return result;
    }

}
