package Concrete;
import Abstract.OrderService;
import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;
public class SalesManager implements SalesService {
	private OrderService orderService;

	public SalesManager(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void buy(Order order, Customer customer, Game[] games, Campaign campaign) {
		Double totalPrice = 0.0;

		System.out.println(customer.getFirstName() + " " + customer.getLastName() + "\nSepet Bilgileriniz ;\n");

		for (Game game : games) {
			System.out.println("Game ID : " + game.getId() + " --> " + game.getName() + " oyunun fiyati : "
					+ game.getPrice() + "$");
			totalPrice += game.getPrice();
		}
		System.out.println("\n\tToplam sepet tutariniz : " + totalPrice + "$\n");

		if (campaign != null) {
			calculate(campaign, totalPrice);
		}

		orderService.add(order);
	}

	private void calculate(Campaign campaign, Double totalPrice) {
		System.out.println(campaign.getName() + " kampanyasindan %" + campaign.getDiscount() + " indirim ile "
				+ totalPrice + "$ fiyatindan güncel sepet tutariniz : --> "
				+ (totalPrice * (100 - campaign.getDiscount()) / 100) + "$ <--\n");
	}

}
