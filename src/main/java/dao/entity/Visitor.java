package dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "visitor")
@Inheritance(strategy = InheritanceType.JOINED)
public class Visitor {

    @Id
    @GeneratedValue
    @Column(name = "visitor_id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "administrator_rights", nullable = false)
    private int administratorRights;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart", referencedColumnName = "cart_id")
    private Cart cart;

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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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

    public int getAdministratorRights() {
        return administratorRights;
    }

    public void setAdministratorRights(int administratorRights) {
        this.administratorRights = administratorRights;
    }
    //</editor-fold>

    //<editor-fold desc="Constructor">
    public Visitor(String name, String secondName, String email, String password, int administratorRights) {
        this.name = name;
        this.secondName = secondName;
        this.email = email;
        this.password = password;
        this.administratorRights = administratorRights;
    }

    public Visitor() {
    }
    //</editor-fold>
}
