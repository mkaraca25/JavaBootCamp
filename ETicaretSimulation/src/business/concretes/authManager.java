package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.UserService;
import business.abstracts.AuthService;
import core.utilities.BusinessRules;
import entities.concretes.User;

public class authManager implements AuthService {
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX=
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
	@Override
	public boolean validate(User user) {
		boolean sonuc=BusinessRules.Run(ifPasswordCheckLength(user),
				ifFirstNameCheckLength(user),
				ifLastNameCheckLength(user),
				ifEmailFormatCheckValid(user));
		return sonuc;
	}
	private boolean ifPasswordCheckLength(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakter olmali");
			return false;
		}
		return true;
	}
	private boolean ifFirstNameCheckLength(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("isminiz en az 2 karakterli olmali. ");
			return false;
		}
		return true;
	}
	private boolean ifLastNameCheckLength(User user) {
		if(user.getLastName().length()<2) {
			System.out.println("Soyadiniz en az 2 karakterli olmali. ");
			return false;
		}
		return true;	
	}
	private boolean ifEmailFormatCheckValid(User email) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(email.geteMail()).find();
	}

	@Override
	public boolean login(User user) {
		boolean sonuc= BusinessRules.Run(isFirstandLastNameEmpty(user));
		return sonuc;
	}
	private boolean isFirstandLastNameEmpty(User user) {
		if(user.geteMail()==null||user.getPassword()==null) {
			System.out.println("email veya password eksik girildi.");
			return false;
		}
		System.out.println("giris yapildi.");
		return true;
	}
	

}
