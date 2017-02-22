package user;

import java.util.List;
import java.util.ArrayList;

public class User {

  private String username;
  private String password;
  private String email;
  private boolean online;
  private List<String> friends;
  private int rank;
  private int wins;
  private int loses;
  private int draws;

  public User() {
  };

  public User(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
    online = false;
    friends = new ArrayList<String>();
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("Username: " + username);
    result.append("\nPassword: " + password);
    result.append("\nEmail: " + email);
    result.append("\nOnline: " + online);
    return result.toString();
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public boolean isOnline() {
    return online;
  }

  public List<String> getFriends() {
    return friends;
  }

  public int getRank() {
    return rank;
  }

  public int getWins() {
    return wins;
  }

  public int getLoses() {
    return loses;
  }

  public int getDraws() {
    return draws;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setOnline(boolean online) {
    this.online = online;
  }

  public void addFriend(String username) {
    friends.add(username);
  }

  public void setRank(int rank) {
    this.rank = rank;
  }
}
