import java.util.Scanner;

import business.abstracts.UserService;
import business.concretes.authManager;
import business.concretes.emailManager;
import business.concretes.userManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {
	@SuppressWarnings("kaynak")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		user.setId(1);
		user.setFirstName("Melik");
		user.setLastName("KARACA");
		user.seteMail("melikkrc25@gmail.com");
		user.setPassword("deneme123");
		
		UserService userService=new userManager(new HibernateUserDao(),new authManager(),new emailManager());
		userService.getAll();
		userService.add(user);
		
		int verificationCode=scan.nextInt();
		userService.userVerify(user, verificationCode);
		

	}

}
