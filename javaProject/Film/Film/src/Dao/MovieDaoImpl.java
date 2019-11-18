package Dao;

import java.util.List;
//import org.hibernate.query.Query;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.orm.toplink.SessionFactory;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


import Entity.Movie;
@Repository
public class MovieDaoImpl implements MovieDao {
	@Autowired
	private SessionFactory factory;
	
	
	/*
	 * public List<Book> getBooksBySubject(String subject) { 
	 * String hql =
	 * "from Book b where b.subject=:p_subject"; Session session =
	 * factory.getCurrentSession(); Query q = session.createQuery(hql);
	 * q.setParameter("p_subject", subject); return q.getResultList(); }
	 */
	


	public List<Movie> findMovieBymovieId(int movieId) {
		String hql = "from Movie m where m.Title=:p_Title";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		q.setParameter("p_Title", movieId);
		return  q.getResltList();
	
		
	}

	@Override
	public int saveMovie(Movie m) {
		// TODO Auto-generated method stub
		String hql = "insert into Movie(DiretorName,movieId,Rating,Title) values('"+m.getDirectorName()+"',"+m.getMovieId()+",'"+m.getRating()+"','"+m.getTitle()+"')";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		
		return  q.getSingleResult();
		
	}

	@Override
	public List<String> getTitle() {
		String hql = "select distinct(m.Title) from Movie m";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		return q.getResultList();
	}

	

}
