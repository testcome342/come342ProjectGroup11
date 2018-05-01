package Model;
import java.util.ArrayList;

import java.util.Scanner;
import Helper.Database;
import Helper.Utils;


public class Client {
	public int clientID;
	public String companyName;
	public String companyAddress;
	public String companyEmail;
	public String contactName;
	public String contactEmail;
	public ArrayList<Campaign> clientCampaign=new ArrayList<Campaign>();
	static Client client=new Client();
	public Campaign campaign;
	Scanner scan=new Scanner(System.in);
	int campaignNumber;
	
	
	public Client() {
		super();
	}
	
	
	public Client(int clientID,String companyName, String companyAddress, String companyEmail, String contactName,
			String contactEmail) {
		super();
		this.clientID=clientID;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.clientCampaign = new ArrayList<Campaign>();
	}
	public Client(String companyName, String companyAddress, String companyEmail, String contactName,
			String contactEmail) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.clientCampaign = new ArrayList<Campaign>();
	}


	/*public Client(int clientID,String companyName, String companyAddress, String companyEmail, String contactName,
			String contactEmail, Campaign clientCampaigns) {
		super();
		this.clientID=clientID;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.clientCampaign.add(clientCampaigns);
	}*/
  
	

	public int getClientID() {
		return clientID;
	}


	public void setClientID(int clientID) {
		this.clientID = clientID;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyAddress() {
		return companyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}


	public String getCompanyEmail() {
		return companyEmail;
	}


	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	public ArrayList<Campaign> getClientCampaign() {
		return clientCampaign;
	}


	public void setClientCampaign(ArrayList<Campaign> clientCampaign) {
		this.clientCampaign = clientCampaign;
	}


	public void createClient() {
		
		client.setClientID(Database.dataClient.size()+1);
		System.out.print("Company Name..:");
		client.setCompanyName(scan.nextLine());
		
		System.out.print("Company Address..:");
		client.setCompanyAddress(scan.nextLine());
		
		System.out.print("Company Email..:");
		client.setCompanyEmail(scan.nextLine());
		
		System.out.print("Contact Name..:");
		client.setContactName(scan.nextLine());
		
		System.out.print("Contact Email..:");
		client.setContactEmail(scan.nextLine());
		
		
		Utils.print("..!!Saved Successfull!!..");
		
		Utils.printLineNumber(50);
		Utils.print("|Campaign Type..:     |");
		Utils.print("|1.New Campaign       |");
		Utils.print("|2.Recorded Campaign  |");
		Utils.printLineNumber(50);
		Utils.print("Select Campaign Type..:",true);
		int campaignType=scan.nextInt();
		switch(campaignType) {
			case 1:
				Utils.printLineNumber(50);
				campaign=new Campaign();
				client=new Client(Database.dataClient.size()+1,client.getCompanyName(),client.getCompanyAddress(),client.getCompanyName(),client.getContactName(),client.getContactEmail());
				campaign.createCampaign(client.clientID);
				campaign=new Campaign(clientCampaign.size()+1,client.clientID,campaign.getTitle(),campaign.campaignStartDate,campaign.campaignFinishDate,campaign.estimatedCost);
				client.addNewCampaigns(campaign);
				Database.dataClient.add(client);
				Utils.printLineNumber(50);
				client.getClientCampaigns(client.clientID);
				System.out.println("Saved Successfull");
				client.clientInformation();
				break;
			case 2:
				Utils.printLineNumber(50);
				client.addNewCampaign();
				client.clientInformation();
				break;
			default: 
				Utils.print("Please enter write value...");	
				break;
		}
		
		
		
	}
	public void addNewCampaign() {
		
		Utils.print("|                   Campaign List                |");
		Utils.printLineNumber(50);
		Database.fakeDataCampaign();
		campaign=new Campaign();
		campaign.getCampaign();
		Utils.printLineNumber(50);
		System.out.print("Select a Campaign for "+ client.getCompanyName()+"..:");
		
		campaignNumber=scan.nextInt();
		
		for(int i=0;i<Database.dataCampaign.size();i++)
		{
			if(campaignNumber==i+1) {
				campaign=new Campaign(Database.dataCampaign.size()+1,client.clientID,Database.dataCampaign.get(i).getTitle(),Database.dataCampaign.get(i).getCampaignStartDate(),Database.dataCampaign.get(i).getCampaignFinishDate(),Database.dataCampaign.get(i).getEstimatedCost());
				client.addNewCampaigns(campaign);
				Database.dataClient.add(client);
				//database.dataClient.get(0).clientCampaign.add();
			
			}
		}
		
	}
	public void addNewCampaigns(Campaign campaign) {
		this.clientCampaign.add(campaign);
	}
	public void getClient() {
		for(int i=0;i<Database.dataClient.size();i++) {
				System.out.println(Database.dataClient.get(i).getClientID()+"."+Database.dataClient.get(i).getCompanyName());
		}
	}
	public void clientInformation() {
		System.out.println("               Client Information          ");
		Utils.printLineNumber(50);
		for	(int i=0;i<Database.dataClient.size();i++) {
			Utils.print(Database.dataClient.get(i).companyName+"    Company Information   ");
			Utils.printLineNumber(50);
			Utils.print("Company Name..:"+Database.dataClient.get(i).companyName +"\n"+
					"Company Address..:"+Database.dataClient.get(i).companyAddress +"\n"+
					"Company Email..:"+Database.dataClient.get(i).companyEmail+ "\n"+
					"Contact Name..:"+Database.dataClient.get(i).contactName +"\n"+
					"Contact Email..:"+Database.dataClient.get(i).contactEmail+"\n");
			Utils.print("              Client Campaigns               ");
			Utils.printLineNumber(50);
			for(int j=0;j<Database.dataClient.get(i).clientCampaign.size();j++) {
				if(Database.dataClient.get(i).clientCampaign.get(j).getClientID()==Database.dataClient.get(i).getClientID()) {
					Utils.print("Campaign Title..:"+Database.dataClient.get(i).clientCampaign.get(j).getTitle()+"\n"+
						"Campaign Start Date..:"+Database.dataClient.get(i).clientCampaign.get(j).getCampaignStartDate()+"\n"+
						"Campaign Finish Date..:"+Database.dataClient.get(i).clientCampaign.get(j).getCampaignFinishDate()+"\n"+
						"Campaign Estimated Cost..:"+Database.dataClient.get(i).clientCampaign.get(j).getEstimatedCost()+"\n");
						
				}else{
					Utils.print("There is No Campaign...");
					System.out.println("");
					break;
				}
				
			}
						
		}
		
	}
	public void getClientCampaigns(int selectedClient) {
		for(int i=0;i<Database.dataClient.size();i++) {
			if(i+1==selectedClient) {
				Utils.print("               "+Database.dataClient.get(i).getCompanyName()+ " Company Campaigns");
				Utils.printLineNumber(50);
				for(int j=0; j<Database.dataClient.get(i).clientCampaign.size();j++) {
					if(Database.dataClient.get(i).clientCampaign.get(j).getClientID()==selectedClient) {
						Utils.print(Database.dataClient.get(i).clientCampaign.get(j).getTitle());	
					}	
				}
				
			}
		}
	}
}
