package Helper;
import java.util.ArrayList;
import Model.Campaign;
import Model.Client;

public class Database {
	public static ArrayList<Client> dataClient=new ArrayList<Client>();
	public static ArrayList<Campaign> dataCampaign=new ArrayList<Campaign>();
	public static Client clientAppcent;
	public static Client clientVizyoneks;

	
	public static void fakeData() {
		clientAppcent =new Client(1,"Appcent","AcÄ±badem","appcent@appcent.mobi","Arda Altunyay","arda.altunyay@appcent.mobi");
		Campaign campaignAppcent=new Campaign(1,1,"Appcent Mobile Advert","12/04/2016","12/05/2016",345.5);
		clientAppcent.addNewCampaigns(campaignAppcent);
		Campaign campaignAppcentIOS=new Campaign(2,1,"Appcent Mobile IOS","13/06/2018","17/08/2018",360.5);
		clientAppcent.addNewCampaigns(campaignAppcentIOS);
		dataClient.add(clientAppcent);
		
		clientVizyoneks=new Client(2,"Vizyoneks","Ataşehir","vizyoneks@gmail.com","Hasan Arınç","hasanarinc@gmail.com");
		Campaign campaignVizyoneks10=new Campaign(1,2,"Vizyoneks 10. YIL JAVA","12/04/2016","12/05/2016",345.5);
		clientVizyoneks.addNewCampaigns(campaignVizyoneks10);
		Campaign campaignVizyoneks20=new Campaign(2,2,"Vizyoneks 20. YIL JAVA","13/06/2018","17/08/2018",360.5);
		clientVizyoneks.addNewCampaigns(campaignVizyoneks20);
		dataClient.add(clientVizyoneks);
		
		dataClient.add(new Client(3,"HasKaPP","KadÄ±kÃ¶y","haskapp@gmail.com","Kaan KÃ¼n","kaanforum4@gmail.com"));
		dataClient.add(new Client(4,"Å�imÅŸek Holding","Levent","simsekholding@gmail.com","AslÄ± Å�imÅŸek","aslisimsek@gmail.com"));
		dataClient.add(new Client(5,"DOIS","BaÄŸcÄ±lar","dois@gmail.com","DoÄŸacan Oymak","dogacanoymak@gmail.com"));
		dataClient.add(new Client(6,"Jele","KadÄ±kÃ¶y","jele@gmail.com","Hakan Abi","hakanabi@gmail.com"));
		

	}
	public static void fakeDataCampaign(String campaign) {
		dataCampaign.add(new Campaign(1,1,"1. Yellow Friday","01/01/2018","01/06/2018",128.50));
		dataCampaign.add(new Campaign(2,2,"2. Black Friday","20/10/2018","24/10/2018",85.0));
		dataCampaign.add(new Campaign(3,3,"3. New Year","30/12/2017","01/01/2018",100.0));
		dataCampaign.add(new Campaign(4,4,"4. Valentine's Day","14/02/2018","15/02/2018",15.75));
	}

	public ArrayList<Client> getList() {
	       return dataClient;
	}
}
