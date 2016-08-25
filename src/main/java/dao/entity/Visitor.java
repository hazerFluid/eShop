package dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "visitor")
@Inheritance(strategy = InheritanceType.JOINED)
public class Visitor {

    @Id
    @GeneratedValue
    @Column(name = "visitor_id")
    private int id;

    @OneToOne
    @JoinColumn(name = "cart")       //
    private Cart cart;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "administrator_rights")
    private int administratorRights;

    //<editor-fold desc="GET/SET">

    //</editor-fold>

    //<editor-fold desc="Constructor">

    public Visitor(Cart cart, String firstName, String lastName, String email, String password, int administratorRights) {
        this.cart = cart;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.administratorRights = administratorRights;
    }

    public Visitor() {
    }
    //</editor-fold>


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitor visitor = (Visitor) o;
        return id == visitor.id &&
                administratorRights == visitor.administratorRights &&
                Objects.equals(email, visitor.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, administratorRights);
    }
}
