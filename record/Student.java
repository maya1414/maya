package record;

public record Student(String name, int grade, int classNumber) {

    public Student(String name, int classNumber) {
        this(name, Constants.NINTH_GRADE, classNumber);
    }

    public String getInfo() {
        return "student " + name + " is in " + grade + "th and class number " + classNumber;
    }

    public boolean isInHighSchool() {
        return grade >= Constants.TENTH_GRADE && grade <= Constants.TWELVE_GRADE;
    }

}
