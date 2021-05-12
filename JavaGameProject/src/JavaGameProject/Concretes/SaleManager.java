package JavaGameProject.Concretes;

import JavaGameProject.Abstract.ISaleService;
import JavaGameProject.Entities.Campaign;
import JavaGameProject.Entities.Game;
import JavaGameProject.Entities.Gamer;

public class SaleManager implements ISaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() + " adlý kullanýcý, "
                +"'"+ game.getGameName() +"'"+ " adlý oyunu " + game.getPrice() + "TL fiyata satýn almýþtýr. ");
		
	}
	int discountedPrice;
	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		discountedPrice = game.getPrice() - ((game.getPrice() * campaign.getDiscount()) / 100);
        System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() + " adlý kullanýcý, " + "'"+campaign.getCampaignName()+"'"
            + " kampanyasýndan yararlanarak, " + "'"+game.getGameName()+"'" + " adlý oyunu yüzde "
            + campaign.getDiscount() + " indirimle, " + discountedPrice + "TL fiyata satýn almýþtýr.");
		
	}

}
