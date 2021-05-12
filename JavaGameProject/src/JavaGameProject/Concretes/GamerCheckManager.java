package JavaGameProject.Concretes;

import JavaGameProject.Abstract.IGamerCheckService;
import JavaGameProject.Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		
		return true;
	}

}
