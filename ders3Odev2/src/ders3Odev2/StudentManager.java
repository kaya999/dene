package ders3Odev2;

public class StudentManager extends UserManager {
			
			@Override
			public void signIn(User student) {
				
				System.out.println(student.email+" = giri� yapt�" );
			}
			@Override
			public void signOut(User student) {
				System.out.println(student.email+" = ��k�� yapt�" );
			}
			public void selectCourse(Student student) {
				
				System.out.println(student.email+" = kurs se�ti");
			}
			public void ejectCourse(User student) {
				System.out.println(student.email+" = kursu b�rakt�");
			}

}
