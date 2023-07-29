// Покупатель
public class Customer {
  private String full_name;
  private int age;
  private String phone;

  public Customer(String full_name, int age, String phone) {
    this.full_name = full_name;
    this.age = age;
    this.phone = phone;
  }

  // Геттеры и сеттеры

  public String getfull_name() {
    return full_name;
  }

  public void setfull_name(String full_name) {
    this.full_name = full_name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getphone() {
    return phone;
  }

  public void setphone(String phone) {
    this.phone = phone;
  }
}