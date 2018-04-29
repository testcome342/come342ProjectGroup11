package Model;

public abstract class StaffMember {
	public static int staffNo;
	public static String staffName;
	public static String staffStartDate;
	public static String staffEmailAdress;
	
	public abstract StaffMember assignStaff(int selectedClients,int selectCampaign);
	public abstract StaffMember getStaffDetails();
	
	public StaffMember(int staffNo, String staffName, String staffStartDate, String staffEmailAdress) {
		StaffMember.staffNo = staffNo;
		StaffMember.staffName = staffName;
		StaffMember.staffStartDate = staffStartDate;
		StaffMember.staffEmailAdress = staffEmailAdress;
	}
	public static int getStaffNo() {
		return staffNo;
	}
	public static void setStaffNo(int staffNo) {
		StaffMember.staffNo = staffNo;
	}
	public static String getStaffName() {
		return staffName;
	}
	public static void setStaffName(String staffName) {
		StaffMember.staffName = staffName;
	}
	public static String getStaffStartDate() {
		return staffStartDate;
	}
	public static void setStaffStartDate(String staffStartDate) {
		StaffMember.staffStartDate = staffStartDate;
	}
	public static String getStaffEmailAdress() {
		return staffEmailAdress;
	}
	public static void setStaffEmailAdress(String staffEmailAdress) {
		StaffMember.staffEmailAdress = staffEmailAdress;
	}
	
}
