import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.json.*;

import user.User;
import java.util.Map;
import java.util.HashMap;

@RestController
@EnableAutoConfiguration
@RequestMapping("users")
public class UserEndpoint {

  private Map<String, User> users = new HashMap<String, User>();

  @RequestMapping(value="login", method=RequestMethod.PUT)
  public @ResponseBody User login(@RequestBody User user) {
    User updatedUser = users.get(user.getUsername());
    updatedUser.setOnline(true);
    return updatedUser;
  }

  @RequestMapping(value="logout", method=RequestMethod.PUT)
  public @ResponseBody User logout(@RequestBody User user) {
    User updatedUser = users.get(user.getUsername());
    updatedUser.setOnline(false);
    return updatedUser;
  }

  @RequestMapping(value="{username}", method=RequestMethod.POST)
  public void addUser(@PathVariable String username){
    users.put(username, new User(username, "password", username));
  }

  public static void main(String[] args) throws Exception {
      SpringApplication.run(UserEndpoint.class, args);
  }
}
