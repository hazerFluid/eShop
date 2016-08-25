package dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "client_id")
public class Client extends Visitor {

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "birthday")
    @Temporal(value=TemporalType.DATE)
    private Date date;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private String house;

    @Column(name = "appartment")
    private int appartment;


    //<editor-fold desc="GET/SET">

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getAppartment() {
        return appartment;
    }

    public void setAppartment(int appartment) {
        this.appartment = appartment;
    }

    //</editor-fold>

    //<editor-fold desc="Constructors">

    public Client(String city, String country, Date date, String street, String house, int appartment) {
        this.city = city;
        this.country = country;
        this.date = date;
        this.street = street;
        this.house = house;
        this.appartment = appartment;
    }

    public Client(Cart cart, String firstName, String lastName, String email, String password, int administratorRights, String city, String country, Date date, String street, String house, int appartment) {
        super(cart, firstName, lastName, email, password, administratorRights);
        this.city = city;
        this.country = country;
        this.date = date;
        this.street = street;
        this.house = house;
        this.appartment = appartment;
    }

    public Client() {
    }
    //</editor-fold>
}
