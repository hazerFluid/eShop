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

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)//
    private Cart cart;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL) //
    private List<Order> orders;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
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

    public boolean isAdministratorRights() {
        return administratorRights;
    }

    public void setAdministratorRights(boolean administratorRights) {
        this.administratorRights = administratorRights;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    //</editor-fold>

    //<editor-fold desc="Constructors">

    public Client() {
    }
    //</editor-fold>
}
