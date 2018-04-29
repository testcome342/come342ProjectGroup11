package Model;
import java.util.ArrayList;
import java.util.Scanner;
import Helper.Database;
import Helper.Utils;

public class Campaign {
	private int clientID;
	private int campaignID;
	public String title;
	public String campaignStartDate;
	public String campaignFinishDate;
	public double estimatedCost;
	public Client client=new Client();
	public ArrayList<Client> dataClient=new ArrayList<Client>();
	public ArrayList<StaffMember> staffMemberCampaign=new ArrayList<StaffMember>();
	Scanner scan=new Scanner(System.in);


	public Campaign() {
		super();
	}
	
	
	public Campaign(int campaignID,int clientID,String title, String campaignStartDate, String campaignFinishDate, double estimatedCost) {
		super();
		
		this.campaignID=campaignID;
		this.clientID=clientID;
		this.title = title;
		this.campaignStartDate = campaignStartDate;
		this.campaignFinishDate = campaignFinishDate;
		this.estimatedCost = estimatedCost;
		this.staffMemberCampaign=new ArrayList<StaffMember>();
	}
	
	
	public int getCampaignID() {
		return campaignID;
	}
	
	
	public void setCampaignID(int campaignID) {
		this.campaignID = campaignID;
	}
	
	
	public int getClientID() {
		return clientID;
	}
	
	
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getCampaignStartDate() {
		return campaignStartDate;
	}
	
	
	public void setCampaignStartDate(String campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	
	
	public String getCampaignFinishDate() {
		return campaignFinishDate;
	}
	
	
	public void setCampaignFinishDate(String campaignFinishDate) {
		this.campaignFinishDate = campaignFinishDate;
	}
	
	
	public double getEstimatedCost() {
		return estimatedCost;
	}
	
	
	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	public ArrayList<StaffMember> getStaffMemberCampaign() {
		return staffMemberCampaign;
	}
	
	
	public void setStaffMemberCampaign(ArrayList<StaffMember> staffMemberCampaign) {
		this.staffMemberCampaign = staffMemberCampaign;
	}
	
	
	public Campaign createCampaign(int selectedClient) {
		
		String campaignTitle,campaignStartDate,campaignFinishDate;
		double estimatedCost;
		
		System.out.print("Campaign Title.:");
		campaignTitle=scan.nextLine();
		setTitle(campaignTitle);
		System.out.print("Campaign Start Date..:");
		campaignStartDate=scan.nextLine();
		setCampaignStartDate(campaignStartDate);
		System.out.print("Campaign Finish Date..:");
		campaignFinishDate=scan.nextLine();
		setCampaignFinishDate(campaignFinishDate);
		System.out.print("Estimated Cost..:");
		estimatedCost=scan.nextDouble();
		setEstimatedCost(estimatedCost);
		Campaign campaigns=new Campaign(client.clientCampaign.size()+1,selectedClient,campaignTitle,campaignStartDate,campaignFinishDate,estimatedCost);
		
		return campaigns;
	}

	public void getCampaign() {
		
		for(int i=0;i<Database.dataCampaign.size();i++) {
			if(i<=Database.dataCampaign.size()) {
				System.out.println(Database.dataCampaign.get(i).getTitle());
			}else if(i>Database.dataCampaign.size())
			{
				break;
			}
		}
	}
	public void getCampaigns(int selectedClients) {
		for(int i=0;i<Database.dataClient.size();i++) {
			if(i+1==selectedClients) {
				for(int j=0; j<Database.dataClient.get(i).clientCampaign.size();j++) {
					Utils.print(String.valueOf(Database.dataClient.get(i).clientCampaign.get(j).getTitle()));
				}
			}
			
		}
	}
	public void selectCampaign(int selectedClients,int selectCampaign) {
		for(int i=0;i<Database.dataClient.size();i++) {
			if(i+1==selectedClients) {
				for(int j=0;i<Database.dataClient.get(i).clientCampaign.size();j++) {
					if(j+1==selectCampaign) {
						Utils.print(Database.dataClient.get(i).clientCampaign.get(j).getTitle());
						break;
					}
				}
				break;
			}
		}
	}
	public void assignStaffToCampaign(int selectedClients,int selectCampaign,StaffMember staff,String staffType) {
		for(int i=0;i<Database.dataClient.size();i++) {
			if(i+1==selectedClients) {
				for(int j=0;i<Database.dataClient.get(i).clientCampaign.size();j++) {
					if(j+1==selectCampaign) {
						this.staffMemberCampaign.add(staff);
						Utils.printLineNumber(50);
						Utils.print("   STAFF INFORMATION");
						Utils.printLineNumber(50);
						Utils.print("Company  Name..:"+Database.dataClient.get(selectedClients-1).getCompanyName());
						Utils.printLineNumber(50);
						Utils.print("Campaign Name..:"+Database.dataClient.get(selectedClients-1).clientCampaign.get(selectCampaign-1).getTitle());
						Utils.printLineNumber(50);
						Utils.print("Staff    Type..:"+staffType);
						Utils.printLineNumber(50);
						for(int k=0;k<Database.dataClient.get(i).clientCampaign.get(j).staffMemberCampaign.size();k++) {
							staffMemberCampaign.get(k);
							Utils.print(""+StaffMember.getStaffNo());
							Utils.print(""+staffMemberCampaign.get(k).getStaffName());
							Utils.print(""+staffMemberCampaign.get(k).getStaffStartDate());
							Utils.print(""+staffMemberCampaign.get(k).getStaffEmailAdress());
						}
						break;
					}
				}
				break;
			}
		}
	}
}


