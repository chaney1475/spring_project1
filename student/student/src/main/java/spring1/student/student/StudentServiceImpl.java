package spring1.student.student;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    private final StudentScoreRepository studentScoreRepository;

    @Override
    public void join(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudent(Long studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public void saveScore(StudentScore score) {
        studentScoreRepository.save(score);
    }

    @Override
    public StudentScore findScore(Long studentId) {
        return studentScoreRepository.findById(studentId);
    }
}
