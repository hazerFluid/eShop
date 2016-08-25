package dao.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
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
    List<Product> products;

    //<editor-fold desc="GET/SET">

    //</editor-fold>

    //<editor-fold desc="Constructor">


    public Category() {}
    //</editor-fold>
}
