package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		//스프링에게 지시하는 방법으로 코드 변경
//		Exam exam = new NewlecExam();
//		//ExamConsole console = new InlineExamConsole(exam);
//		ExamConsole console = new GridExamConsole();
//		console.setExam(exam);
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		
		//둘다 가능 하지만 아래방법을 좀더 선호함.
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//java에서 ArrayList를 사용하는 방법을 바꿈.
//		List<Exam> exams = new ArrayList<>();
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
		//List exams = context.getBean(List.class);
		//exams.add(new NewlecExam(1,1,1,1));
//		
//		for(Exam e : exams)
//			System.out.println(e);
	}

}
