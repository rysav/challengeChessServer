package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserFacade {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserFacade.class);

  public UserFacade(){}

  /**
    @Pre:
    @Post: returns list of all users currently registered (see User class)
  */
  public User[] getAllUsers(){
    return null;
  }

  /**
    @Pre: user must exist
    @Post: returns User object for specified user. returns null if user does not exist
  */
  public User getUser(String username){
    return null;
  }


  /**
    @Pre: Username is unique; username, password, online, and email fields are initialized; other fields are 0/null
    @Post:User object is in database, user cookie is created and returned
  */
  public String register(User basicUser){

  }

  /**
    @Pre: username and password are not null. Password is in specified encrypted format
    @Post:verifies that user exists, validates password, sets user to online, returns user cookie if it does exist,
  */
  public String login(String username, String password){

  }

  /**
    @Pre: user with matching username already exists
    @Post:sets user to offline
  */
  public void logout(String username){

  }

  /**
    @Pre:user is non null
    @Post:user with matching username will be updated but win record wont be affected
  */
  public void updateUser(User user){

  }
}
