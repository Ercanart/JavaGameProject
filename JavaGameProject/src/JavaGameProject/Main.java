package JavaGameProject;

import java.time.LocalDate;

import JavaGameProject.Abstract.BaseCustomerManager;
import JavaGameProject.Adapter.MernisServiceAdapter;
import JavaGameProject.Concretes.CampaignManager;
import JavaGameProject.Concretes.GamerManager;
import JavaGameProject.Concretes.SaleManager;
import JavaGameProject.Entities.Campaign;
import JavaGameProject.Entities.Game;
import JavaGameProject.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new GamerManager(new MernisServiceAdapter());
		customerManager.register(new Gamer(1,"Engin","Demiroð",LocalDate.of(1985, 01, 06),"28861499108"));
		customerManager.register(new Gamer(1,"Engin","Demiroð",LocalDate.of(1990, 01, 06),"28861499108"));
		
		Gamer gamer1 = new Gamer(1,"Haldun", "Tekbudak", LocalDate.of(1990, 2, 7),"345676567895");
		Gamer gamer2 = new Gamer(2,"Anýl", "Yücesan", LocalDate.of(2007, 2, 7),"345676567895");
		
		Game game1 = new Game(3,"God Of War",100,"Aksiyon");
		Game game2 = new Game(4,"AgeOf Empires 2",80,"Strateji");
		
		Campaign campaign1 = new Campaign(5,20,"Pandemi Kampanyasý", LocalDate.of(2021, 6, 20), LocalDate.of(2021, 7, 20));
		Campaign campaign2 = new Campaign(6,20,"Öðrenci Ýndirimi", LocalDate.of(2021, 8, 30), LocalDate.of(2021, 9, 30));
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer1, game1);
		saleManager.campaignSale(gamer2, game2, campaign2);
	}

}
