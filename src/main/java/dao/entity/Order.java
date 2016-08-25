package dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "orrder")
public class Order {

    @Id
    @Column(name = "orrder_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cart") //
    private Cart cart;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "orrder_has_products",
            joinColumns = @JoinColumn(name = "orrderID"),
            inverseJoinColumns = @JoinColumn(name = "productID"))
    List<Product> products;

    @Column(name = "value", length = 20)
    private int value;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "delivery_method")
    private String deliveryMethod;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "delivery_status", length = 20)
    private String deliveryStatus;

    //<editor-fold desc="GET/SET">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    //</editor-fold>

    //<editor-fold desc="Constructor">
    public Order(Cart cart, List<Product> products, int value, String paymentMethod, String deliveryMethod, String paymentStatus, String deliveryStatus) {
        this.cart = cart;
        this.products = products;
        this.value = value;
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
        this.paymentStatus = paymentStatus;
        this.deliveryStatus = deliveryStatus;
    }

    public Order() {
    }
    //</editor-fold>


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                value == order.value &&
                Objects.equals(cart, order.cart) &&
                Objects.equals(products, order.products) &&
                Objects.equals(paymentMethod, order.paymentMethod) &&
                Objects.equals(deliveryMethod, order.deliveryMethod) &&
                Objects.equals(paymentStatus, order.paymentStatus) &&
                Objects.equals(deliveryStatus, order.deliveryStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cart, products, value, paymentMethod, deliveryMethod, paymentStatus, deliveryStatus);
    }
}
