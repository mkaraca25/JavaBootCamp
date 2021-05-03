import java.sql.Date;

import java.sql.Date;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Melik");
		customer.setLastName("KARACA");
		customer.setDateOfBirth(1994,3,17);
		customer.setNationalityId("458721");
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
    }
}