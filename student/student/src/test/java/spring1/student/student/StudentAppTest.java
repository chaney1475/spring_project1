package spring1.student.student;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring1.student.AppConfig;

import static org.assertj.core.api.Assertions.*;

class StudentAppTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    void join() {
        StudentService studentService = ac.getBean(StudentService.class);
        //given
        Student student = new Student(1L, "studentA");
        //when
        studentService.join(student);
        Student findMember = studentService.findStudent(1L);
        //then
        assertThat(student).isEqualTo(findMember);
    }
    @Test
    void saveScore(){
        StudentService studentService = ac.getBean(StudentService.class);
        GradingService gradingService = ac.getBean(GradingService.class);
        //given
        Student student = new Student(2L, "studentB");
        studentService.join(student);
        StudentScore studentScore = new StudentScore(student.getId(), 90, 70);
        studentService.saveScore(studentScore);

        //when
        Grade grade = gradingService.grading(student.getId());

        //then
        assertThat(grade).isEqualTo(Grade.B);
    }
}