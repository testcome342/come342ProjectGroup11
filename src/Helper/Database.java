package Helper;
import java.util.ArrayList;

import Model.AdminStaff;
import Model.Campaign;
import Model.Client;
import Model.CreativeStaff;
import Model.StaffMember;

public class Database {
	public static ArrayList<Client> dataClient=new ArrayList<Client>();
	public static ArrayList<Campaign> dataCampaign=new ArrayList<Campaign>();
	public static ArrayList<StaffMember> dataStaff=new ArrayList<StaffMember>();	
	public static Client clientBoyner;
	public static Client clientBeymen;
	public static StaffMember staff;

	
	public static void fakeData() {
		clientBoyner =new Client(1,"Boyner","Acibadem","boyner@gmail.com","Ali Bahtiyar","alibahtiyar");
		Campaign campaignAppcent=new Campaign(1,1,"3.Year Campaign","12/04/2018","12/05/2016",345.5);
		clientBoyner.addNewCampaigns(campaignAppcent);
		Campaign campaignAppcentIOS=new Campaign(2,1,"Butterfly Campaign","10/02/2018","25/03/2018",560.5);
		clientBoyner.addNewCampaigns(campaignAppcentIOS);
		dataClient.add(clientBoyner);
		
		clientBeymen=new Client(2,"Beymen","Ataþehir","beymen@gmail.com","Arzu Sancak","arzu.sancak@gmail.com");
		Campaign campaignVizyoneks10=new Campaign(1,2,"Beymen Woman Days","20/04/2016","30/04/2018",55.5);
		clientBeymen.addNewCampaigns(campaignVizyoneks10);
		Campaign campaignVizyoneks20=new Campaign(2,2,"Beymen Man Days","1/05/2018","15/05/2018",60.5);
		clientBeymen.addNewCampaigns(campaignVizyoneks20);
		dataClient.add(clientBeymen);
		
		dataClient.add(new Client(3,"Zara","Kadiköy","zara@gmail.com","Cemil Elit","elitcemil@gmail.com"));
		dataClient.add(new Client(4,"Bershka","Levent","bershka@gmail.com","Nazim Isik","nazim.isik@gmail.com"));
		dataClient.add(new Client(5,"Armani Jeans","Mecidiyeköy","armani@gmail.com","Nuray Altin","altin.nuray@gmail.com"));
		dataClient.add(new Client(6,"Gant","Beþiktaþ","gant@gmail.com","Gökhan Yýldýrým","gokhanyildirim@gmail.com"));
		

	}
	public static void fakeDataCampaign() {
		dataCampaign.add(new Campaign(1,1,"1. Yellow Friday","01/01/2018","01/06/2018",128.50));
		dataCampaign.add(new Campaign(2,2,"2. Black Friday","20/10/2018","24/10/2018",85.0));
		dataCampaign.add(new Campaign(3,3,"3. New Year","30/12/2017","01/01/2018",100.0));
		dataCampaign.add(new Campaign(4,4,"4. Valentine's Day","14/02/2018","15/02/2018",15.75));
	}

	public static void fakeDataStaff() {
		CreativeStaff cs=new CreativeStaff(21,"Kaan Kun","12/06/2018","kaan.kun@agate.com");
		CreativeStaff cs1=new CreativeStaff(23,"Necip Kaldirim","12/06/2018","necip.k@agate.com");
		CreativeStaff cs2=new CreativeStaff(35,"Mehmet Cansin","12/06/2018","m.cansin@agate.com");
		AdminStaff 	  as3=new AdminStaff(10,"Hasan Arinc","12/06/2018","hasan.arinc@agate.com");
		
		dataStaff.add(cs);
		dataStaff.add(cs1);
		dataStaff.add(cs2);
		dataStaff.add(as3);
	}
	public ArrayList<Client> getList() {
	       return dataClient;
	}
}
