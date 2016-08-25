package dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "administrator")
@PrimaryKeyJoinColumn(name = "administrator_id") //
public class Administrator extends Visitor {


    //<editor-fold desc="Constructor">
    public Administrator(Cart cart, String firstName, String lastName, String email, String password, int administratorRights) {
        super(cart, firstName, lastName, email, password, administratorRights);
    }

    public Administrator() {
    }
    //</editor-fold>
}
