package spring1.student.student;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PassGradingService implements GradingService{
    private final StudentScoreRepository studentScoreRepository;

    @Override
    public Grade grading(Long studentId) {
        StudentScore score = studentScoreRepository.findById(studentId);
        int average = (score.getEnglish() + score.getMath()) / 2;
        if(average >= 65){
            return Grade.P;
        }else{
            return Grade.NP;
        }
    }
}
