package dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "parameter")
    private Parameter parameter;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "carts_has_products",
            joinColumns = @JoinColumn(name = "productID"),
            inverseJoinColumns = @JoinColumn(name = "cartID"))
    private List<Cart> carts;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "orrder_has_products",
            joinColumns = @JoinColumn(name = "productID"),
            inverseJoinColumns = @JoinColumn(name = "orrderID"))
    private List<Order> orrders;

    @Column(name = "name")
    private String name;

    @Column(name = "in_stock")
    private int inStock;

    //<editor-fold desc="GET/SET">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Order> getOrrders() {
        return orrders;
    }

    public void setOrrders(List<Order> orrders) {
        this.orrders = orrders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

//</editor-fold>

    //<editor-fold desc="Constructor">


    public Product(Parameter parameter, Category category, List<Cart> carts, List<Order> orrders, String name, int inStock) {
        this.parameter = parameter;
        this.category = category;
        this.carts = carts;
        this.orrders = orrders;
        this.name = name;
        this.inStock = inStock;
    }

    public Product() {
    }
    //</editor-fold>


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", parameter=" + parameter +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", inStock=" + inStock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(parameter, product.parameter) &&
                Objects.equals(category, product.category) &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parameter, category, name);
    }
}

