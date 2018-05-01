package Controller;

import java.util.ArrayList;

import Helper.Database;
import Helper.Utils;
import Model.AdminStaff;
import Model.CreativeStaff;
import Model.StaffMember;

public class AddNewMemberofStaffControl {
	
	public void getStaffMemberDetails(int selectStaffType) {	
		ArrayList<StaffMember> staffMember=StaffMember.getStaffMembers();
		if(staffMember.size() != 0) {
			for(int i=0; i< staffMember.size(); i++) {
				if(staffMember.get(i).getStaffType()==selectStaffType) {
					Utils.print("      STAFF INFORMATION      ");
					Utils.printLineNumber(50);
					Utils.print("Staff Type   	  	 =>"+staffMember.get(i).getStaffType());
					Utils.print("Staff Number      	 =>"+staffMember.get(i).getStaffNo());	
					Utils.print("Staff Name        	 =>"+staffMember.get(i).getStaffName());	
					Utils.print("Staff Start Date 	 =>"+staffMember.get(i).getStaffStartDate());	
					Utils.print("Staff Email Address =>"+staffMember.get(i).getStaffEmailAdress());	
					Utils.printLineNumber(50);
				}
			}
		} else {
			Utils.print("No Staff at List..!");
		}
	}
	public void addNewMemberofStaffControl(int selectStaffType) {
		StaffMember staffMember;
		if(selectStaffType==1) {
			staffMember=new CreativeStaff(0,"","","");
			staffMember.addNewMemberofStaff();
			Database.dataStaff.add(staffMember);
		}else if(selectStaffType==2) {
			staffMember=new AdminStaff(0,"","","");
			staffMember.addNewMemberofStaff();
			Database.dataStaff.add(staffMember);
			
		}
	}
}
