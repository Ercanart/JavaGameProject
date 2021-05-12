package JavaGameProject.Concretes;

import JavaGameProject.Abstract.ICampaignService;
import JavaGameProject.Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName() +"'"+ " y�zde " + campaign.getDiscount()
                + " indirimle " + campaign.getCampaignEndTime() + " tarihine kadar ge�erlidir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("'"+campaign.getCampaignName() + "'"+" y�zde " + campaign.getDiscount() + " indirimle "
                + campaign.getCampaignExtensionDate() + " tarihine kadar uzat�l�p g�ncellenmi�tir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName() +"'"+ " silinmistir. ");
		
		
	}

}
