package JavaGameProject.Concretes;

import JavaGameProject.Abstract.IGameService;
import JavaGameProject.Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Adl� oyun " + game.getPrice() + " sat�� fiyat�yla eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Adl� oyun " + game.getPrice() + " sat�� fiyat�yla guncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getGameName());
		
	}

}
