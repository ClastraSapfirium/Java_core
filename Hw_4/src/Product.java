public class Product {
  private String product_name;
  private double price;
  

  public Product(String product_name, double price) {
    this.product_name = product_name;
    this.price = price;
  }

  // Геттеры и сеттеры
  public String getproduct_name() {
    return product_name;
  }

  public void setproduct_name(String product_name) {
    this.product_name = product_name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}