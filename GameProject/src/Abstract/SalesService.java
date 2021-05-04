package Abstract;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public interface SalesService {
	public void buy(Order order, Customer customer, Game[] games, Campaign campaign);
}
