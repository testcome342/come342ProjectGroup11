package Model;

import java.util.Scanner;

public class Advert {
	private String advertTitle;
	private String targetCompletionDate;
	private double estimatedAdvertCost;
	private double actualAdvertCost;

	public String getAdvertTitle() {
		return advertTitle;
	}
	public void setAdvertTitle(String advertTitle) {
		this.advertTitle = advertTitle;
	}
	public String getTargetCompletionDate() {
		return targetCompletionDate;
	}
	public void setTargetCompletionDate(String targetCompletionDate) {
		this.targetCompletionDate = targetCompletionDate;
	}
	public double getEstimatedAdvertCost() {
		return estimatedAdvertCost;
	}
	public void setEstimatedAdvertCost(double estimatedAdvertCost) {
		this.estimatedAdvertCost = estimatedAdvertCost;
	}
	public double getActualAdvertCost() {
		return actualAdvertCost;
	}
	public void setActualAdvertCost(double actualAdvertCost) {
		this.actualAdvertCost = actualAdvertCost;
	}
	public Advert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super();
		this.advertTitle = advertTitle;
		this.targetCompletionDate = targetCompletionDate;
		this.estimatedAdvertCost = estimatedAdvertCost;
		this.actualAdvertCost = actualAdvertCost;
	}
	public Advert() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Advert createAdvert(int selectedClient,int selectedCampign) {
		Scanner scan=new Scanner(System.in);
		String advertTitle,targetCompletionDate;
		double estimatedAdvertCost,actualAdvertCost;
		
		System.out.print("Advert Title.:");
		advertTitle=scan.nextLine();
		setAdvertTitle(advertTitle);
		
		System.out.print("Target Completion Date..:");
		targetCompletionDate=scan.nextLine();
		setTargetCompletionDate(targetCompletionDate);
		
		System.out.print("Estimated Advert Cost..:");
		estimatedAdvertCost=scan.nextDouble();
		setEstimatedAdvertCost(estimatedAdvertCost);
		
		System.out.print("Actual Advert Cost..:");
		actualAdvertCost=scan.nextDouble();
		setActualAdvertCost(actualAdvertCost);
		Advert adverts=new Advert(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost);
		
		return adverts;
	}

	
}
