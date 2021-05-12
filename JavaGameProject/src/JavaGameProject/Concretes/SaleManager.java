package JavaGameProject.Concretes;

import JavaGameProject.Abstract.ISaleService;
import JavaGameProject.Entities.Campaign;
import JavaGameProject.Entities.Game;
import JavaGameProject.Entities.Gamer;

public class SaleManager implements ISaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() + " adl� kullan�c�, "
                +"'"+ game.getGameName() +"'"+ " adl� oyunu " + game.getPrice() + "TL fiyata sat�n alm��t�r. ");
		
	}
	int discountedPrice;
	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		discountedPrice = game.getPrice() - ((game.getPrice() * campaign.getDiscount()) / 100);
        System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() + " adl� kullan�c�, " + "'"+campaign.getCampaignName()+"'"
            + " kampanyas�ndan yararlanarak, " + "'"+game.getGameName()+"'" + " adl� oyunu y�zde "
            + campaign.getDiscount() + " indirimle, " + discountedPrice + "TL fiyata sat�n alm��t�r.");
		
	}

}
