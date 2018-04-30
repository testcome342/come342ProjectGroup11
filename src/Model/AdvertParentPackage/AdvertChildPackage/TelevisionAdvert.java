package Model.AdvertParentPackage.AdvertChildPackage;

import java.util.Scanner;

import Helper.Utils;
import Model.Advert;
import Model.AdvertParentPackage.DigitalAdvert;

public class TelevisionAdvert extends DigitalAdvert{
	private String videoName;
	private String libraryFilm;
	
	


	public TelevisionAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
		// TODO Auto-generated constructor stub
	}

	public TelevisionAdvert(String adveretTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost, String actors, String voiceOvers, String musicName,String videoName,String libraryFilm) {
		super(adveretTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost, actors, voiceOvers, musicName);
		this.videoName=videoName;
		this.libraryFilm=libraryFilm;
		
	}
	
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getLibraryFilm() {
		return libraryFilm;
	}
	public void setLibraryFilm(String libraryFilm) {
		this.libraryFilm = libraryFilm;
	}

	@Override
	public Advert createAdvert(int selectedClient,int selectedCampign) {
		Scanner scan=new Scanner(System.in);
		String advertTitle,targetCompletionDate,actorsName,voiceOvers,musicName;
		String videosName,libraryFilmName;
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
		
		Utils.print("Actors Name..:");
		actorsName=scan.next();
		setActors(actorsName);
		
		Utils.print("Voice Overs Name..:");
		voiceOvers=scan.next();
		setVoiceOvers(voiceOvers);
		
		Utils.print("Music Name..:");
		musicName=scan.next();
		setMusicName(musicName);
		
		Utils.print("Video Name..:");
		videosName=scan.next();
		setVideoName(videosName);
		
		Utils.print("Library Film Name..:");
		libraryFilmName=scan.next();
		setLibraryFilm(libraryFilmName);
		
		
		
		TelevisionAdvert adverts=new TelevisionAdvert(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost,
				actorsName,voiceOvers,musicName,videosName,libraryFilmName);
		return adverts;
	}
}
