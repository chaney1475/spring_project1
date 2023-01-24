package spring1.student.student;

public interface StudentRepository {
    void save(Student student);
    Student findById(Long studentId);

}
