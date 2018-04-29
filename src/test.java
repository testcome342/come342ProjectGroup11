import java.util.Scanner;
import UI.AddNewClientUI;
import UI.AssignStaffUI;
import UI.AddNewCampaignUI;
import Helper.Database;
import Helper.Utils;
import Model.Client;

public class test{
	static AddNewClientUI clientUI=new AddNewClientUI();
	static AddNewCampaignUI campaignUI=new AddNewCampaignUI();
	static AssignStaffUI staffUI=new AssignStaffUI();

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
				campaignUI.selectClientUI(selectedClient);
				Utils.print("|                  Add a new Campaign            |");
				Utils.printLineNumber(50);
				campaignUI.createNewCampaignUI(selectedClient);
				break;
			case 5:
				Utils.print("|                  Client List                   |");
				Utils.printLineNumber(50);
				campaignUI.startInterfaceUI(2);
				Utils.printLineNumber(50);
				Utils.print("Select Client => ",true);
				int selectedClientsForCampaign=scan.nextInt();
				Utils.printLineNumber(50);
				staffUI.startInterface(selectedClientsForCampaign);
				Utils.printLineNumber(50);
				Utils.print("|                  Campaign List                 |");
				Utils.print("Select Campaign => ",true);
				int selectedCampaign=scan.nextInt();
				staffUI.selectCampaignUI(selectedClientsForCampaign,selectedCampaign);
				Utils.print("|                  Assign Staff To Campaign      |");
				Utils.printLineNumber(50);
				staffUI.assignStaffToCampaignUI(selectedClientsForCampaign,selectedCampaign);
				break;
			case 11:

				break;
			case 12:

				break;
			case 0:
				System.exit(0);
		}
	}	
}
