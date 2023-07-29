import java.util.ArrayList;
import java.util.List;

public class App {
  private List<Customer> customers;
  private List<Product> products;
  private List<Order> orders;

  public App() {
    this.customers = new ArrayList<>();
    this.products = new ArrayList<>();
    this.orders = new ArrayList<>();
  }

  // Добавление покупателя в магазин
  public void addCustomer(Customer customer) {
    customers.add(customer);
  }

  // Добавление товара в магазин
  public void addProduct(Product product) {
    products.add(product);
  }

  // Создание заказа и добавление его в магазин
  public void makePurchase(Customer customer, Product product, int quantity) throws CustomerException, ProductException, AmountException {
    if (!customers.contains(customer)) {
      throw new CustomerException("Неправилный покупатель: " + customer.getfull_name());
    }

    if (!products.contains(product)) {
      throw new ProductException("Неправильный товар: " + product.getproduct_name());
    }

    if (quantity <= 0 || quantity > 100) {
      throw new AmountException("Неверное количество: " + quantity);
    }


    Order order = new Order(customer, product, quantity);
    orders.add(order);
  }

  // Вывод информации о каждом заказе
  public void printOrders() {
    for (Order order : orders) {
      Customer customer = order.getCustomer();
      Product product = order.getProduct();
      int quantity = order.getQuantity();

      System.out.println("Order Information:");
      System.out.println("Customer: " + customer.getfull_name());
      System.out.println("Product: " + product.getproduct_name());
      System.out.println("Quantity: " + quantity);
      System.out.println("--------------------");
    }
  }

  public static void main(String[] args) {
    App App = new App();

    // Добавление покупателей
    Customer customer1 = new Customer("Anna Rouse", 33, "6476777748");
    Customer customer2 = new Customer("Vladimir Vladimirovich", 65, "642891465");
    App.addCustomer(customer1);
    App.addCustomer(customer2);

    // Добавление товаров
    Product product1 = new Product("Вилка", 201.5);
    Product product2 = new Product("Ложка", 187.3);
    Product product3 = new Product("Черпак :)", 134.1);
    App.addProduct(product1);
    App.addProduct(product2);
    App.addProduct(product3);

    try {
      // Совершение покупок
      App.makePurchase(customer1, product1, 2);
      App.makePurchase(customer2, product2, 1);
      App.makePurchase(customer1, product3, 3);
    } catch (CustomerException | ProductException | AmountException ex) {
      System.out.println("Error: " + ex.getMessage());
    }

    // Вывод информации о заказах
    App.printOrders();
  }
}