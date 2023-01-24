package spring1.student.student;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LetterGradingService implements GradingService{
    private final StudentScoreRepository studentScoreRepository;

    @Override
    public Grade grading(Long studentId) {
        StudentScore score = studentScoreRepository.findById(studentId);
        int average = (score.getEnglish() + score.getMath()) / 2;
        if(average >= 90){
            return Grade.A;
        }else if(average >= 75){
            return Grade.B;
        }else{
            return Grade.C;
        }
    }
}
