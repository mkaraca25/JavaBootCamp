package core.adapters;

import business.abstracts.AuthService;
import signUpWithGoogle.RegisterToGoogle;
import core.utilities.BusinessRules;
import entities.concretes.User;

public class GoogleManager implements AuthService {
	RegisterToGoogle registerToGoogle=new RegisterToGoogle();
	
	@Override
	public boolean validate(User user) {
		boolean sonuc= false;
		sonuc=registerToGoogle.register(user.getId(),user.getFirstName(),user.getLastName(),user.geteMail(),
				user.getPassword());
		if(sonuc!=true) {
			return false;
		}
		System.out.println("Kayit olundu.");
		return true;
	}

	@Override
	public boolean login(User user) {
		boolean sonuc=BusinessRules.Run(isFirstandLastNameEmpty(user));
		
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
