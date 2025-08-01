package record;

public class Utils {

    public static void myInfo() {
        Student me = new Student("Maya", 10, 11);
        System.out.println(me.getInfo());
        System.out.println("in high school? " + me.isInHighSchool());
    }

    public static Classroom[] sorting(Student[] students) {
        Classroom[] classrooms = new Classroom[students.length];
        int classCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            int classroomIndex = -1;
            for (int j = 0; j < classCount; j++) {
                if (classrooms[j].grade() == student.grade() &&
                        classrooms[j].classNum() == student.classNumber()) {
                    classroomIndex = j;
                }
            }
            if (classroomIndex == -1) {
                Student[] group = new Student[1];
                group[0] = student;
                classrooms[classCount] = new Classroom(student.grade(), student.classNumber(), group);
                classCount++;
            } else {
                Student[] oldGroup = classrooms[classroomIndex].students();
                Student[] newGroup = new Student[oldGroup.length + 1];
                for (int k = 0; k < oldGroup.length; k++) {
                    newGroup[k] = oldGroup[k];
                }
                newGroup[oldGroup.length] = student;
                classrooms[classroomIndex] = new Classroom(student.grade(), student.classNumber(), newGroup);
            }
        }
        Classroom[] finalClassrooms = new Classroom[classCount];
        for (int i = 0; i < classCount; i++) {
            finalClassrooms[i] = classrooms[i];
        }
        return finalClassrooms;
    }

}
