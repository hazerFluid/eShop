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

    //</editor-fold>

    //<editor-fold desc="Constructors">


    public Client() {
    }
    //</editor-fold>
}
