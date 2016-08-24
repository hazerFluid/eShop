package dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderDetails")
public class OrderDetails {

    @Id
    @Column(name = "order_details_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "order", referencedColumnName = "order_id")
    private Order order;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product", referencedColumnName = "product_id")
    private Product product;

    @Column(name = "value", length = 20)
    private int value;

    @Column(name = "delivery_status", length = 20)
    private String deliveryStatus;

    //<editor-fold desc="GET/SET">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    //</editor-fold>

    //<editor-fold desc="Constructor">
    public OrderDetails(Order order, Product product, int value, String deliveryStatus) {
        this.order = order;
        this.product = product;
        this.value = value;
        this.deliveryStatus = deliveryStatus;
    }

    public OrderDetails() {
    }
    //</editor-fold>
}
