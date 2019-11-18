package Entity;

public class Theatre {
	int TheatreId;
	String TheatreName;
	String Screen;
	//List<String> screenName;
	
	public Theatre(int TheatreId,String TheatreName,String Screen) {
		this.TheatreId=TheatreId;
		this.TheatreName=TheatreName;
		this.Screen=Screen;
	}

	public int getTheatreId() {
		return TheatreId;
	}

	public void setTheatreId(int theatreId) {
		TheatreId = theatreId;
	}

	public String getTheatreName() {
		return TheatreName;
	}

	public void setTheatreName(String theatreName) {
		TheatreName = theatreName;
	}

	public String getScreen() {
		return Screen;
	}

	public void setScreen(String screen) {
		Screen = screen;
	}

}
