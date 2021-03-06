package Model;

import java.util.ArrayList;
import java.util.Scanner;

import Helper.Database;
import Helper.Utils;

public class CreativeStaff extends StaffMember {
	 int cStaffNumber;
	 String cStaffName;
	 String cStaffStartDate;
	 String cStaffEmailAddress;
	
	

	public CreativeStaff(int staffNo, String staffName, String staffStartDate, String staffEmailAdress) {
		super(1,staffNo, staffName, staffStartDate, staffEmailAdress);
		
	}

	
	public int getcStaffNumber() {
		return cStaffNumber;
	}

	public void setcStaffNumber(int cStaffNumber) {
		this.cStaffNumber = cStaffNumber;
	}

	public String getcStaffName() {
		return cStaffName;
	}

	public void setcStaffName(String cStaffName) {
		this.cStaffName = cStaffName;
	}

	public String getcStaffStartDate() {
		return cStaffStartDate;
	}

	public void setcStaffStartDate(String cStaffStartDate) {
		this.cStaffStartDate = cStaffStartDate;
	}

	public String getcStaffEmailAddress() {
		return cStaffEmailAddress;
	}

	public void setcStaffEmailAddress(String cStaffEmailAddress) {
		this.cStaffEmailAddress = cStaffEmailAddress;
	}

	@Override
	public StaffMember assignStaff(int selectedClients,int selectCampaign) {
		Scanner scan=new Scanner(System.in);
		
		Utils.print("Creative Staff Number..:",true);
		cStaffNumber=scan.nextInt();
		setcStaffNumber(cStaffNumber);
		staffNo=cStaffNumber;
		Utils.print("Creative Staff Name..:",true);
		cStaffName=scan.next();
		setcStaffName(cStaffName);
		staffName=cStaffName;
		Utils.print("Creative Staff Start Date..:",true);
		cStaffStartDate=scan.next();
		setcStaffStartDate(cStaffStartDate);
		staffStartDate=cStaffStartDate;
		Utils.print("Creative Staff Email Address..:",true);
		cStaffEmailAddress=scan.next();
		setcStaffEmailAddress(cStaffEmailAddress);
		staffEmailAdress=cStaffEmailAddress;
		
		StaffMember staff=new CreativeStaff(cStaffNumber,cStaffName,cStaffStartDate,cStaffEmailAddress);
		
		return staff;
	}


	@Override
	public StaffMember addNewMemberofStaff() {
		Scanner scan=new Scanner(System.in);
		Utils.print("Creative Staff Number..:",true);
		cStaffNumber=scan.nextInt();
		
		staffNo=cStaffNumber;
		Utils.print("Creative Staff Name..:",true);
		cStaffName=scan.next();
		
		staffName=cStaffName;
		Utils.print("Creative Staff Start Date..:",true);
		cStaffStartDate=scan.next();
		staffStartDate=cStaffStartDate;
		
		Utils.print("Creative Staff Email Address..:",true);
		cStaffEmailAddress=scan.next();
		staffEmailAdress=cStaffEmailAddress;
		
		StaffMember staff=new CreativeStaff(cStaffNumber,cStaffName,cStaffStartDate,cStaffEmailAddress);
		return staff;
	}
}
