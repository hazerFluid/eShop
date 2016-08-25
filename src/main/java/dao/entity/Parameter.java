package dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "parameter") //
public class Parameter {

    @Id
    @Column(name = "parameter_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "parameter")
    private Product product;

    @Column
    private String brand;

    @Column(name = "weight")
    private float weight;

    @Column(name = "volume")
    private float volume;

    //<editor-fold desc="GET/SET">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    //</editor-fold>

    //<editor-fold desc="Constructor">

    public Parameter(Product product, String brand, float weight, float volume) {
        this.product = product;
        this.brand = brand;
        this.weight = weight;
        this.volume = volume;
    }

    public Parameter() {
    }
    //</editor-fold>


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameter parameter = (Parameter) o;
        return id == parameter.id &&
                Float.compare(parameter.weight, weight) == 0 &&
                Float.compare(parameter.volume, volume) == 0 &&
                Objects.equals(product, parameter.product) &&
                Objects.equals(brand, parameter.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, brand, weight, volume);
    }
}
