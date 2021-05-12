package JavaGameProject.Entities;

import java.time.LocalDate;

import JavaGameProject.Abstract.ICustomerReservist;

public class Campaign extends Gamer implements ICustomerReservist {
	private int discount;
	private String campaignName;
	private LocalDate campaignEndTime;
	private LocalDate campaignExtensionDate;
	
	public Campaign(int id, int discount, String campaignName, LocalDate campaignEndTime, LocalDate campaignExtensionDate) {
		super();
		this.discount = discount;
		this.campaignName = campaignName;
		this.campaignEndTime = campaignEndTime;
		this.campaignExtensionDate = campaignExtensionDate;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public LocalDate getCampaignEndTime() {
		return campaignEndTime;
	}

	public void setCampaignEndTime(LocalDate campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}

	public LocalDate getCampaignExtensionDate() {
		return campaignExtensionDate;
	}

	public void setCampaignExtensionDate(LocalDate campaignExtensionDate) {
		this.campaignExtensionDate = campaignExtensionDate;
	}
	
}
