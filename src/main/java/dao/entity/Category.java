package dao.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "category") //
public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) //
    @JoinTable(name = "products_has_categories",
            joinColumns = @JoinColumn(name = "categoryID"),
            inverseJoinColumns = @JoinColumn(name = "productID"))
    private List<Product> products;

    //<editor-fold desc="GET/SET">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    //</editor-fold>

    //<editor-fold desc="Constructor">
    public Category(List<Product> products) {
        this.products = products;
    }

    public Category() {}
    //</editor-fold>


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
