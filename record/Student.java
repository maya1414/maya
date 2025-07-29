package record;

public record Student(String name, int grade, int classNumber) {

    public String getInfo() {
        return "student " + name + " is in " + grade + "th and class number " + classNumber;
    }

    public boolean isInHighSchool() {
        return grade >= 10 && grade <= 12;
    }

    public Student(String name, int classNumber) {
        this(name, 9, classNumber);
    }

}
