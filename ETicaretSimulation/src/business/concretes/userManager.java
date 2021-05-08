package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.AuthService;
import business.abstracts.EmailService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class userManager implements UserService {
	private UserDao userDao;
	private AuthService authService;
	private EmailService emailService;
	
	public userManager(UserDao userDao, AuthService authService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailService = emailService;
	}
	List<User> users=new ArrayList<User>();
	public userManager() {
		users.add((User) this.getAll());
		}

	@Override
	public void add(User user) {
		if(userCheck(user.geteMail())&&authService.validate(user)) {
			userDao.add(user);
			System.out.println("Doðrulama kodunuz mail olarak gönderildi. Kodunuz: "+emailService.mailSend());
			System.out.println("Kodunuzu giriniz : ");
			return;
		}
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		User sonuc=this.userDao.get(id);
		return sonuc;
	}

	@Override
	public List<User> getAll() {
		List<User> sonuc= this.userDao.getAll();
		return sonuc;
	}

	@Override
	public void userVerify(User user, int verificationCode) {
		int sonuc=emailService.mailSend();
		if(sonuc==verificationCode) {
			System.out.println("Kullanici dogrulandi. Uyeliginiz tamamlandi "+user.getFirstName());
		}
		else {
			System.out.println("Kodunuz yanlis!");
		}
		
	}
	public boolean userCheck(String mail) {
		if(userDao.getEmail(mail)!=null) {
			System.out.println("Kullanici zaten var.");
			return false;
		}
		else {
			return true;
			
		}
	}
	
	

}
