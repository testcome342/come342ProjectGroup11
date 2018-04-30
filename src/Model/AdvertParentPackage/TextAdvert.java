package Model.AdvertParentPackage;

import Model.Advert;

public class TextAdvert extends Advert{
	private String graphicsName;
	private String photographsName;
	
	
	

	public TextAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost, String graphicsName, String photographsName) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
		this.graphicsName = graphicsName;
		this.photographsName = photographsName;
	}
	
	public TextAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
		// TODO Auto-generated constructor stub
	}
	public String getGraphicsName() {
		return graphicsName;
	}
	public void setGraphicsName(String graphicsName) {
		this.graphicsName = graphicsName;
	}
	public String getPhotographsName() {
		return photographsName;
	}
	public void setPhotographsName(String photographsName) {
		this.photographsName = photographsName;
	}
	

}
