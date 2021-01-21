package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		//���������� �����ϴ� ������� �ڵ� ����
//		Exam exam = new NewlecExam();
//		//ExamConsole console = new InlineExamConsole(exam);
//		ExamConsole console = new GridExamConsole();
//		console.setExam(exam);
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		
		//�Ѵ� ���� ������ �Ʒ������ ���� ��ȣ��.
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//java���� ArrayList�� ����ϴ� ����� �ٲ�.
//		List<Exam> exams = new ArrayList<>();
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
		//List exams = context.getBean(List.class);
		//exams.add(new NewlecExam(1,1,1,1));
//		
//		for(Exam e : exams)
//			System.out.println(e);
	}

}
