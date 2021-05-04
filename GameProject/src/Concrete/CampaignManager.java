package Concrete;
import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService  {
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyasi eklendi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyasi g�ncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyasi silindi.");
	}
}
