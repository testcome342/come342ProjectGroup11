package Controller;

import Helper.Database;
import Helper.Utils;
import Model.Campaign;
import Model.Client;

public class AddNewCampaignControl {
	Campaign campaign;
	Client client=new Client();
	public void showClientCampaigns(int selectedClient) {
		client.getClientCampaigns(selectedClient);
	}
	public void createNewCampaignControl(int selectedClient) {
		campaign=new Campaign();
		campaign.createCampaign(selectedClient);
		campaign=new Campaign(Database.dataClient.get(selectedClient).clientCampaign.size()+1,selectedClient,campaign.getTitle(),campaign.campaignStartDate,campaign.campaignFinishDate,campaign.estimatedCost);
		//client.addNewCampaigns(campaign);
		Database.dataClient.get(selectedClient-1).clientCampaign.add(campaign);
		Utils.printLineNumber(50);
		client.getClientCampaigns(selectedClient);
		System.out.println("Saved Successfull");
		//client.clientInformation();
	}
	
	
	public void getCampaignControl(int selectType) {
		if(selectType==2) {
			client.getClient();
		}else 
			Utils.print("Try Again");
	}
}
