package spring1.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring1.student.student.*;

@Configuration
public class AppConfig {
    @Bean
    public StudentService studentService(){
        return new StudentServiceImpl(studentRepository(), studentScoreRepository());
    }
    @Bean
    public GradingService gradingService(){
        return new LetterGradingService(studentScoreRepository());
    }
    @Bean
    public StudentRepository studentRepository(){
        return new MemoryStudentRepository();
    }
    @Bean
    public StudentScoreRepository studentScoreRepository(){return new MemoryStudentScoreRepository();}

}
