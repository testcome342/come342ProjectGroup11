package Model;

public abstract class StaffMember {
	private int staffNo;
	private String staffName;
	private String staffStartDate;
	private String staffEmailAdress;
	
	public abstract void assignStaffContact();
	public abstract StaffMember getStaffDetails();
	public abstract void assignStaffToCampaign();
}
