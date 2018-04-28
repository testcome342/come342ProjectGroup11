package Controller;

import Model.Campaign;

public class AssignStaffControl {
	Campaign campaign=new Campaign();
	
	public void selectCampaignControl(int selectedClients,int selectCampaign) {
		campaign.selectCampaign(selectedClients,selectCampaign);
	}
	
	public void assignStaffToCampaign() {
			
	}
	public void getCampaignControl(int selectedClients) {
		campaign.getCampaigns(selectedClients);
	}
		
}
