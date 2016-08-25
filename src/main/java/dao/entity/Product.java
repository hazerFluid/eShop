package dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "parameter")
    Parameter parameter;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "products_has_categories",
            joinColumns = @JoinColumn(name = "productID"),
            inverseJoinColumns = @JoinColumn(name = "categoryID"))
    List<Category> categories;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "carts_has_products",
            joinColumns = @JoinColumn(name = "productID"),
            inverseJoinColumns = @JoinColumn(name = "cartID"))
    List<Cart> carts;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "orrder_has_products",
            joinColumns = @JoinColumn(name = "productID"),
            inverseJoinColumns = @JoinColumn(name = "orrderID"))
    List<Order> orrders;

    @Column(name = "name")
    private String name;

    @Column(name = "in_stock")
    private int inStock;

    //<editor-fold desc="GET/SET">

    //</editor-fold>

    //<editor-fold desc="Constructor">

    public Product() {
    }
    //</editor-fold>

}

