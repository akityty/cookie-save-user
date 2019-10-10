package konkon.model;

public class User {
  private String email;
  private String Password;

  public User(String email, String password) {
    this.email = email;
    Password = password;
  }

  public User() {
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String password) {
    Password = password;
  }
}
