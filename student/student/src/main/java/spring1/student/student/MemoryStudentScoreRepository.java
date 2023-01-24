package spring1.student.student;

import java.util.HashMap;
import java.util.Map;

public class MemoryStudentScoreRepository implements StudentScoreRepository{

    private static Map<Long, StudentScore> store = new HashMap<>();

    @Override
    public void save(StudentScore score) {
        store.put(score.getStudentId(),score);
    }

    @Override
    public StudentScore findById(Long studentId) {
        return store.get(studentId);
    }
}
