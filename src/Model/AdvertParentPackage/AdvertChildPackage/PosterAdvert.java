package Model.AdvertParentPackage.AdvertChildPackage;

import java.util.Scanner;

import Helper.Utils;
import Model.Advert;
import Model.AdvertParentPackage.TextAdvert;

public class PosterAdvert extends TextAdvert {
	private String actorsName;
	
	public PosterAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
		// TODO Auto-generated constructor stub
	}

	public PosterAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost, String graphicsName, String photographsName, String actorsName) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost, graphicsName, photographsName);
		this.actorsName = actorsName;
	}
	public String getActorsName() {
		return actorsName;
	}

	public void setActorsName(String actorsName) {
		this.actorsName = actorsName;
	}
	
	@Override
	public Advert createAdvert(int selectedClient,int selectedCampign) {
		Scanner scan=new Scanner(System.in);
		String advertTitle,targetCompletionDate,graphicsName,photographsName,actorsName;
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
		
		Utils.print("Actors Name..:");
		actorsName=scan.next();
		setActorsName(actorsName);
		
		
		
		
		PosterAdvert adverts=new PosterAdvert(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost,
				graphicsName,photographsName,actorsName);
		return adverts;
	}
	

}
