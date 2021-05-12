package JavaGameProject.Abstract;

import JavaGameProject.Entities.Gamer;

public abstract class BaseCustomerManager implements IGamerService  {

	@Override
	public void register(Gamer gamer) {
		System.out.println("Oyuncu kaydedildi : " + gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu update edildi : " + gamer.getFirstName());
		
	}
	
	
}

//System.out.println("Oyuncu kaydedildi : " + gamer.getDateOfBirth());
//System.out.println("Oyuncu update edildi : " + gamer.getFirstName());
//System.out.println("Oyuncu silindi : " + gamer);
