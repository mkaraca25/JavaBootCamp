package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " Musteri eklendi.");
		} else {
			System.out.println(customer.getNationalityId() + "  Musteri eklenemedi. Dogrulama basarýsýz.");
		}
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " Musteri güncellendi.");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " Musteri silindi.");

	}
}
