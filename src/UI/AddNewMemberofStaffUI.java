package UI;

import Controller.AddNewMemberofStaffControl;
import Helper.Database;

	public class AddNewMemberofStaffUI {
	AddNewMemberofStaffControl staffControl=new AddNewMemberofStaffControl();
		
	public void startInterfaceUI(int selectStaffType) {
			
		staffControl.getStaffMemberDetails(selectStaffType);	
	}
	public void addNewMemberofStaffUI(int selectStaffType) {
		staffControl.addNewMemberofStaffControl(selectStaffType);
	}
}
