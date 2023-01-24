package spring1.student.student;

public class StudentScore {

    Long studentId;
    int Math;
    int English;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public StudentScore(Long studentId, int math, int english) {
        this.studentId = studentId;
        Math = math;
        English = english;
    }
}
