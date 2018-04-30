package Model.AdvertParentPackage;

import Model.Advert;

public class DigitalAdvert extends Advert{
	private String actors;
	private String voiceOvers;
	private String musicName;
	
	
	public DigitalAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
	}
	public DigitalAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost, String actors, String voiceOvers, String musicName) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
		this.actors = actors;
		this.voiceOvers = voiceOvers;
		this.musicName = musicName;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getVoiceOvers() {
		return voiceOvers;
	}
	public void setVoiceOvers(String voiceOvers) {
		this.voiceOvers = voiceOvers;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	
	
}
