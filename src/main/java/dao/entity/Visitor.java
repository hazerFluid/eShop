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



    //<editor-fold desc="GET/SET">


    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //</editor-fold>

    //<editor-fold desc="Constructor">

    public Visitor(Cart cart, String firstName, String lastName, String email, String password) {
        this.cart = cart;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

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
                Objects.equals(email, visitor.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}
