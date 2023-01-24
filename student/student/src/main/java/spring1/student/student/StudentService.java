package spring1.student.student;

public interface StudentService {
    void join(Student student);
    Student findStudent(Long studentId);

    void saveScore(StudentScore score);

    StudentScore findScore(Long StudentId);
}
