package javaKampHafta3Odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ " Başarıyla eklenmiştir.");
	}
	public void list(User user) {
		System.out.println(user.getFirstName()+ " Başarıyla listelendi.");
	}
	public void addMultiple(User[] users) {
		
		for(User user:users) {
			add(user);
		}
	}
}
