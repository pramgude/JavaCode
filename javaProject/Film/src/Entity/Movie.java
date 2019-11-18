package Entity;

import java.util.Date;


public class Movie {
	int movieId;
    String Title;
    String Rating;
	String DirectorName;
    
    public Movie(int movieId,String Title,String DirectorName,String Rating)
    {
    	this.movieId=movieId;
   	 this.Title=Title;
   	 this.DirectorName=DirectorName;
   	 this.Rating=Rating;
   	 
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getRating() {
		return Rating;
	}

	public void setRating(String rating) {
		Rating = rating;
	}

}
