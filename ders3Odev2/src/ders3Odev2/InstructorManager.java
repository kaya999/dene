package ders3Odev2;

public class InstructorManager extends UserManager{
	
	@Override
	public void signIn(User �nstructor) {
		System.out.println(�nstructor.email+" = giri� yapt�" );
	}
	@Override
	public void signOut(User �nstructor) {
		System.out.println(�nstructor.email+" = ��k�� yapt�" );
	}
	
	public void courseAdd(User �nstructor) {
		System.out.println(�nstructor.email+" = kurs ekledi" );
	}
	public void courseDelete(User �nstructor) {
		System.out.println(�nstructor.email+" = kursu sildi" );
	}
}
