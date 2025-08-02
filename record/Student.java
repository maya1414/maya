package record;

public record Student(String name, int grade, int classNumber) {

    public Student(String name, int classNumber) {
        this(name, Constants.LAST_GRADE_OF_MID_SCHOOL, classNumber);
    }

    public String getInfo() {
        return "student " + name + " is in " + grade + "th and class number " + classNumber;
    }

    public boolean isInHighSchool() {
        return grade >= Constants.FIRST_GRADE_OF_HIGH_SCHOOL && grade <= Constants.LAST_GRADE_OF_HIGH_SCHOOL;
    }

}
