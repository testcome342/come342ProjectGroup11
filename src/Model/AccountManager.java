package Model;

import java.util.Scanner;

import Helper.Utils;

public class AccountManager extends StaffMember {

	static int aStaffNumber;
	static String aStaffName;
	static String aStaffStartDate;
	static String aStaffEmailAddress;
	
	
	public AccountManager(int staffNo, String staffName, String staffStartDate, String staffEmailAdress) {
		super(3,staffNo, staffName, staffStartDate, staffEmailAdress);
		
	}
	

	public int getaStaffNumber() {
		return aStaffNumber;
	}
	public void setaStaffNumber(int aStaffNumber) {
		this.aStaffNumber = aStaffNumber;
	}
	public String getaStaffName() {
		return aStaffName;
	}
	public void setaStaffName(String aStaffName) {
		this.aStaffName = aStaffName;
	}
	public String getaStaffStartDate() {
		return aStaffStartDate;
	}
	public void setaStaffStartDate(String aStaffStartDate) {
		this.aStaffStartDate = aStaffStartDate;
	}
	public String getaStaffEmailAddress() {
		return aStaffEmailAddress;
	}
	public void setaStaffEmailAddress(String aStaffEmailAddress) {
		this.aStaffEmailAddress = aStaffEmailAddress;
	}
	@Override
	public StaffMember assignStaff(int selectedClients,int selectCampaign) {
		Scanner scan=new Scanner(System.in);
		Utils.print("Account Manager Number..:",true);
		aStaffNumber=scan.nextInt();
		setaStaffNumber(aStaffNumber);
		staffNo=aStaffNumber;
		Utils.print("Account Manager Name..:",true);
		aStaffName=scan.next();
		setaStaffName(aStaffName);
		staffName=aStaffName;
		Utils.print("Account Manager Start Date..:",true);
		aStaffStartDate=scan.next();
		setaStaffStartDate(aStaffStartDate);
		staffStartDate=aStaffStartDate;

		Utils.print("Account Manager Email Address..:",true);
		aStaffEmailAddress=scan.next();
		setaStaffEmailAddress(aStaffEmailAddress);
		staffEmailAdress=aStaffEmailAddress;

		
		StaffMember staff=new AccountManager(aStaffNumber,aStaffName,aStaffStartDate,aStaffEmailAddress);
		return staff;
	}

	@Override
	public StaffMember addNewMemberofStaff() {
		Scanner scan=new Scanner(System.in);
		Utils.print("Account Manager Number..:",true);
		aStaffNumber=scan.nextInt();
		setaStaffNumber(aStaffNumber);
		staffNo=aStaffNumber;
		Utils.print("Account Manager Name..:",true);
		aStaffName=scan.next();
		setaStaffName(aStaffName);
		staffName=aStaffName;
		Utils.print("Account Manager Start Date..:",true);
		aStaffStartDate=scan.next();
		setaStaffStartDate(aStaffStartDate);
		staffStartDate=aStaffStartDate;

		Utils.print("Account Manager Email Address..:",true);
		aStaffEmailAddress=scan.next();
		setaStaffEmailAddress(aStaffEmailAddress);
		staffEmailAdress=aStaffEmailAddress;

		
		StaffMember staff=new AccountManager(aStaffNumber,aStaffName,aStaffStartDate,aStaffEmailAddress);
		return staff;
	}
	

}
