package javaKampHafta3Odev2;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" Ba�ar�yla eklendi.");
	}
	public void list(User user) {
		System.out.println(user.getFirstName()+" Ba�ar�yla listelendi.");
	}

}
