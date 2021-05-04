package Abstract;
import Entities.Order;
public interface OrderService {
	public void add(Order order);

	public void update(Order order);

	public void delete(Order order);
}
