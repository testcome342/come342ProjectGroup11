package UI;

import Controller.AssignStaffControl;

public class AssignStaffUI {
	AssignStaffControl staffControl=new AssignStaffControl();
	

	public void startInterface(int selectedClients) {
		staffControl.getCampaignControl(selectedClients);
		
		
	}
	public void selectCampaignUI(int selectedClients,int selectCampaign) {
		staffControl.selectCampaignControl(selectedClients,selectCampaign);
	}
	
	public void assignStaffToCampaignUI(int selectedClients,int selectCampaign) {
		staffControl.assignStaffToCampaign(selectedClients,selectCampaign);
	}
	
	
}
