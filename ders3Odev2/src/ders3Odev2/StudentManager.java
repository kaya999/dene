package ders3Odev2;

public class StudentManager extends UserManager {
			
			@Override
			public void signIn(User student) {
				
				System.out.println(student.email+" = giriş yaptı" );
			}
			@Override
			public void signOut(User student) {
				System.out.println(student.email+" = çıkış yaptı" );
			}
			public void selectCourse(Student student) {
				
				System.out.println(student.email+" = kurs seçti");
			}
			public void ejectCourse(User student) {
				System.out.println(student.email+" = kursu bıraktı");
			}

}
