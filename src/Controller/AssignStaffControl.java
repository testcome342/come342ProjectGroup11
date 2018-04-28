package Controller;

import Model.Campaign;

public class AssignStaffControl {
	Campaign campaign=new Campaign();
	public void selectCampaignControl(int selectCampaign) {
		campaign.selectCampaign(selectCampaign);
	}
	
	public void assignStaffToCampaign() {
			
	}
	public void getCampaignControl() {
	
		campaign.getCampaigns();
	}
		
}
