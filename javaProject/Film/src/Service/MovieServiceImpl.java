package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.MovieDao;
import Entity.Movie;
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	public List<String> getTitle() {
		// TODO Auto-generated method stub
		return movieDao.getTitle();
	}

	
}
