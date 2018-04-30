package Controller;

import java.util.Scanner;

import Helper.Database;
import Helper.Utils;
import Model.Advert;
import Model.Campaign;
import Model.AdvertParentPackage.AdvertChildPackage.LeafletAdvert;
import Model.AdvertParentPackage.AdvertChildPackage.MagazineAdvert;
import Model.AdvertParentPackage.AdvertChildPackage.NewspaperAdvert;
import Model.AdvertParentPackage.AdvertChildPackage.PosterAdvert;
import Model.AdvertParentPackage.AdvertChildPackage.RadioAdvert;
import Model.AdvertParentPackage.AdvertChildPackage.TelevisionAdvert;

public class AddNewAdvertToCampaignControl {
	Campaign campaign=new Campaign();
	Advert advert=new Advert();
	
	public void selectCampaignControl(int selectedClients,int selectCampaign) {
		campaign.selectCampaign(selectedClients,selectCampaign);

	}
	
	public void addNewAdvert(int selectedClient,int selectedCampaign) {
		Scanner scan = new Scanner(System.in);
		Utils.print("|         Advert Type       |");
		Utils.printLineNumber(50);
		Utils.print("1.Digital Advert");
		Utils.print("2.Text Advert");
		Utils.print("Select Advert Type =>",true);
		int selectAdvertType=scan.nextInt();
		if(selectAdvertType==1) {
			Utils.print("|         Digital Advert       |");
			Utils.printLineNumber(50);
			Utils.print("1.Television Advert");
			Utils.print("2.Radio Advert");
			Utils.print("Select Digital Advert Type =>",true);
			int digitalAdvertType = scan.nextInt();
			switch (digitalAdvertType) {
				case 1:
					Advert advertTelevision=new TelevisionAdvert("","",0,0);
					advertTelevision.createAdvert(selectedClient, selectedCampaign);
					Database.dataClient.get(selectedClient-1).clientCampaign.get(selectedCampaign-1).advertCampaign.add(advertTelevision);
					Utils.print("ok");
					campaign.assignAdvertToCampaign(selectedClient, selectedCampaign,advertTelevision,"Television Advert");
					break;
				case 2:
					Advert advertRadio=new RadioAdvert("","",0,0);
					advertRadio.createAdvert(selectedClient, selectedCampaign);
					Database.dataClient.get(selectedClient-1).clientCampaign.get(selectedCampaign-1).advertCampaign.add(advertRadio);
					Utils.print("ok");
					campaign.assignAdvertToCampaign(selectedClient, selectedCampaign,advertRadio,"Radio Advert");
					break;
				default:
					Utils.print("You Entered Wrong Value..." );
					break;
			}
		}else if (selectAdvertType==2){
			Utils.print("|         Text Advert       |");
			Utils.printLineNumber(50);
			Utils.print("1.Newspaper Advert");
			Utils.print("2.Magazine Advert");
			Utils.print("3.Poster Advert");
			Utils.print("4.Leaflet Advert");
			Utils.print("Select Digital Advert Type =>",true);
			int digitalAdvertType = scan.nextInt();
			switch (digitalAdvertType) {
				case 1:
					Advert advertNewspaper=new NewspaperAdvert("","",0,0);
					advertNewspaper.createAdvert(selectedClient, selectedCampaign);
					Database.dataClient.get(selectedClient-1).clientCampaign.get(selectedCampaign-1).advertCampaign.add(advertNewspaper);
					Utils.print("ok");
					campaign.assignAdvertToCampaign(selectedClient, selectedCampaign,advertNewspaper,"Newspaper Advert");
					break;
				case 2:
					Advert advertMagazine=new MagazineAdvert("","",0,0);
					advertMagazine.createAdvert(selectedClient, selectedCampaign);
					Database.dataClient.get(selectedClient-1).clientCampaign.get(selectedCampaign-1).advertCampaign.add(advertMagazine);
					Utils.print("ok");
					campaign.assignAdvertToCampaign(selectedClient, selectedCampaign,advertMagazine,"Magazine Advert");
					break;
				case 3:
					Advert advertPoster=new PosterAdvert("","",0,0);
					advertPoster.createAdvert(selectedClient, selectedCampaign);
					Database.dataClient.get(selectedClient-1).clientCampaign.get(selectedCampaign-1).advertCampaign.add(advertPoster);
					Utils.print("ok");
					campaign.assignAdvertToCampaign(selectedClient, selectedCampaign,advertPoster,"Poster Advert");
					break;
				case 4:
					Advert advertLeaflet=new LeafletAdvert("","",0,0);
					advertLeaflet.createAdvert(selectedClient, selectedCampaign);
					Database.dataClient.get(selectedClient-1).clientCampaign.get(selectedCampaign-1).advertCampaign.add(advertLeaflet);
					Utils.print("ok");
					campaign.assignAdvertToCampaign(selectedClient, selectedCampaign,advertLeaflet,"Leaflet Advert");
					break;
					default:
						Utils.print("You Entered Wrong Value... ");
					break;		
				
			}
		}else {
			Utils.print("You Entered Wrong Value... ");
		}
	}

}
