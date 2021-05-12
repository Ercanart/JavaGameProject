package JavaGameProject.Abstract;

import JavaGameProject.Entities.Campaign;
import JavaGameProject.Entities.Game;
import JavaGameProject.Entities.Gamer;

public interface ISaleService {
	void sale(Gamer gamer, Game game);  
    void campaignSale(Gamer gamer, Game game, Campaign campaign);
}
