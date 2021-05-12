package JavaGameProject.Concretes;

import JavaGameProject.Abstract.BaseCustomerManager;
import JavaGameProject.Abstract.IGamerCheckService;
import JavaGameProject.Entities.Gamer;

public class GamerManager extends BaseCustomerManager {
	
	public GamerManager(IGamerCheckService _gamerCheckService) {
	
		this._gamerCheckService = _gamerCheckService;
	}

	private IGamerCheckService _gamerCheckService;
	
	@Override
	public void register(Gamer gamer) {
		if (_gamerCheckService.checkIfRealGamer(gamer)) {
			super.register(gamer);
		}else {
			System.out.println("Not a vaild person");
		}			
	}

}
