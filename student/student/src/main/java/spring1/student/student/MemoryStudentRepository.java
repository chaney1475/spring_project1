package spring1.student.student;

import java.util.HashMap;
import java.util.Map;

public class MemoryStudentRepository implements StudentRepository{

    private static Map<Long, Student> store = new HashMap<>();

    @Override
    public void save(Student member) {
        store.put(member.getId(),member);
    }

    @Override
    public Student findById(Long studentId) {
        return store.get(studentId);
    }
}
