package javaKampHafta3Odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ " Ba�ar�yla eklenmi�tir.");
	}
	public void list(User user) {
		System.out.println(user.getFirstName()+ " Ba�ar�yla listelendi.");
	}
	public void addMultiple(User[] users) {
		
		for(User user:users) {
			add(user);
		}
	}
}
