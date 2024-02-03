package VideoStorePackage;

public class TestZone {
	
	public static void run() {
		System.out.println("TestZone is running...");
		
		VideoStorage videoStorage = new VideoStorage();
		
		Video video1 = new Video("Dawn of the dead","Horror");
		Video video2 = new Video("The Naked Gun", "Comedy");
		Video video3 = new Video("The Raid:Redemption","Action");
		
		videoStorage.addVideoToStorage(video1);
		videoStorage.addVideoToStorage(video2);
		videoStorage.addVideoToStorage(video3);
		
		videoStorage.printList();
		
		User user1 = new User("Ben","Employee");
		System.out.println(user1.getAccountInfo());
		User user2 = new User("John","Customer");
		System.out.println(user2.getAccountInfo());
		
	}
	
	public static void main(String[] args) {
		run();
	}
}
