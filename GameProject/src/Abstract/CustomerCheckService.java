package Abstract;

import Entities.Customer;

public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);
}
