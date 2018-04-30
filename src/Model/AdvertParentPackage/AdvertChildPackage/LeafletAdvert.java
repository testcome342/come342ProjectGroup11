package Model.AdvertParentPackage.AdvertChildPackage;

import java.util.Scanner;

import Helper.Utils;
import Model.Advert;
import Model.AdvertParentPackage.TextAdvert;

public class LeafletAdvert extends TextAdvert {
	private String description;
	

	public LeafletAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
		// TODO Auto-generated constructor stub
	}

	public LeafletAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost, String graphicsName, String photographsName, String description) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost, graphicsName, photographsName);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public Advert createAdvert(int selectedClient,int selectedCampign) {
		Scanner scan=new Scanner(System.in);
		String advertTitle,targetCompletionDate,graphicsName,photographsName,descriptionName;
		double estimatedAdvertCost,actualAdvertCost;
		
		Utils.print("Advert Title.:");
		advertTitle=scan.next();
		setAdvertTitle(advertTitle);
		
		Utils.print("Target Completion Date..:");
		targetCompletionDate=scan.next();
		setTargetCompletionDate(targetCompletionDate);
		
		Utils.print("Estimated Advert Cost..:");
		estimatedAdvertCost=scan.nextDouble();
		setEstimatedAdvertCost(estimatedAdvertCost);
		
		Utils.print("Actual Advert Cost..:");
		actualAdvertCost=scan.nextDouble();
		setActualAdvertCost(actualAdvertCost);
		
		Utils.print("Graphics Name..:");
		graphicsName=scan.next();
		setGraphicsName(graphicsName);
		
		Utils.print("Photographs Name..:");
		photographsName=scan.next();
		setPhotographsName(photographsName);
		
		Utils.print("Description..:");
		descriptionName=scan.next();
		setDescription(descriptionName);
		
		
		
		
		LeafletAdvert adverts=new LeafletAdvert(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost,
				graphicsName,photographsName,descriptionName);
		return adverts;
	}
}


	
	

