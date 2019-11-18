package Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import Entity.User;

public class UserDaoImpl implements UserDao {

	 JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	} 
	private SessionFactory factory;
	

	@Override
	public int saveUser(User u) {
		// TODO Auto-generated method stub
		 String sql="insert into User(Email,NAme,Theatre) values('"+u.getEmail()+"',"+u.getName()+",'"+u.getTheatre()+"')";    
		    return template.update(sql);  
		//return (User) q.getSingleResult();
	}

	@Override
	public int updateUser(User u) {
		// TODO Auto-generated method stub
		
		 String sql="update User set name='"+u.getEmail()+"', Theatre="+u.getTheatre()+",UserId='"+u.getUserId()+"' where id="+u.getUserId()+"";    
		  return template.update(sql);
	}

	@Override
	public int deleteUser(int UserId) {
		// TODO Auto-generated method stub
		 String sql="delete from User where id="+UserId+"";    
		    return template.update(sql);
	}

	@Override
	public void add(User u) {
	
		Session session = factory.getCurrentSession();
		session.persist(u);
	}

	@Override
	public User getUser(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

}




    
