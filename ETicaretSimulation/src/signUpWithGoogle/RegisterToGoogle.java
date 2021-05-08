package signUpWithGoogle;

public class RegisterToGoogle {
	public boolean register(int id,String firstName,String LastName,String email,String password) {
		if(firstName.length()>6&&LastName.length()>6&&email.length()>6&&password.length()>6) {
			return true;
		}
		return false;
	}
}
