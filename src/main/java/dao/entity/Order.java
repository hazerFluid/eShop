package dao.entity;

import javax.persistence.*;
import java.util.List;

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
}
