package dao.entity;

import javax.persistence.*;

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
    public Parameter(float weight, float volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public Parameter() {
    }
    //</editor-fold>
}
