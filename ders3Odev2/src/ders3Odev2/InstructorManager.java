package ders3Odev2;

public class InstructorManager extends UserManager{
	
	@Override
	public void signIn(User ýnstructor) {
		System.out.println(ýnstructor.email+" = giriþ yaptý" );
	}
	@Override
	public void signOut(User ýnstructor) {
		System.out.println(ýnstructor.email+" = çýkýþ yaptý" );
	}
	
	public void courseAdd(User ýnstructor) {
		System.out.println(ýnstructor.email+" = kurs ekledi" );
	}
	public void courseDelete(User ýnstructor) {
		System.out.println(ýnstructor.email+" = kursu sildi" );
	}
}
