package dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity //ready
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;                                     //id

    @Column(name = "name", unique = true)
    private String name;                                //product name

    @Column(name = "in_stock", nullable = false)
    private int inStock;                                //quantity in stock

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "category", referencedColumnName = "category_id")
    private Category category;                          //product categories

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "parameters", referencedColumnName = "parameter_id")
    private ProductParameters productParameters;        //product Parameters

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "carts_products_relations",
            joinColumns = @JoinColumn(name = "CART_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))
    private List<Cart> carts;

    //<editor-fold desc="GET/SET">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ProductParameters getProductParameters() {
        return productParameters;
    }

    public void setProductParameters(ProductParameters productParameters) {
        this.productParameters = productParameters;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
    //</editor-fold>

    //<editor-fold desc="Constructor">
    public Product(String name, int inStock, Category category, ProductParameters productParameters, List<Cart> carts) {
        this.name = name;
        this.inStock = inStock;
        this.category = category;
        this.productParameters = productParameters;
        this.carts = carts;
    }

    public Product(String name, int inStock) {
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
                ", name='" + name + '\'' +
                ", inStock=" + inStock +
                ", category=" + category +
                '}';
    }
}

