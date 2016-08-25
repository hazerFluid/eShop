package dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "cart") //
    private Visitor visitor;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "carts_has_products",
            joinColumns = @JoinColumn(name = "cartID"),
            inverseJoinColumns = @JoinColumn(name = "productID"))
    private List<Product> products;

    @OneToMany(mappedBy = "cart") //
    private List<Order> orders;


    //<editor-fold desc="GET/SET">


    //</editor-fold>

    //<editor-fold desc="Constructors">


    public Cart(){}
    //</editor-fold>
}
