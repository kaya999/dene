package ders3Odev2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();		
		student.id=1;
		student.fistName = "Osman";
		student.lastName = "Kaya";
		student.scholl= "Atatürk Üniversitesi";
		student.schollStatement="Muzun";
		student.email="osmankaya@java.com";
		
		Instructor instructor = new Instructor();		
		instructor.id=2;
		instructor.fistName ="Engin";
		instructor.lastName ="Demiroð";
		instructor.occupation="Yazýlým Uzmaný";
		instructor.certifications = "MCT, PMP, ITIL";
		instructor.email="engin@java.com";
		
		StudentManager studentManager = new StudentManager();
		studentManager.signIn(student);
		studentManager.selectCourse(student);
		studentManager.ejectCourse(student);
		studentManager.signOut(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signIn(instructor);
		instructorManager.courseAdd(instructor);	
		instructorManager.courseDelete(instructor);
		instructorManager.signOut(instructor);

	}

}
