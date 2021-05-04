package Abstract;

import Entities.Customer;

public interface CustomerService {
	public void add(Customer customer);

	public void update(Customer customer);

	public void delete(Customer customer);
}
