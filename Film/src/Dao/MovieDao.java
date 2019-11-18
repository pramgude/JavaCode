package Dao;

import java.util.List;

import Entity.Movie;
import Entity.User;

public interface MovieDao {
	

		

		
		
	List<String> getTitle();

		public List<Movie> findMovieBymovieId(int movieId);
	
		int saveMovie(Movie m);

	}


