package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import business.abstracts.UserService;
import business.concretes.userManager;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users=new ArrayList<User>();
	public HibernateUserDao() {
		User user =new User(1,"Melik","KARACA","melikkrc25@gmail.com","deneme123");
		users.add(user);
	}
	@Override
	public void add(User user) {
		System.out.println("Kullanici eklendi.");
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanici silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanici güncellendi.");
		
	}

	@Override
	public User get(int id) {
		User user=users.stream()
			.filter(u ->u.getId()==id)
			.findFirst()
			.orElse(null);
			System.out.println("Kullanici adi: "+user.getFirstName());
			return user;
	}

	@Override
	public List<User> getAll() {
		for(User user:users) {
			System.out.println(user.getFirstName());
		}
		
		return this.users;
	}

	@Override
	public User getEmail(String mail) {
		User user=users.stream()
		.filter(u ->u.geteMail()==mail)
		.findFirst()
		.orElse(null);
		return user;
	}

}
