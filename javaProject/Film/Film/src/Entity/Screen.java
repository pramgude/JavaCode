package Entity;

import java.util.Date;

public class Screen {
	int ScreenId;
	Date TimeSlot;
	String Title;
	int Seat;
	//String TimeSlot;
	
	public Screen(int ScreenId,Date TimeSlot,String Title,int Seat) {
		this.ScreenId=ScreenId;
		this.TimeSlot=TimeSlot;
		this.Title=Title;
		this.Seat=Seat;
	}

}
