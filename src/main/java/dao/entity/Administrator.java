package dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "administrator")
@PrimaryKeyJoinColumn(name = "administrator_id") //
public class Administrator extends Visitor {


    public Administrator() {
    }
}
