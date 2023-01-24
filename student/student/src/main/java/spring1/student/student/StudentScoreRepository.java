package spring1.student.student;

public interface StudentScoreRepository {
    void save(StudentScore score);
    StudentScore findById(Long studentId);
}
