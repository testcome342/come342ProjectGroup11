package UI;

import Controller.AssignStaffControl;

public class AssignStaffUI {
	AssignStaffControl staffControl=new AssignStaffControl();
	

	public void startInterface() {
		staffControl.getCampaignControl();
		
		
	}
	public void selectCampaignUI(int selectCampaign) {
	staffControl.selectCampaignControl(selectCampaign);
	}
	
	public void assignStaffToCampaignUI() {
		
	}
	
	
}
