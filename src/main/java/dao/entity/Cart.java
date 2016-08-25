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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }


    //</editor-fold>

    //<editor-fold desc="Constructors">


    public Cart(Visitor visitor, List<Product> products, List<Order> orders) {
        this.visitor = visitor;
        this.products = products;
        this.orders = orders;
    }

    public Cart(){}
    //</editor-fold>

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id == cart.id &&
                Objects.equals(visitor, cart.visitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, visitor);
    }
}
