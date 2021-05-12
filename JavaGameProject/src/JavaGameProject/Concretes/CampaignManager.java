package JavaGameProject.Concretes;

import JavaGameProject.Abstract.ICampaignService;
import JavaGameProject.Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName() +"'"+ " yüzde " + campaign.getDiscount()
                + " indirimle " + campaign.getCampaignEndTime() + " tarihine kadar geçerlidir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("'"+campaign.getCampaignName() + "'"+" yüzde " + campaign.getDiscount() + " indirimle "
                + campaign.getCampaignExtensionDate() + " tarihine kadar uzatýlýp güncellenmiþtir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName() +"'"+ " silinmistir. ");
		
		
	}

}
