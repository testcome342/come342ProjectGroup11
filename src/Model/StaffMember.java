package Model;

import java.util.ArrayList;

import Helper.Database;
import Helper.Utils;

public abstract class StaffMember {
	public int staffType;
	public int staffNo;
	public String staffName;
	public String staffStartDate;
	public String staffEmailAdress;
	
	public abstract StaffMember assignStaff(int selectedClients,int selectCampaign);
	public abstract StaffMember addNewMemberofStaff();
	public static ArrayList<StaffMember> getStaffMembers() {
		return Database.dataStaff;
	}
	
	public StaffMember(int staffType,int staffNo, String staffName, String staffStartDate, String staffEmailAdress) {
		this.staffType=staffType;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.staffStartDate = staffStartDate;
		this.staffEmailAdress = staffEmailAdress;
	}
	

	public int getStaffType() {
		return staffType;
	}

	public void setStaffType(int staffType) {
		this.staffType = staffType;
	}

	public int getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffStartDate() {
		return staffStartDate;
	}

	public void setStaffStartDate(String staffStartDate) {
		this.staffStartDate = staffStartDate;
	}

	public String getStaffEmailAdress() {
		return staffEmailAdress;
	}

	public void setStaffEmailAdress(String staffEmailAdress) {
		this.staffEmailAdress = staffEmailAdress;
	}
	
	
}
