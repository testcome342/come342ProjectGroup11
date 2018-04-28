package UI;

import Controller.AddNewCampaignControl;
import Controller.AddNewClientControl;

import Helper.Utils;

public class AddNewCampaignUI {
	AddNewCampaignControl campaignControl =new AddNewCampaignControl();
	AddNewClientControl clientControl =new AddNewClientControl();

	public void startInterfaceUI(int selectType) {
		if (selectType==2) {
			clientControl.getClientControl(1);

		}else if (selectType==0) {
			Utils.print("Try Again..");
		}
	}
	public void selectClientUI(int selectedClient) {
		campaignControl.showClientCampaigns(selectedClient);
	}
	
	public void createNewCampaignUI(int selectedClient) {
		campaignControl.createNewCampaignControl(selectedClient);
	}	
}
