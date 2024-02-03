package VideoStorePackage;
import java.util.ArrayList;
import java.util.List;

public class VideoStorage {
	private List<Video> videoStorageList = new ArrayList<Video>();
	
	VideoStorage(){
		System.out.println("VideoStorage initialized....");
	}
	
	public void addVideoToStorage(Video videoToAdd) {
		videoStorageList.add(videoToAdd);
		System.out.println("Video: "+videoToAdd.getTitle()+" added to storage");
	}
	
	public void printList() {
		System.out.println("\n");
		System.out.println("Current videos in storage....");
		for(int i=0;i<videoStorageList.size();i++) {
			Video tempVideo = videoStorageList.get(i);
			System.out.println(tempVideo.toString());
		}
	}
}
