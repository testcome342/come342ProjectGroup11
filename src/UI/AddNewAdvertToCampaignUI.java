package UI;

import Controller.AddNewAdvertToCampaignControl;


public class AddNewAdvertToCampaignUI {
		AddNewAdvertToCampaignControl advertControl=new AddNewAdvertToCampaignControl();
	
		public void startInterface(int selectedCampaign) {
		
	}
		
		public void selectCampaignUI(int selectedClients,int selectCampaign) {
			advertControl.selectCampaignControl(selectedClients,selectCampaign);
			}

		public void addNewAdvertToCampaignUI(int selectedClient,int selectedCampaign) {
			advertControl.addNewAdvert(selectedClient, selectedCampaign);
		}
}
