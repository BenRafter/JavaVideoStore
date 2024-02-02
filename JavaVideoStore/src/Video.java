import java.sql.Date;

public class Video {
	String title;
	String genre;
	int rentalTime;
	boolean isRented;
	Date dueDate;
	int checkoutPrice;
	int lateFee;
	int overdueAmount;
	
	Video(String in_title, String in_genre){
		title = in_title;
		genre=in_genre;
		System.out.println("Video: "+title+" created....");
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getRentalTime() {
		return rentalTime;
	}
	
	public boolean getRentalStatus() {
		return isRented;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	public int getCheckoutPrice() {
		return checkoutPrice;
	}
	
	public int getLateFee() {
		return lateFee;
	}
	
	public int getOverdueAmount() {
		return overdueAmount;
	}
	
	public String toString() {
		String ret = "title: "+title+", genre: "+genre+", isRented: "+isRented+", rentalTime: "+rentalTime+", dueDate: "+dueDate+", checkoutPrice: "+checkoutPrice+", lateFee: "+lateFee+", overdueAmount: "+overdueAmount;
		return ret;
	}
}
