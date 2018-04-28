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
	static Database database=new Database();
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
		client.setClientID(database.dataClient.size()+1);
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
		if(campaignType==1) {
			Utils.printLineNumber(50);
			campaign=new Campaign();
			client=new Client(database.dataClient.size()+1,client.getCompanyName(),client.getCompanyAddress(),client.getCompanyName(),client.getContactName(),client.getContactEmail());
			campaign.createCampaign(client.clientID);
			campaign=new Campaign(client.clientID,campaign.getTitle(),campaign.campaignStartDate,campaign.campaignFinishDate,campaign.estimatedCost);
			client.addNewCampaigns(campaign);
			database.dataClient.add(client);
			Utils.printLineNumber(50);
			client.getClientCampaigns(client.clientID);
			System.out.println("Saved Successfull");
		}else if(campaignType==2) {
			Utils.printLineNumber(50);
			client.addNewCampaign();
		}
		
		
		client.clientInformation();
	}
	public void addNewCampaign() {
		
		Database databaseCampaign=new Database("cc");
		Utils.print("|                   Campaign List                |");
		Utils.printLineNumber(50);
		campaign=new Campaign();
		campaign.getCampaign();
		Utils.printLineNumber(50);
		System.out.print("Select a Campaign for "+ client.getCompanyName()+"..:");
		
		campaignNumber=scan.nextInt();
		
		for(int i=0;i<databaseCampaign.dataCampaign.size();i++)
		{
			if(campaignNumber==i+1) {
				campaign=new Campaign(client.clientID,databaseCampaign.dataCampaign.get(i).getTitle(),databaseCampaign.dataCampaign.get(i).getCampaignStartDate(),databaseCampaign.dataCampaign.get(i).getCampaignFinishDate(),databaseCampaign.dataCampaign.get(i).getEstimatedCost());
				client.addNewCampaigns(campaign);
				database.dataClient.add(client);
				//database.dataClient.get(0).clientCampaign.add();
			
			}
		}
		
	}
	public void addNewCampaigns(Campaign campaign) {
		this.clientCampaign.add(campaign);
	}
	public void getClient() {
		for(int i=0;i<database.dataClient.size();i++) {
			if(i<=database.dataClient.size()) {
				System.out.println(database.dataClient.get(i).getClientID()+"."+database.dataClient.get(i).getCompanyName());
			}else if(i>database.dataClient.size())
			{
				break;
			}
		}
	}
	public void clientInformation() {
		System.out.println("               Client Information          ");
		Utils.printLineNumber(50);
		for	(int i=0;i<database.dataClient.size();i++) {
			Utils.print(database.dataClient.get(i).companyName+"    Company Information   ");
			Utils.printLineNumber(50);
			Utils.print("Company Name..:"+database.dataClient.get(i).companyName +"\n"+
					"Company Address..:"+database.dataClient.get(i).companyAddress +"\n"+
					"Company Email..:"+database.dataClient.get(i).companyEmail+ "\n"+
					"Contact Name..:"+database.dataClient.get(i).contactName +"\n"+
					"Contact Email..:"+database.dataClient.get(i).contactEmail+"\n");
			Utils.print("              Client Campaigns               ");
			Utils.printLineNumber(50);
			for(int j=0;j<database.dataClient.get(i).clientCampaign.size();j++) {
				if(database.dataClient.get(i).clientCampaign.get(j).getClientID()==database.dataClient.get(i).getClientID()) {
					Utils.print("Campaign Title..:"+database.dataClient.get(i).clientCampaign.get(j).getTitle()+"\n"+
						"Campaign Start Date..:"+database.dataClient.get(i).clientCampaign.get(j).getCampaignStartDate()+"\n"+
						"Campaign Finish Date..:"+database.dataClient.get(i).clientCampaign.get(j).getCampaignFinishDate()+"\n"+
						"Campaign Estimated Cost..:"+database.dataClient.get(i).clientCampaign.get(j).getEstimatedCost()+"\n");
						
				}else{
					Utils.print("There is No Campaign...");
					System.out.println("");
					break;
				}
				
			}
						
		}
		
	}
	public void getClientCampaigns(int selectedClient) {
		for(int i=0;i<database.dataClient.size();i++) {
			if(i+1==selectedClient) {
				Utils.print("               "+database.dataClient.get(i).getCompanyName()+ " Company Campaigns");
				Utils.printLineNumber(50);
				for(int j=0; j<database.dataClient.get(i).clientCampaign.size();j++) {
					if(database.dataClient.get(i).clientCampaign.get(j).getClientID()==selectedClient) {
						Utils.print(database.dataClient.get(i).clientCampaign.get(j).getTitle());	
					}	
				}
				
			}
		}
	}
}
