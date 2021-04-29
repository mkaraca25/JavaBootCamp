package javaKampHafta3Odev2;

public class Student extends User{
	int completingPercentage;
	public Student() {
		
	}
	public Student(String firstName, String lastName, String address, String email, int userId,int completingPercentage) {
		super();
		this.completingPercentage = completingPercentage;
	}
	public int getCompletingPercentage() {
		return completingPercentage;
	}
	public void setCompletingPercentage(int completingPercentage) {
		this.completingPercentage = completingPercentage;
	}
	
	

}
