package VideoStorePackage;

import java.util.ArrayList;
import java.util.List;

public class User {
	String name;
	String type;
	int accountBalance;
	List<Video> checkedOutVideos = new ArrayList<Video>();
	
	User(String in_name, String in_type){
		name = in_name;
		type = in_type;
		System.out.println("New user created");
	}
	
	public void checkOutVideo (Video in_video) {
		checkedOutVideos.add(in_video);
	}
	
	public void returnVideo (Video in_video) {
		checkedOutVideos.remove(in_video);
	}
	
	public String getAccountInfo() {
		String ret = "Name: "+name +", Type: " + ", Account Balance: "+accountBalance;
		if(checkedOutVideos.size()>0) {
			ret = ret +", Videos: "+checkedOutVideos.toString();
		}
		return ret;
	}
}
