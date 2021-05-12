package JavaGameProject.Entities;

import JavaGameProject.Abstract.ICustomerReservist;

public class Game extends Gamer implements ICustomerReservist {
	private String gameName;
	private int price;
	private String description;
	
	public Game() {}
	
	public Game(int id, String gameName, int price, String description) {
		super();
		this.gameName = gameName;
		this.price = price;
		this.description = description;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
