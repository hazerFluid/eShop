package dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "parameter")
public class ProductParameters {

    @Id
    @Column(name = "parameter_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
    public ProductParameters(float weight, float volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public ProductParameters() {
    }
    //</editor-fold>
}
