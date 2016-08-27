package dao.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue
    @Column(name = "client_id")
    private int id;

    @OneToOne(mappedBy = "client")//
    private Cart cart;

    @OneToMany(mappedBy = "client") //
    private List<Order> orders;

    @OneToOne(mappedBy = "client")
    private Adres adres;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "administrator_rights")
    private boolean administratorRights;

    @Column(name = "birthday")
    @Temporal(value=TemporalType.DATE)
    private Date date;






    //<editor-fold desc="GET/SET">



    //</editor-fold>

    //<editor-fold desc="Constructors">

    public Client() {
    }
    //</editor-fold>
}
