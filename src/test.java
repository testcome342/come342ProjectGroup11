import java.util.Scanner;

import UI.AddNewMemberofStaffUI;
import UI.AddNewClientUI;
import UI.AssignStaffUI;
import UI.AddNewAdvertToCampaignUI;
import UI.AddNewCampaignUI;
import Helper.Database;
import Helper.Utils;
import Model.Client;

public class test{
	static AddNewClientUI clientUI=new AddNewClientUI();
	static AddNewCampaignUI campaignUI=new AddNewCampaignUI();
	static AssignStaffUI staffUI=new AssignStaffUI();
	static AddNewAdvertToCampaignUI advertUI=new AddNewAdvertToCampaignUI();
	static AddNewMemberofStaffUI staffMemberUI=new AddNewMemberofStaffUI();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int selectType;
		Database.fakeData();
		
		
		Utils.printLineNumber(50);
		Utils.print("|                                                |");
		Utils.print("|                   AGATE LTD                    |");
		Utils.print("|                                                |");
		
		//Menu UI
		Utils.printLineNumber(50);
		Utils.print("|     1-  Add a new client                       |");
		Utils.print("|     2-  Add a new campaign                     |");
		Utils.print("|     5-  Assign staff to work on a campaign     |");
		Utils.print("|     11- Add a new advert to a campaign         |");
		Utils.print("|     12- Add a new member of staff              |");
		Utils.print("|     0 - Exit                                   |");
		Utils.printLineNumber(50);
	
		Utils.print("Select a transaction type => ", true);
		selectType = scan.nextInt();
		Utils.printLineNumber(50);
			
		switch(selectType) {
			case 1:
				Utils.print("|                  Client List                   |");
				Utils.printLineNumber(50);
				clientUI.startInterfaceUI(1);
				Utils.printLineNumber(50);
				Utils.print("|                  Add a new Client              |");
				Utils.printLineNumber(50);
				clientUI.createNewClientUI();
				Utils.printLineNumber(50);
				Utils.print("|                  Client List                   |");
				Utils.printLineNumber(50);
				clientUI.startInterfaceUI(1);
				Utils.printLineNumber(50);
				break;
			case 2:
				Utils.print("|                  Client List                   |");
				Utils.printLineNumber(50);
				campaignUI.startInterfaceUI(2);
				Utils.printLineNumber(50);
				Utils.print("Select Client => ",true);
				int selectedClient=scan.nextInt();
				if(!(selectedClient<1)&&!(selectedClient>Database.dataClient.size())) {
					campaignUI.selectClientUI(selectedClient);
					Utils.print("|                  Add a new Campaign            |");
					Utils.printLineNumber(50);
					campaignUI.createNewCampaignUI(selectedClient);	
				}else {
					Utils.print("Please try again!!!");
				}
				
				break;
			case 5:
				Utils.print("|                  Client List                   |");
				Utils.printLineNumber(50);
				campaignUI.startInterfaceUI(2);
				Utils.printLineNumber(50);
				Utils.print("Select Client => ",true);
				int selectedClientsForCampaign=scan.nextInt();
				if(!(selectedClientsForCampaign<1)&&!(selectedClientsForCampaign>Database.dataClient.size())) {
					Utils.printLineNumber(50);
					staffUI.startInterface(selectedClientsForCampaign);
					Utils.printLineNumber(50);
					Utils.print("|                  Campaign List                 |");
					Utils.print("Select Campaign => ",true);
					int selectedCampaign=scan.nextInt();
					if(!(selectedCampaign<1)&&!(selectedCampaign>Database.dataClient.get(selectedClientsForCampaign).clientCampaign.size())) {
						staffUI.selectCampaignUI(selectedClientsForCampaign,selectedCampaign);
						Utils.print("|                  Assign Staff To Campaign      |");
						Utils.printLineNumber(50);
						staffUI.assignStaffToCampaignUI(selectedClientsForCampaign,selectedCampaign);		
					}else {
						Utils.print("Wrong Campaign Details...");
					}
				}else {
					Utils.print("Wrong Client Selected....");
				}

				
				break;
			case 11:
				Utils.print("|                  Client List                   |");
				Utils.printLineNumber(50);
				campaignUI.startInterfaceUI(2);
				Utils.printLineNumber(50);
				Utils.print("Select Client => ",true);
				int selectedClientsForAdvert=scan.nextInt();
				if(!(selectedClientsForAdvert<1)&&!(selectedClientsForAdvert>Database.dataClient.size())) {
					Utils.printLineNumber(50);
					staffUI.startInterface(selectedClientsForAdvert);
					Utils.printLineNumber(50);
					Utils.print("|                  Campaign List                 |");
					Utils.print("Select Campaign => ",true);
					int selectedCampaignForAdvert=scan.nextInt();
					if(!(selectedCampaignForAdvert<1)&&!(selectedCampaignForAdvert>Database.dataClient.get(selectedClientsForAdvert).clientCampaign.size())) {	
						staffUI.selectCampaignUI(selectedClientsForAdvert,selectedCampaignForAdvert);
						Utils.print("|                  Add a new Advert              |");
						Utils.printLineNumber(50);
						advertUI.addNewAdvertToCampaignUI(selectedClientsForAdvert, selectedCampaignForAdvert);
					}else {
						Utils.print("Wrong Select Campaign");
					}
				}else {
					Utils.print("Wrong Select Client");
				}

				
				
				
				break;
			case 12:
				Utils.print("|    Staff Type   |");
				Utils.printLineNumber(19);
				Utils.print("|1.Creative Staff |");
				Utils.print("|2.Admin    Staff |");
				Utils.printLineNumber(50);
				Utils.print("Selected Staff Type =>",true);
				int selectStaffType=scan.nextInt();
				if(!(selectStaffType<1)&&!(selectStaffType>2)) {
					Utils.print("|                  Staff Member List             |");
					Utils.printLineNumber(50);
					staffMemberUI.startInterfaceUI(selectStaffType);
					Utils.printLineNumber(50);
					staffMemberUI.addNewMemberofStaffUI(selectStaffType);
					Utils.printLineNumber(50);
					
					staffMemberUI.startInterfaceUI(selectStaffType);
				}else {
					Utils.print("Wrong Staff Type Value.Try Again! ");
				}

				
				break;
			case 0:
				System.exit(0);	
				break;
			default:
				Utils.print("You entered wrong value.Please restart program and valid vaule => 1-2-5-11-12");

				break;
					
		}
	}	
}
