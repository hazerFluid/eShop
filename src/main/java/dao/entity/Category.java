package dao.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "category_name", unique = true)
    private String name;

    @OneToMany(mappedBy = "category", cascade = {CascadeType.ALL})
    private Set<Product> products;

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

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
    //</editor-fold>

    //<editor-fold desc="Constructor">
    public Category(String name, Set<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Category() {}
    //</editor-fold>
}
