package javaKampHafta3Odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setUserId(1);
		instructor.setFirstName("Melik");
		instructor.setLastName("KARACA");
		instructor.setAddress("Erzurum");
		instructor.setDetails("Bilgisayar Mühendisliği");
		instructor.setEmail("melikkrc25@gmail.com");
		
		Student student=new Student();
		student.setUserId(2);
		student.setFirstName("Murat");
		student.setLastName("yücedağ");
		student.setAddress("Ankara");
		student.setEmail("myucadag@edu.tr");
		student.setCompletingPercentage(25);
		
		User[] users= {student,instructor};
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.list(instructor);
		UserManager userManager=new UserManager();
		userManager.addMultiple(users);
		
	}

}
