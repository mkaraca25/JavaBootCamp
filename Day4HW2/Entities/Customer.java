
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Customer  {
    int id;
	String firstName;
	String lastName;
	Date dateOfBirth;
	String nationalityId;
    public Customer(){
    }
    public Customer(int id, String firstName, String lastName, int i) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth=dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getNationalityId() {
        return nationalityId;
    }
    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

}