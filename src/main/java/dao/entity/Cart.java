package dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "client")
    private Client client;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "carts_has_products",
            joinColumns = @JoinColumn(name = "cartID"),
            inverseJoinColumns = @JoinColumn(name = "productID"))
    private List<Product> products;

    //<editor-fold desc="GET/SET">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    //</editor-fold>

    //<editor-fold desc="Constructors">

    public Cart(){}
    //</editor-fold>

}
