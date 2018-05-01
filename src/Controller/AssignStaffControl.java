package Controller;

import java.util.Scanner;

import Helper.Database;
import Helper.Utils;
import Model.AccountManager;
import Model.AdminStaff;
import Model.Campaign;
import Model.CreativeStaff;
import Model.StaffMember;

public class AssignStaffControl {
	Campaign campaign=new Campaign();
	StaffMember staffMember;
	Scanner scan=new Scanner(System.in);
	public void selectCampaignControl(int selectedClients,int selectCampaign) {
		campaign.selectCampaign(selectedClients,selectCampaign);
	}
	
	public void assignStaffToCampaign(int selectedClients,int selectCampaign) {
		Utils.print("   Staff Type");
		Utils.printLineNumber(50);
		Utils.print("1.Creative Staff");
		Utils.print("2.Admin Staff");
		Utils.print("3.Account Manager");
		Utils.print("Select Staff Type=>",true);
		int type=scan.nextInt();
		switch(type) {
			case 1:
				staffMember=new CreativeStaff(0,"","","");
				staffMember.assignStaff(selectedClients, selectCampaign);
				Database.dataClient.get(selectedClients-1).clientCampaign.get(selectCampaign-1).staffMemberCampaign.add(staffMember);
				String staffTypeNameCreative="Creative Staff";
				campaign.assignStaffToCampaign(selectedClients, selectCampaign,staffMember,staffTypeNameCreative);
				break;
			case 2:
				staffMember=new AdminStaff(0,"","","");
				staffMember.assignStaff(selectedClients, selectCampaign);
				Database.dataClient.get(selectedClients-1).clientCampaign.get(selectCampaign-1).staffMemberCampaign.add(staffMember);
				String staffTypeNameAdmin="Admin Staff";
				campaign.assignStaffToCampaign(selectedClients, selectCampaign,staffMember,staffTypeNameAdmin);
				break;
			case 3:
				staffMember=new AccountManager(0,"","","");
				staffMember.assignStaff(selectedClients, selectCampaign);
				Database.dataClient.get(selectedClients-1).clientCampaign.get(selectCampaign-1).staffMemberCampaign.add(staffMember);
				String staffTypeNameAccountManager="Account Manager";
				campaign.assignStaffToCampaign(selectedClients, selectCampaign,staffMember,staffTypeNameAccountManager);
				
				break;
			default:
				Utils.print("Please enter a Valid Staff Type");
				break;
		}
	}
	public void getCampaignControl(int selectedClients) {
		campaign.getCampaigns(selectedClients);
	}
		
}
