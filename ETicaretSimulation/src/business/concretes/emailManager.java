package business.concretes;

import java.util.Random;

import business.abstracts.EmailService;

public class emailManager implements EmailService{
	int verificationCode;
	public emailManager() {
		Random kod=new Random();
		this.verificationCode=kod.nextInt(1000)*10;
	}
	@Override
	public int mailSend() {
		
		return 0;
	}

}
