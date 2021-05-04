package Main;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;
public class Main {

	public static void main(String[] args) {
		
			CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
			CampaignManager campaignManager = new CampaignManager();
			OrderManager orderManager = new OrderManager();
			SalesManager salesManager = new SalesManager(orderManager);
			GameManager gameManager = new GameManager();

			//Musteri olusturuldu Mernis Kisi bilgileri dogru girildiginde calisiyor.
			Customer customer = new Customer(1, "Melik", "KARACA", "123456", 1994);
			customerManager.add(customer);

			//1.oyun olusturuldu
			Game theLastOfUs2Game = new Game(1, "The Last Of Us 2", 25.0);
			gameManager.add(theLastOfUs2Game);

			//2.oyun olusturuldu
			Game hitman3Game = new Game(2, "Hitman 3", 35.0);
			gameManager.add(hitman3Game);

			//Kampanya olusturuldu
			Campaign blackFridayCampaign = new Campaign(1, "Black Friday", 30, true);
			campaignManager.add(blackFridayCampaign);

			//Siparis olusturuldu
			Order order = new Order(1, 1, 1, 1, LocalDate.now());

			
			Game[] games = new Game[] { theLastOfUs2Game, hitman3Game };

			System.out.println("Kampanyali Senaryo");
			salesManager.buy(order, customer, games, blackFridayCampaign);

			System.out.println("Kampanyasiz Senaryo");
			salesManager.buy(order, customer, games, null);

		}

	}
