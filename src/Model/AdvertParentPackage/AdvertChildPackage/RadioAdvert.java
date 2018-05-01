package Model.AdvertParentPackage.AdvertChildPackage;

import java.util.Scanner;

import Helper.Utils;
import Model.Advert;
import Model.AdvertParentPackage.DigitalAdvert;

public class RadioAdvert extends DigitalAdvert {
	private String audioName;
	
	public RadioAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
		// TODO Auto-generated constructor stub
	}

	public RadioAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost, String actors, String voiceOvers, String musicName,String audioName) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost, actors, voiceOvers, musicName);
		this.audioName=audioName;
	}
	public String getAudioName() {
		return audioName;
	}

	public void setAudioName(String audioName) {
		this.audioName = audioName;
	}
	
	@Override
	public Advert createAdvert(int selectedClient,int selectedCampign) {
		Scanner scan=new Scanner(System.in);
		String advertTitle,targetCompletionDate,actorsName,voiceOvers,musicName;
		String audiosName;
		double estimatedAdvertCost,actualAdvertCost;
		
		Utils.print("Advert Title.:");
		advertTitle=scan.nextLine();
		setAdvertTitle(advertTitle);
		
		Utils.print("Target Completion Date..:");
		targetCompletionDate=scan.nextLine();
		setTargetCompletionDate(targetCompletionDate);
		
		Utils.print("Estimated Advert Cost..:");
		estimatedAdvertCost=scan.nextDouble();
		setEstimatedAdvertCost(estimatedAdvertCost);
		
		Utils.print("Actual Advert Cost..:");
		actualAdvertCost=scan.nextDouble();
		setActualAdvertCost(actualAdvertCost);
		
		Utils.print("Actors Name..:");
		actorsName=scan.nextLine();
		setActors(actorsName);
		
		Utils.print("Voice Overs Name..:");
		voiceOvers=scan.next();
		setVoiceOvers(voiceOvers);
		
		Utils.print("Music Name..:");
		musicName=scan.next();
		setMusicName(musicName);
		
		Utils.print("Audio Name..:");
		audiosName=scan.next();
		setAudioName(audiosName);
		
		
		RadioAdvert adverts=new RadioAdvert(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost,
				actorsName,voiceOvers,musicName,audiosName);
		return adverts;
	}
}
