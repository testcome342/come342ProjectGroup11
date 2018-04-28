package Model;
import java.util.ArrayList;
import java.util.Scanner;
import Helper.Database;
import Helper.Utils;

public class Campaign {
private int clientID;
public String title;
public String campaignStartDate;
public String campaignFinishDate;
public double estimatedCost;
static  Database database=new Database();
public Client client=new Client();
public ArrayList<Client> dataClient=new ArrayList<Client>();



public Campaign() {
	super();
}


public Campaign(int clientID,String title, String campaignStartDate, String campaignFinishDate, double estimatedCost) {
	super();
	this.clientID=clientID;
	this.title = title;
	this.campaignStartDate = campaignStartDate;
	this.campaignFinishDate = campaignFinishDate;
	this.estimatedCost = estimatedCost;
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


public Campaign createCampaign(int selectedClient) {
	Scanner scan=new Scanner(System.in);
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
	Campaign campaigns=new Campaign(selectedClient,campaignTitle,campaignStartDate,campaignFinishDate,estimatedCost);
	
	return campaigns;
}
	public void getCampaign() {
		Database databaseCampaign=new Database("cc");
		for(int i=0;i<databaseCampaign.dataCampaign.size();i++) {
			if(i<=databaseCampaign.dataCampaign.size()) {
				System.out.println(databaseCampaign.dataCampaign.get(i).getTitle());
			}else if(i>databaseCampaign.dataCampaign.size())
			{
				break;
			}
		}
	}
}


