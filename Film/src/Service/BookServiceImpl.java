package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Dao.UserDao;
import Entity.TicketBook;
import Entity.User;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private UserDao userdao;
	@Transactional
	public User validate(TicketBook cred) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void add(User u) {
		
		userdao.add(u);
	}

	@Transactional
	public User validate(User cred) {
		User u = userdao.getUser( cred.getName() );
		if(u != null && u.getTheatre().equals(cred.getTheatre()) )
			return u;
		return null;
		
	}

}
