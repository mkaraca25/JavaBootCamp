package javaKampHafta3Odev2;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" Baþarýyla eklendi.");
	}
	public void remove(User user) {
		System.out.println(user.getFirstName()+" Baþarýyla silindi.");
	}
}
