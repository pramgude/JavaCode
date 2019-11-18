package Service;

import Entity.TicketBook;
import Entity.User;


public interface BookService {
	
	  User validate(User cred);
	  
	  void add(User u);
	 

}
