package dao.entity;

import javax.persistence.*;

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
    Cart cart;

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


    public Visitor() {
    }
    //</editor-fold>
}
