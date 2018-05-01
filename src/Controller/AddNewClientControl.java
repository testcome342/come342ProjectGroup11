package Controller;

import Helper.Utils;
import Model.Campaign;
import Model.Client;

public class AddNewClientControl {
	
	Client client=new Client();
	Campaign campaign=new Campaign();
	public void createNewClientControl() {
		client.createClient();
	}
		
	public void getClientControl(int selectType) {
		if(selectType==1) {
			client.getClient();
		}else 
			Utils.print("Try Again");
	}
}
